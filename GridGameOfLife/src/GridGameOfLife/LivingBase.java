package GridGameOfLife;

import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

public class LivingBase extends Agent {
	
	public TickReturn MoveRight()
	{
		return Services.MoveByOne(this, 2);
	}

	public TickReturn GhostClose()
	{
		Grid grid = GridGoL.instance;
		GridPoint pos = grid.getLocation(this);

		int controlDistance = 5;
		
		for (int i = (controlDistance*-1)+1; i < controlDistance; i++) {
			for (int j = (controlDistance*-1)+1; j < controlDistance; j++) {
				Object temp = grid.getObjectAt(pos.getX() + i, pos.getY() + j);
				if (temp instanceof Dead) {
					return TickReturn.SUCCESS;
				}
			}
		}
		return TickReturn.FAILURE;
	}
	
//	public TickReturn AvoidGhost00()
//	{
//		Grid grid = GridGoL.instance;
//		GridPoint ghostPosition = null;
//		GridPoint agentPosition = grid.getLocation(this);
//		
//		for (Object obj : grid.getObjects()) {
//			if (obj instanceof Dead) {
//				ghostPosition = grid.getLocation(obj);
//			}
//		}
//		if (ghostPosition == null) {
//			return TickReturn.FAILURE;
//		}
//		if (ghostPosition.getX() > agentPosition.getX() ) {
//			return Services.MoveByOne(this, 6);
//		}
//		else
//		{
//			return Services.MoveByOne(this, 2);
//		}
//	}
	
	public TickReturn AvoidGhost()
	{
		Grid grid = GridGoL.instance;
		GridPoint ghostPosition = null;
		GridPoint me = grid.getLocation(this);

		GridPoint closestGhostPosition = null;
		double closestGhostDistance = -1;
		double tempDistance = 0;
		
		boolean twoGhostsAtSameDistance = false;
		
		for (Object obj : grid.getObjects()) {
			if (obj instanceof Dead) {
				ghostPosition = grid.getLocation(obj);
				tempDistance = Services.CalculateDistance(me,ghostPosition);
				if ( closestGhostDistance == tempDistance ) {
					twoGhostsAtSameDistance = true;
				}
				if ( closestGhostDistance > tempDistance || closestGhostPosition == null) {
					closestGhostDistance = tempDistance;
					closestGhostPosition = ghostPosition;
				}
			}
		}
		if(closestGhostPosition != null) {
			int direction = Services.EscapeDirection(me, closestGhostPosition);
			//System.out.println("EscapeDirection: "+direction+"    me:"+me.getX()+","+me.getY()+"       closest ghost:"+closestGhostPosition.getX()+","+closestGhostPosition.getY());
			//System.out.println(me.getX()+","+me.getY()+"   "+direction);
			if (twoGhostsAtSameDistance) {
				direction = (direction+1)%8;
				//System.out.println("same distance ghosts: "+direction);
			}
			return Services.MoveByOne(this, direction);
		}
		return TickReturn.FAILURE;
	}
	
	public TickReturn MoveRandomOneUnit()
	{
		return Services.MoveRandomByOne(this);
	}
}
