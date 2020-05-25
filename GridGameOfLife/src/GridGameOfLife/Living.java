package GridGameOfLife;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Living extends LivingBase {

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public TickReturn FallbackNode1() {
		TickReturn tickResult;

		tickResult = SequenceNode2();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		tickResult = MoveRandomByOne();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		return TickReturn.FAILURE;
	}

	public TickReturn SequenceNode2() {
		TickReturn tickResult;

		tickResult = GhostClose();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = AvoidGhost();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

}

