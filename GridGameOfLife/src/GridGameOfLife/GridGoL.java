package GridGameOfLife;

import repast.simphony.context.Context;
import repast.simphony.context.space.grid.GridFactory;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.SimpleGridAdder;
import repast.simphony.space.grid.WrapAroundBorders;

public class GridGoL implements ContextBuilder<Object> {

	public Context build(Context<Object> context) {
		context.setId("GridGameOfLife");

		GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);

		Grid<Object> grid = gridFactory.createGrid("grid", context,
				new GridBuilderParameters<Object>(new WrapAroundBorders(),
						new SimpleGridAdder<Object>(), false, 5, 5));

		int[][] livingAgentPos = {
			{2, 1},
			{2, 2},
			{2, 3}
		};
		for (int[] pos : livingAgentPos) {
			Living agent = new Living(grid);
			agent.x = pos[0]; agent.y = pos[1];
			context.add(agent);
			grid.moveTo(agent, pos[0], pos[1]);
		}

		int[][] deadAgentPos = {
			{0, 0},
			{1, 0},
			{2, 0},
			{4, 0},
			{3, 0},
			{4, 1},
			{3, 1},
			{1, 1},
			{0, 1},
			{0, 2},
			{1, 2},
			{0, 3},
			{1, 3},
			{0, 4},
			{1, 4},
			{2, 4},
			{3, 4},
			{4, 4},
			{4, 3},
			{3, 3},
			{3, 2},
			{4, 2}
		};
		for (int[] pos : deadAgentPos) {
			Dead agent = new Dead(grid);
			agent.x = pos[0]; agent.y = pos[1];
			context.add(agent);
			grid.moveTo(agent, pos[0], pos[1]);
		}

		return context;
	}
}

