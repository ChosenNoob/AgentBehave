package 49x-agentbehave;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Living extends LivingBase {

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public TickReturn EscapeorMove() {
		TickReturn tickResult;

		tickResult = EscapeGhost();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		tickResult = MoveRandomOneUnit();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		return TickReturn.FAILURE;
	}

	public TickReturn EscapeGhost() {
		TickReturn tickResult;

		tickResult = AvoidGhost();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = GhostClose();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

}

