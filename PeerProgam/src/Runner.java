
public class Runner {
	public static void main(String[] args) {

		rockpaper game = new rockpaper();

		String cont = "";

		for (int i = 0; cont != "Player has Quit" && i < 20; i++) {
			cont = (game.checkWin(game.playerInput(), game.computerInput()));
			System.out.println(cont);
		}

		System.out.println(game);
	}
}
