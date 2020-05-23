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
		}
		
		if (moveResult != null) {
			return TickReturn.RUNNING;
		}
		
		return TickReturn.FAILURE;
	}
	
	public static TickReturn MoveRandomByOne(Agent agent)
	{
		Random rand = new Random();
		int direction = rand.nextInt() % 8;
		return MoveByOne(agent, direction);
	}

}
