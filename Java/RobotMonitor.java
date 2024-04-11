public class RobotMonitor
{
   	// constant (ensure you have at least MAX)
	public static final int MAX = 6;
	public static final int MIN = 1;
   	
   	// variables
   	public static int col, row;
	public static Move move;
   	
	// attributes   
	public static int currentCol;
	public static int currentRow;
	// public static Move currentMove;
   	
	// invariant
	public boolean inv() 
   	{
        if (col >= MIN || col <= MAX || row >= MIN || row <= MAX && move == Move.LEFT || move == Move.RIGHT || move == Move.UP || move == Move.DOWN)
		{
			return true;
		}
		else
		{
			throw new VDMException("Precondition failed");
		}    
   	}
   	
   	// initialisation
   	public RobotMonitor()
   	{
		col = 1;
		row = 1;
		currentCol = col;
		currentRow = row;
		move = null;
		// currentMove = move;
   	}
   
   	//operations
   	public int GetCol()
	{
		col = currentCol;
		return col;
	}
	
	public int GetRow()
	{
        row = currentRow;
		return row;
	}
        
	public Move GetMove()
	{
		// move = currentMove;
		return move;
	}
	
   	public void MoveRight() 
   	{
		// precondition
		if (move != Move.RIGHT && col <= MAX && col >= MIN && col != 6) 
		{
		// postcondition
			currentCol++;
			move = Move.RIGHT;
		} 
		else 
		{
		// error
			throw new VDMException("Invalid move");
			
		}
	}
	
	
	public void MoveLeft() 
   	{
		// precondition
		if (col <= MAX && col >= MIN && move != Move.LEFT && col != 1) 
		{
		// postcondition
			currentCol--;
			move = Move.LEFT;
		} 
		else 
		{
		// error
			throw new VDMException("Invalid move");
		}          
	}
	
	public void MoveDown() 
   	{
		// precondition
		if (move != Move.DOWN && row <= MAX && row >= MIN  && row != 6)
		{
		// postcondition
			currentRow++;
			move = Move.DOWN;
		} 
		else 
		{
		// error
			throw new VDMException("Invalid move");
		}
	}
	
	public void MoveUp() 
   	{
		// precondition
		if (move != Move.UP && row <= MAX && row >= MIN  && row != 1)
		{
		// postcondition
			currentRow--;
			move = Move.UP;
		} 
		else 
		{
		// error
			throw new VDMException("Invalid move");
		}           
	}
	
	public void Exit()
   	{
		System.out.println("Exiting...");
		col = 1;
		row = 1;
		currentCol = col;
		currentRow = row;
		move = null;
		// currentMove = move;
		
   	}
        
	// toString method added
	public String toString()
	{
		// modify if you are using the text based tester
		return " ";
	}
}