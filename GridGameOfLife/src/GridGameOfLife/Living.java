package GridGameOfLife;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Living extends Agent {

	public Living(Grid<Object> grid) {
		super(grid);
	}

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public TickReturn FallbackNode1() {
		TickReturn tickResult;

		tickResult = this.SequenceNode1();
		if(tickResult == TickReturn.SUCCESS) {
			return TickReturn.SUCCESS;
		}
		if(tickResult == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}

		tickResult = Services.EatPills(this);
		if(tickResult == TickReturn.SUCCESS) {
			return TickReturn.SUCCESS;
		}
		if(tickResult == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}

		return TickReturn.FAILURE;
	}

	public TickReturn SequenceNode1() {
		TickReturn tickResult;

		tickResult = Services.GhostClose(this);
		if(tickResult == TickReturn.FAILURE) {
			return TickReturn.SUCCESS;
		}
		if(tickResult == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}

		tickResult = Services.AvoidGhost(this);
		if(tickResult == TickReturn.FAILURE) {
			return TickReturn.SUCCESS;
		}
		if(tickResult == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}

		return TickReturn.SUCCESS;
	}

}

