package GridGameOfLife;

import java.util.Random;

public class DeadBase extends Agent{
	
	public TickReturn MoveRight()
	{
		return Services.MoveByOne(this, 2);
	}
	
	public TickReturn MoveRandom()
	{
		return Services.MoveRandomByOne(this);
	}
}
