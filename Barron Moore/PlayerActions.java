import java.lang.Math;
import java.util.Scanner;
import java.text.*;
public class PlayerActions {
	public PlayerActions() {
		
	}


	public String movePlayer(int[][] map, int[] playerPos, int[] treasurePos) {
		int[] origPos = {0,0};
		int x = playerPos[0];
		int y = playerPos[1];
		origPos[0] = x;
		origPos[1] = y;
		if (readCompass(playerPos, treasurePos) == 0.00) {
			return "You have found the treasure! Congratualtions traveler";
			
		}
		else {
		System.out.println("The dial reads: '" + readCompass(playerPos, treasurePos) + "'m");
			String move = getPlayerInput();
			switch(move) {
				case "n":
					if ((playerPos[1]) > map.length - 2) {
						System.out.println("You are at the edge of the forest, choose another direction");
						movePlayer(map, playerPos, treasurePos);
					}
					else {
						playerPos[1] += 1;
						
					}
					break;
				case "e":
					if ((playerPos[0]) > map.length - 2) {
						System.out.println("You are at the edge of the forest, choose another direction");
						movePlayer(map, playerPos, treasurePos);
						
					}
					else{
						playerPos[0] += 1;
						
					}
					break;
				case "s":
					if ((playerPos[1]) < 1) {
						System.out.println("You are at the edge of the forest, choose another direction");
						movePlayer(map, playerPos, treasurePos);
					}
					else{
						playerPos[1] -= 1;
						
					}
					break;
				case "w":
					if ((playerPos[0]) < 1) {
						System.out.println("You are at the edge of the forest, choose another direction");
						movePlayer(map, playerPos, treasurePos);
					}
					else{
						playerPos[0] -= 1;
						
					}
					break;
					
				default:
					movePlayer(map, playerPos, treasurePos);
					break;
		
		}
		map[origPos[0]][origPos[1]] = 1;
		map[x][y] = 0;
		
		}
		return " ";
		}
							
	public Double readCompass(int[] playerPos, int[] treasurePos) {
		
		int width = Math.abs(playerPos[0]-treasurePos[0]);
		double height = Math.abs(playerPos[1]-treasurePos[1]);
		double goalDistanceSquared = Math.pow(width, 2) + Math.pow(height,  2);
		double goalDistance = Math.sqrt(goalDistanceSquared);
		return Math.round(goalDistance*100.0)/100.0;
		
		}
	
	public String getPlayerInput() {
		System.out.println("You can travel north, east, south or west");
		System.out.println("Which Direcetion would you like to go?");
		Scanner scanner = new Scanner(System.in);
		String movement = scanner.nextLine();
		movement = movement.substring(0, 1);
		return movement.toLowerCase();
		
		
		
		
		
		
	}

}




