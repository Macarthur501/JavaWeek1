import java.util.Random;

public class Computer implements Move {
	Computer(){
	}
	
	public String move() {
		String[] moves = {"r", "p", "s"};
		Random randomNum = new Random();
		int randomX = randomNum.nextInt(2);
		String computerMove = moves[randomX];
		return computerMove;
		
		
		
	}
	
}
