
public class RunnerClass {

	public static void main(String[] args) {
		String player1Input = "t";
		do {
			Game game1 = new Game();
			Person player1 = new Person();
			Computer player2 = new Computer();

			System.out.println(
					"Hello welcome to Rock, Paper, Scissors, How many games would you like to play (e.g. 1,4,10)");
			int numberOfGames = player1.gamesWanted();
			for (int i = 0; i < numberOfGames; i++) {
				player1Input = player1.move();
				String player2Input = player2.move();
				System.out.println("player picks: " + player1Input);
				if (player1Input.equals("q")) {
					break;
				}
				System.out.println("computer picks: " + player2Input);
				String result = game1.gamePlay(player1Input, player2Input);
				System.out.println("You have: " + result);

			}
			int totalGames = ((game1.totalPicks).size())/2;
			int totalWins = (game1.numberOfWins(game1.resultList))[0];
			int totalLoses = (game1.numberOfWins(game1.resultList))[2];
			int totalTies = (game1.numberOfWins(game1.resultList))[1];
			double winsPerc = totalWins*100/totalGames;
			double lossPerc = totalLoses*100/totalGames;
			double tiePerc = totalTies*100/totalGames;
			System.out.println("Number of games played: " + totalGames );
			System.out.println("Number of human wins: " + totalWins + " Percentage: " + winsPerc + "%" );
			System.out.println("Number of computer wins: " + totalLoses + " Percenetage: " + lossPerc + "%");
			System.out.println("Number of ties: " + totalTies + " Percentage: " + tiePerc + "%");
		} while (player1Input != "q");
	}
}