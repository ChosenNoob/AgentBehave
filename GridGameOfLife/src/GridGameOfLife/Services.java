package GridGameOfLife;

import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;
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

	public static TickReturn EatPills(Agent agent)
	{
		return TickReturn.SUCCESS;
	}
	
	public static TickReturn GhostClose(Agent agent)
	{
		return TickReturn.SUCCESS;
	}
	
	public static TickReturn AvoidGhost(Agent agent)
	{
		return TickReturn.SUCCESS;
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
