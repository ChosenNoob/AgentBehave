package 49x-agentbehave;

import repast.simphony.context.Context;
import repast.simphony.context.space.grid.GridFactory;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.SimpleGridAdder;
import repast.simphony.space.grid.WrapAroundBorders;

public class GridGoL extends GridBase implements ContextBuilder<Object> {

	public static Grid instance = null;

	public Context build(Context<Object> context) {
		context.setId("49x-agentbehave");

		GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);

		Grid<Object> grid = gridFactory.createGrid("grid", context,
				new GridBuilderParameters<Object>(new WrapAroundBorders(),
						new SimpleGridAdder<Object>(), false, 30, 30));
		instance = grid;
		super.build(context);

		int[][] livingAgentPos = {
			{13, 8},
			{22, 23}
		};

		for (int[] pos : livingAgentPos) {
			Living agent = new Living();
			context.add(agent);
			grid.moveTo(agent, pos[0], pos[1]);
		}

		int[][] deadAgentPos = {
			{4, 18},
			{0, 3},
			{19, 0},
			{29, 26}
		};

		for (int[] pos : deadAgentPos) {
			Dead agent = new Dead();
			context.add(agent);
			grid.moveTo(agent, pos[0], pos[1]);
		}

		return context;
	}
}

