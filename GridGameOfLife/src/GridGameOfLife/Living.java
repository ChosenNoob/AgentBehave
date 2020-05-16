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

		if(this.SequenceNode1() == TickReturn.SUCCESS) {
			return TickReturn.SUCCESS;
		}
		if(this.SequenceNode1() == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}
		if(Services.null(this) == TickReturn.SUCCESS) {
			return TickReturn.SUCCESS;
		}
		if(Services.null(this) == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}
		return TickReturn.FAILURE;
	}
	public TickReturn SequenceNode1() {

		if(Services.null(this) == TickReturn.FAILURE) {
			return TickReturn.FAILURE;
		}
		if(Services.null(this) == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}
		if(Services.null(this) == TickReturn.FAILURE) {
			return TickReturn.FAILURE;
		}
		if(Services.null(this) == TickReturn.RUNNING) {
			return TickReturn.RUNNING;
		}
		return TickReturn.SUCCESS;
	}
	}
}

