package GridGameOfLife;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Replacer {
	private static Replacer instance = null;
	private List<Agent[]> orders = new ArrayList<Agent[]>();
	
	public static Replacer getInstance()
	{
		if (instance == null) {
			instance = new Replacer();
		}
		return instance;
	}
	
	public static void order(Agent oldAgent, Agent newAgent)
	{
		Replacer instance = Replacer.getInstance();
		Agent[] order = new Agent[] {oldAgent, newAgent};
		instance.orders.add(order);
	}

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public void replace()
	{
		for (Agent[] order : orders) {
			Agent oldAgent = order[0];
			Agent newAgent = order[1];
			GridPoint gpt = oldAgent.grid.getLocation(oldAgent);
			Context<Object> context = ContextUtils.getContext(oldAgent);
			context.remove(oldAgent);

			context.add(newAgent);
			newAgent.grid.moveTo(newAgent, gpt.getX(), gpt.getY());
		}
		orders = new ArrayList<Agent[]>();
	}
}