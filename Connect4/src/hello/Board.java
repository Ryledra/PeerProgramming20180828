package hello;

public class Board {
	private int[][] grid = new int[7][7]; // 0 = unselected, 1 = player1, 2 = player2;
	private Player[] players = new Player[2];
	
	public Board()	{
		for (int i = 0; i < grid.length; i++)	{
			for (int j = 0; j < grid[i].length; j++)	{
				grid[i][j] = 0;
			}
		}
		players[0] = new Player(1);
		players[1] = new Player(2);
	}
	
	public String toString()	{
		
		String out = "";
		
		for (int i = 0; i < grid.length; i++)	{
			out += i + " ";
			for (int j = 0; j < grid[i].length; j++)	{
				switch (grid[i][j])	{
				case 0:
					out += "-";
					break;
				case 1:
					out += players[0];
					break;
				case 2:
					out += players[1];
					break;
				}
				out += " ";
			}
			out += "\n";
		}
		out += "  0 1 2 3 4 5 6\n";
		return out;
	}
}
