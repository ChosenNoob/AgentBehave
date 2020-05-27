package 49x-agentbehave;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.query.space.grid.MooreQuery;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Dead extends DeadBase {

	@ScheduledMethod(start = 1, interval = 1, priority = 1)
	public TickReturn ChaseandDestroy() {
		TickReturn tickResult;

		tickResult = ChaseorMove();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = DestroyRobotifBusted();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = AnyRobotLeft();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

	public TickReturn ChaseorMove() {
		TickReturn tickResult;

		tickResult = ChaseNearbyRobots();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		tickResult = MoveRandomTwoUnits();
		if(tickResult != TickReturn.FAILURE) {
			return tickResult;
		}

		return TickReturn.FAILURE;
	}

	public TickReturn ChaseNearbyRobots() {
		TickReturn tickResult;

		tickResult = RobotClose();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = ApproachRobot();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

	public TickReturn DestroyRobotifBusted() {
		TickReturn tickResult;

		tickResult = RobotBusted();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		tickResult = DestroyRobot();
		if(tickResult != TickReturn.SUCCESS) {
			return tickResult;
		}

		return TickReturn.SUCCESS;
	}

}

