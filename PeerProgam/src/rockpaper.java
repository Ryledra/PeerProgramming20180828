import java.util.Scanner;
import java.util.Random;

public class rockpaper {

	private int gamesPlayed = 0;
	private int computerWins = 0;
	private int humanWins = 0;
	private int tie = 0;
	private int rock = 0, paper = 0, scissors = 0;
	
	public String playerInput() {
		Scanner sc = new Scanner(System.in);

		String move = ""; //Doesn't like being left NOT NULL
		do {
			System.out.println("Enter Your Move");
			move = sc.nextLine();
		} while (!(move.equals("Rock") || move.equals("Paper") || move.equals("Scissors") ||move.equals("Quit")));

		return move;
	}
	
	public String computerInput()	{
		Random rand = new Random();
		int game = rand.nextInt(3);

		String computerOutput = "";
		// make computer variable
		switch (game) {
		case 0:
			computerOutput = "Rock";
			System.out.println("Rock");
			break;
		// etc.
		case 1:
			computerOutput = "Paper";
			System.out.println("Paper");
			break;
		case 2:
			computerOutput = "Scissors";
			System.out.println("Scissors");
			break;
		default:
			System.out.println("Computer is a cheater!");
			break;
		}
		return computerOutput;
	}
	
	public String checkWin(String player, String computer)	{
		setGamesPlayed(getGamesPlayed() + 1);
		
		if (player.equals("Rock")) setRock(getRock() + 1);
		else if (player.equals("Paper")) setPaper(getPaper() + 1);
		else if (player.equals("Scissors")) setScissors(getScissors() + 1);
		
		if (computer.equals("Rock")) setRock(getRock() + 1);
		else if (computer.equals("Paper")) setPaper(getPaper() + 1);
		else if (computer.equals("Scissors")) setScissors(getScissors() + 1);
		
		String out = "";
		
		if(player.equals("Quit"))	out = "Player has Quit";
		if (player.equals(computer))	out = "Draw";
		else if (player.equals("Rock"))	{
			if (computer.equals("Paper")) out = "Computer Wins!";
			if (computer.equals("Scissors")) out = "Player Wins!";
		}
		else if (player.equals("Paper"))	{
			if (computer.equals("Rock")) out = "Player Wins!";
			if (computer.equals("Scissors")) out = "Computer Wins!";
		}
		else if (player.equals("Scissors"))	{
			if (computer.equals("Paper")) out = "Player Wins!";
			if (computer.equals("Rock")) out = "Computer Wins!";
		}
		
		if (out.equals("Player Wins!")) setHumanWins(getHumanWins() + 1);
		else if (out.equals("Computer Wins!")) setComputerWins(getComputerWins() + 1);
		else setTie(getTie() + 1);
		
		return out;
	}
	
	public String toString()	{
		
		String out = "";
		
		out += "Game Ended. Stats as follows:\n";
		out += "Total games played: " + getGamesPlayed() + "\n";
		out += "Computer wins: " + getComputerWins() + ", "
				+ (float) 100 * getComputerWins() / getGamesPlayed() + "%\n";
		out += "Player wins: " + getHumanWins() + ", "
				+ (float) 100 * getHumanWins() / getGamesPlayed() + "%\n";
		out += "Ties: " + getTie() + ", " + (float) 100 * getTie() / getGamesPlayed() + "%\n";

		if (getRock() > getPaper() && getRock() > getScissors()) {
			out += "Rock was the most popular choice.";
		} else if (getPaper() > getRock() && getPaper() > getScissors()) {
			out += "Paper was the most popular choice.";
		} else if (getScissors() > getRock() && getScissors() > getPaper()) {
			out += "Scissors was the most popular choice.";
		} else
			out += "I can't be asked to fill in the rest D:";
		
		return out;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getComputerWins() {
		return computerWins;
	}

	public void setComputerWins(int computerWins) {
		this.computerWins = computerWins;
	}

	public int getHumanWins() {
		return humanWins;
	}

	public void setHumanWins(int humanWins) {
		this.humanWins = humanWins;
	}

	public int getTie() {
		return tie;
	}

	public void setTie(int tie) {
		this.tie = tie;
	}

	public int getRock() {
		return rock;
	}

	public void setRock(int rock) {
		this.rock = rock;
	}

	public int getPaper() {
		return paper;
	}

	public void setPaper(int paper) {
		this.paper = paper;
	}

	public int getScissors() {
		return scissors;
	}

	public void setScissors(int scissors) {
		this.scissors = scissors;
	}

}
