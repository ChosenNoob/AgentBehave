package GridGameOfLife;

import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;
import repast.simphony.context.Context;

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

	public static int getDeadNeighborCount(Agent agent)
	{
		MooreQuery<Object> query = new MooreQuery<Object>(agent.grid, agent);
		int count = 0;
		for (Object o : query.query()) {
			if (o instanceof Dead) {
				count++;
			}
		}
		return count;
	}

	public static boolean shouldDie(Agent agent)
	{
		int livingCount = getLivingNeighborCount(agent);
		if (livingCount == 2 || livingCount == 3) {
			return false;
		}
		System.out.print(agent.x);System.out.print(agent.y);
		System.out.println(livingCount);
		return true;
	}
	
	public static boolean shouldRevive(Agent agent)
	{
		int livingCount = getLivingNeighborCount(agent);
		if (livingCount == 3) {
			System.out.print(agent.x);System.out.print(agent.y);
			System.out.println(livingCount);
			return true;
		}
		return false;
	}
	
	public static void die(Agent agent)
	{
		GridPoint gpt = agent.grid.getLocation(agent);
		Context<Object> context = ContextUtils.getContext(agent);
		context.remove(agent);

		Dead newAgent = new Dead(agent.grid);
		context.add(newAgent);
		newAgent.grid.moveTo(newAgent, gpt.getX(), gpt.getY());
	}
	
	public static void revive(Agent agent)
	{
		GridPoint gpt = agent.grid.getLocation(agent);
		Context<Object> context = ContextUtils.getContext(agent);
		context.remove(agent);

		Living newAgent = new Living(agent.grid);
		context.add(newAgent);
		newAgent.grid.moveTo(newAgent, gpt.getX(), gpt.getY());
	}
}
