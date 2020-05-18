package GridGameOfLife;

import java.util.Random;

public class DeadBase extends Agent{
	public TickReturn MoveRandomByOne()
	{
		return Services.MoveRandomByOne(this);
	}
}
