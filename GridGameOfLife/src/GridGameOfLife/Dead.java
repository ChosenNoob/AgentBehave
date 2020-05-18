package GridGameOfLife;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Dead extends DeadBase {

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public TickReturn FallbackNode2() {
		TickReturn tickResult;

		tickResult = MoveRandomByOne();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		return TickReturn.FAILURE;
	}

}

