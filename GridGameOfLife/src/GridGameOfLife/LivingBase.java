package GridGameOfLife;

import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

public class LivingBase extends Agent {
	
	public TickReturn ShouldDie()
	{
		int livingNeighborCount = Services.getLivingNeighborCount(this);
		if (livingNeighborCount == 1 || livingNeighborCount > 3) {
			return TickReturn.SUCCESS;
		}
		return TickReturn.RUNNING;
	}
	
	public TickReturn Die()
	{
		Replacer.order(this, new Dead());
		return TickReturn.SUCCESS;
	}
	
	public TickReturn GhostClose()
	{
		Grid grid = GridGoL.instance;
		GridPoint pos = grid.getLocation(this);

		for (int i = -4; i < 5; i++) {
			for (int j = -4; j < 5; j++) {
				Object temp = grid.getObjectAt(pos.getX() + i, pos.getY() + j);
				if (temp instanceof Dead) {
					return TickReturn.SUCCESS;
				}
			}
		}
		return TickReturn.FAILURE;
	}
	
	public TickReturn AvoidGhost()
	{
		Grid grid = GridGoL.instance;
		GridPoint ghostPosition = null;
		GridPoint agentPosition = grid.getLocation(this);
		
		for (Object obj : grid.getObjects()) {
			if (obj instanceof Dead) {
				ghostPosition = grid.getLocation(obj);
			}
		}
		if (ghostPosition == null) {
			return TickReturn.FAILURE;
		}
		if (ghostPosition.getX() > agentPosition.getX() ) {
			return Services.MoveByOne(this, 6);
		}
		else
		{
			return Services.MoveByOne(this, 2);
		}
	}
	
	public TickReturn MoveRandomByOne()
	{
		return Services.MoveRandomByOne(this);
	}
}
