import java.util.Random;
public class Map {
	public Map() {
		
	}


	public String descriptionOfWakeUp() {
		return "You awaken in a dank swamp..... All you can smell are sinister, toxic fumes that surround the large clearing you've found yourself in."
				+ " A gold compass is attached to a string round your neck, it's dial points at a constant direction but it is not north, intrigued by this"
				+ " you get up and decide to follow its course.....";
	}
	public int[][] genearteMap(int mapSize) {
		int[][] map;
		map = new int[mapSize][mapSize];
		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				map[i][j] = 1;
				}
		}
		return map;
		
		}
	public void placePlayerInCentre(int[][] map){
		// 0 integer represents the player in the array
		map[(map.length)/2 -1][(map.length)/2 -1] = 0;
		
		
	}
	
	
	public int[] placeRandomTreasure(int[][] map) {
		int[] treasurePos = {0,0};
		int x = map.length/2 -1;
		int y = map.length/2 -1;
		while (x == map.length/2 -1 & y == map.length/2 -1) {
			Random randomNum = new Random();
			int randomX = randomNum.nextInt(map.length -1);
			x = randomX;
			int randomY = randomNum.nextInt(map.length -1);
			y = randomY;
		}
		// the integer 2 represents the treasure
		treasurePos[0] = x;
		treasurePos[1] = y;
		map[x][y] = 2;
		return treasurePos;
			
			}
			
	public int[] playerPositon(int[][] map) {
		int [] playerPosition = {map.length/2 -1,map.length/2 -1};
			
		return playerPosition;
				}
					
					
					
				
			
				
		
	}
	


