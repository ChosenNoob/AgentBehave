package GridGameOfLife;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Living extends LivingBase {

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public TickReturn SequenceNode1() {
		TickReturn tickResult;

		tickResult = ShouldDie();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = Die();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

}

