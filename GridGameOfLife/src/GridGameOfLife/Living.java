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
	public void run() {
		if(Services.shouldDie(this)) {
			Services.die(this);
		}
	}
}

