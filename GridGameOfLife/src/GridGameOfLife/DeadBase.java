package GridGameOfLife;

import java.util.Random;

import repast.simphony.context.Context;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class DeadBase extends Agent{
	
	public TickReturn MoveRight()
	{
		return Services.MoveByOne(this, 2);
	}
	
	public TickReturn MoveRandomTwoUnits()
	{
		Services.MoveRandomByOne(this);
		return Services.MoveRandomByOne(this);
	}
	
	
	public TickReturn ApproachRobot()
	{
		Grid grid = GridGoL.instance;
		GridPoint me = grid.getLocation(this);
		GridPoint robotPosition = null;
		
		GridPoint closestRobotPosition = null;
		double closestRobotDistance = -1;
		double tempDistance = 0;
		Object closestRobotObject = null;
		
		for (Object obj : grid.getObjects()) {
			if (obj instanceof Living) {
				robotPosition = grid.getLocation(obj);
				tempDistance = Services.CalculateDistance(me,robotPosition);
				if ( closestRobotDistance > tempDistance || closestRobotPosition == null) {
					closestRobotObject = obj;
					closestRobotDistance = tempDistance;
					closestRobotPosition = robotPosition;
				}
			}
		}
		if(closestRobotPosition != null) {
//			if (closestRobotDistance < 2) {
//				//	EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE
//				Context<Object> context = ContextUtils.getContext(closestRobotObject);
//				context.remove(closestRobotObject);
//			}
			int direction = Services.TargetDirection(me, closestRobotPosition);
			//System.out.println(me.getX()+","+me.getY()+"    closestRobot: "+closestRobotPosition.getX()+","+closestRobotPosition.getY()+"   "+direction);
			Services.MoveByOne(this, direction);
			return TickReturn.SUCCESS;
		}
		return TickReturn.FAILURE;
	}
	
	public TickReturn AnyRobotLeft()
	{
		Grid grid = GridGoL.instance;
		
		for (Object obj : grid.getObjects()) {
			if (obj instanceof Living) {
				return TickReturn.SUCCESS;
			}
		}
		return TickReturn.FAILURE;
	}
	
	public TickReturn RobotBusted() {
		Grid grid = GridGoL.instance;
		GridPoint me = grid.getLocation(this);
		GridPoint robotPosition = null;
		
		GridPoint closestRobotPosition = null;
		double closestRobotDistance = -1;
		double tempDistance = 0;
		Object closestRobotObject = null;
		
		for (Object obj : grid.getObjects()) {
			if (obj instanceof Living) {
				robotPosition = grid.getLocation(obj);
				tempDistance = Services.CalculateDistance(me,robotPosition);
				if ( closestRobotDistance > tempDistance || closestRobotPosition == null) {
					closestRobotObject = obj;
					closestRobotDistance = tempDistance;
					closestRobotPosition = robotPosition;
				}
			}
		}
		if(closestRobotPosition != null && closestRobotDistance < 2) {
			return TickReturn.SUCCESS;
		}
		return TickReturn.FAILURE;
	}
	
	public TickReturn DestroyRobot()
	{
		Grid grid = GridGoL.instance;
		GridPoint me = grid.getLocation(this);
		GridPoint robotPosition = null;
		
		GridPoint closestRobotPosition = null;
		double closestRobotDistance = -1;
		double tempDistance = 0;
		Object closestRobotObject = null;
		
		for (Object obj : grid.getObjects()) {
			if (obj instanceof Living) {
				robotPosition = grid.getLocation(obj);
				tempDistance = Services.CalculateDistance(me,robotPosition);
				if ( closestRobotDistance > tempDistance || closestRobotPosition == null) {
					closestRobotObject = obj;
					closestRobotDistance = tempDistance;
					closestRobotPosition = robotPosition;
				}
			}
		}
		if(closestRobotPosition != null && closestRobotDistance < 2) {
			//	EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE EAT ROBOT HERE
			Context<Object> context = ContextUtils.getContext(closestRobotObject);
			context.remove(closestRobotObject);
			return TickReturn.SUCCESS;
		}
		return TickReturn.FAILURE;
	}
	
	public TickReturn RobotClose() {
		Grid grid = GridGoL.instance;
		GridPoint pos = grid.getLocation(this);

		int controlDistance = 8;
		
		for (int i = (controlDistance*-1)+1; i < controlDistance; i++) {
			for (int j = (controlDistance*-1)+1; j < controlDistance; j++) {
				Object temp = grid.getObjectAt(pos.getX() + i, pos.getY() + j);
//				if (temp instanceof Living) {
//					System.out.println("RobotClose        me: "+pos.getX()+","+pos.getY()+"       other: "+(pos.getX() + i)+","+( pos.getY() + j));
//					return TickReturn.SUCCESS;
//				}
				if (temp instanceof Living && (pos.getX() + i)>=0 && ( pos.getY() + j) >= 0 ) {
					return TickReturn.SUCCESS;
				}
			}
		}
		return TickReturn.FAILURE;
	}

}
