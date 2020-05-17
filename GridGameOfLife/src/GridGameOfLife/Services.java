package GridGameOfLife;

import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

import java.awt.geom.Point2D;
import java.time.Instant;
import java.util.Random;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;

public class Services {
	public static void moveLeft(Agent agent)
	{
		agent.grid.moveTo(agent, --agent.x, agent.y);
	}
	
	public static int getLivingNeighborCount(Agent agent)
	{
		MooreQuery<Object> query = new MooreQuery<Object>(agent.grid, agent);
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
		GridPoint moveResult;
		
		switch (direction) {
		case 0:
			moveResult = agent.grid.moveByDisplacement(agent, 0, 1);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		case 1:
			moveResult = agent.grid.moveByDisplacement(agent, 1, 1);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		case 2:
			moveResult = agent.grid.moveByDisplacement(agent, 1, 0);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		case 3:
			moveResult = agent.grid.moveByDisplacement(agent, 1, -1);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		case 4:
			moveResult = agent.grid.moveByDisplacement(agent, 0, -1);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		case 5:
			moveResult = agent.grid.moveByDisplacement(agent, -1, -1);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		case 6:
			moveResult = agent.grid.moveByDisplacement(agent, -1, 0);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		case 7:
			moveResult = agent.grid.moveByDisplacement(agent, -1, 1);
			if (moveResult != null) {
				return TickReturn.RUNNING;
			}
			break;
		}

		return TickReturn.FAILURE;
	
	}
	
	public static TickReturn MoveRandomByOne(Agent agent)
	{
		Random rand = new Random();
		int direction = rand.nextInt() % 8;
		System.out.print(agent.getClass());
		System.out.println(direction);
		return MoveByOne(agent, direction);
	}
	
	public static TickReturn GhostClose(Agent agent)
	{
		GridPoint pos = agent.grid.getLocation(agent);
		for (int i = -4; i < 5; i++) {
			for (int j = -4; j < 5; j++) {
				Object temp = agent.grid.getObjectAt(pos.getX() + i, pos.getY() + j);
				if (temp instanceof Dead) {
					return TickReturn.SUCCESS;
				}
			}
		}
		return TickReturn.FAILURE;
	}
	
	public static TickReturn AvoidGhost(Agent agent)
	{
		GridPoint ghostPosition = null;
		GridPoint agentPosition = agent.grid.getLocation(agent);
		
		for (Object obj : agent.grid.getObjects()) {
			if (obj instanceof Dead) {
				ghostPosition = agent.grid.getLocation(obj);
			}
		}
		if (ghostPosition == null) {
			return TickReturn.FAILURE;
		}
		if (ghostPosition.getX() > agentPosition.getX() ) {
			return MoveByOne(agent, 6);
		}
		else
		{
			return MoveByOne(agent, 2);
		}
	}
	public static boolean shouldDie(Agent agent)
	{
		int livingCount = getLivingNeighborCount(agent);
		if (livingCount == 2 || livingCount == 3) {
			return false;
		}
		return true;
	}
	
	public static boolean shouldRevive(Agent agent)
	{
		int livingCount = getLivingNeighborCount(agent);
		if (livingCount == 3) {
			return true;
		}
		return false;
	}
	
	public static void die(Agent agent)
	{
		Replacer.order(agent, new Dead(agent.grid));
	}
	
	public static void revive(Agent agent)
	{
		Replacer.order(agent, new Living(agent.grid));
	}
}
