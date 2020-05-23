package GridGameOfLife;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Dead extends DeadBase {

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public TickReturn SequenceNode3() {
		TickReturn tickResult;

		tickResult = SequenceNode1();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = FallbackNode1();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = SequenceNode2();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

	public TickReturn SequenceNode1() {
		TickReturn tickResult;

		tickResult = ShouldDie();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

	public TickReturn FallbackNode1() {
		TickReturn tickResult;

		tickResult = null();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		return TickReturn.FAILURE;
	}

	public TickReturn SequenceNode2() {
		TickReturn tickResult;

		tickResult = Revive();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = ShouldRevive();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

}

