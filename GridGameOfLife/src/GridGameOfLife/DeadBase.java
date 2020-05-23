package GridGameOfLife;

import java.util.Random;

public class DeadBase extends Agent{
	
	public TickReturn ShouldRevive()
	{
		int livingNeighborCount = Services.getLivingNeighborCount(this);
		if (livingNeighborCount == 3) {
			return TickReturn.SUCCESS;
		}
		return TickReturn.RUNNING;
	}
	
	public TickReturn Revive()
	{
		Replacer.order(this, new Living());
		return TickReturn.SUCCESS;
	}
}
