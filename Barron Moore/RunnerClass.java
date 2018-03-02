import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) {
		boolean gameCurrent = true;
		do {
			
			Map game1 = new Map();
			System.out.println("How large would you like the game map to be? e.g enter: 10 for 10x10 or 78 for 78x78, the larger map the harder to find the treasure!");
			Scanner scanner = new Scanner(System.in);
			int mapSize = scanner.nextInt();
			int [][] thisMap = game1.genearteMap(mapSize);
			game1.placePlayerInCentre(thisMap);
			int [] treasurePos = game1.placeRandomTreasure(thisMap);
			int [] playerPos = game1.playerPositon(thisMap);
			PlayerActions player1 = new PlayerActions();
			String holder = " ";
			System.out.println(game1.descriptionOfWakeUp());
			//System.out.println(holder.indexOf(condition));
			while(holder != "You have found the treasure! Congratualtions traveler") {
				player1.movePlayer(thisMap,playerPos, treasurePos);
				holder = player1.movePlayer(thisMap, playerPos, treasurePos);
				System.out.println(holder);
				
			gameCurrent = false;
			}}
		while(gameCurrent);
		
}}
