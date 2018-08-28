package hello;

public class Player {
	private int playerNo;
	
	public Player(int player)	{
		playerNo = player;
	}
	
	public String toString()	{
		if (playerNo == 1) return "X";
		else return "O";
	}
	
	public int getPlayerNo()	{
		return playerNo;
	}
}
