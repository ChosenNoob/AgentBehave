package GridGameOfLife;

import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

import java.awt.geom.Point2D;
import java.time.Instant;
import java.util.Random;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;

public class Services {

	public static int getLivingNeighborCount(Agent agent)
	{
		Grid grid = GridGoL.instance; 
		MooreQuery<Object> query = new MooreQuery<Object>(grid, agent);
		int count = 0;
		for (Object o : query.query()) {
			if (o instanceof Living) {
				count++;
			}
		}
		return count;
	}
	
	public static TickReturn MoveByOne(Agent agent, int direction)
	{
		GridPoint moveResult = null;
		Grid grid = GridGoL.instance;
		
		switch (direction) {
		case 0:
			moveResult = grid.moveByDisplacement(agent, 0, 1);
			break;
		case 1:
			moveResult = grid.moveByDisplacement(agent, 1, 1);
			break;
		case 2:
			moveResult = grid.moveByDisplacement(agent, 1, 0);
			break;
		case 3:
			moveResult = grid.moveByDisplacement(agent, 1, -1);
			break;
		case 4:
			moveResult = grid.moveByDisplacement(agent, 0, -1);
			break;
		case 5:
			moveResult = grid.moveByDisplacement(agent, -1, -1);
			break;
		case 6:
			moveResult = grid.moveByDisplacement(agent, -1, 0);
			break;
		case 7:
			moveResult = grid.moveByDisplacement(agent, -1, 1);
			break;
		default:
			System.out.println("No Move");
			System.out.println(direction);
			break;
		}
		
		if (moveResult != null) {
			return TickReturn.RUNNING;
		}
		
		return TickReturn.FAILURE;
	}
	
	public static TickReturn MoveRandomByOne(Agent agent)
	{
		Random rand = new Random();
		int direction = Math.abs(rand.nextInt()) % 8;
		return MoveByOne(agent, direction);
	}
	
	public static double CalculateDistance(GridPoint p1, GridPoint p2) {
		double distance = Math.sqrt(Math.pow(p1.getX()-p2.getX() , 2) + Math.pow(p1.getY()-p2.getY(), 2));
		return distance;
	}
	
	public static int EscapeDirection(GridPoint me, GridPoint enemy) {	
		if(me.getX() == enemy.getX()) {	
			if(me.getY() == enemy.getY()) {
				System.out.println("EscapeDirection returns 8");
				return 8;		//do not move, busted
			}else if(me.getY() < enemy.getY()) {
				return 4;
			}else {
				return 0;
			}
		}else if(me.getX() < enemy.getX()) {
			if(me.getY() == enemy.getY()) {
				return 6;
			}else if(me.getY() < enemy.getY()) {
				return 5;
			}else {
				return 7;
			}
		}else{
			if(me.getY() == enemy.getY()) {
				return 2;
			}else if(me.getY() < enemy.getY()) {
				return 3;
			}else {
				return 1;
			}
		}
	}
	
	public static int TargetDirection(GridPoint me, GridPoint enemy) {
		//System.out.println("TargetDirection   me:"+me.getX()+","+me.getY()+"       closest :"+enemy.getX()+","+enemy.getY());
		if(me.getX() == enemy.getX()) {	
			if(me.getY() == enemy.getY()) {
				System.out.println("TargetDirection returns 8");
				return 8;		//do not move, busted
			}else if(me.getY() < enemy.getY()) {
				return 0;
			}else {
				return 4;
			}
		}else if(me.getX() < enemy.getX()) {
			if(me.getY() == enemy.getY()) {
				return 2;
			}else if(me.getY() < enemy.getY()) {
				return 1;
			}else {
				return 3;
			}
		}else{
			if(me.getY() == enemy.getY()) {
				return 6;
			}else if(me.getY() < enemy.getY()) {
				return 7;
			}else {
				return 5;
			}
		}
	}

}
