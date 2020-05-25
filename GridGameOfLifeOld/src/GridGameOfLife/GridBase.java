package GridGameOfLife;

import repast.simphony.context.Context;
import repast.simphony.dataLoader.ContextBuilder;

public class GridBase {
	public Context build(Context<Object> context)
	{
		Replacer.removeInstance();
		context.add(Replacer.getInstance());
		return context;
	}
}
