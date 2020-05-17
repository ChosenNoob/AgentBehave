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
						new SimpleGridAdder<Object>(), false, 10, 10));

		int[][] livingAgentPos = {
			{5, 4}
		};
		for (int[] pos : livingAgentPos) {
			Living agent = new Living(grid);
			agent.x = pos[0]; agent.y = pos[1];
			context.add(agent);
			grid.moveTo(agent, pos[0], pos[1]);
		}

		int[][] deadAgentPos = {
			{4, 1}
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

