import java.util.ArrayList;
import java.util.List;

public class Game {
	Game(){
	}
	List<String> totalPicks = new ArrayList<String>();
	List<String> resultList = new ArrayList<String>();

	public String humanMoveRock(String cMove) {
		String result = " ";
		switch(cMove) {
		
			case "r":
				result = "Tied";
				break;
			
			case "s":
				result = "Won";
				break;
			
			case "p":
				result = "Lost";
				break;
		}
		return result;
	}
		
	public String humanMoveScissors(String cMove) {
		String result = " ";
		switch(cMove) {
		
		case "r":
			result = "Lost";
			
			break;
		case "s":
			result = "Tied";
			
			break;
		case "p":
			result = "Won";
			break;
		}
		return result;
	}

	public String humanMovePaper(String cMove) {
		String result = " ";
		switch(cMove) {
		
		case "r":
			result = "Won";
			break;
			
		case "s":
			result = "Lost";
			break;
			
		case "p":
			result = "Tied";
			break;
		}
		return result;
	}

	public String gamePlay(String hMove, String cMove) {
		totalPicks.add(hMove);
		totalPicks.add(cMove);
		String result = " ";
		switch(hMove) {
		case "r":
			result = humanMoveRock(cMove);
			break;
		case "s":
			result = humanMoveScissors(cMove);
			break;
		case "p":
			result = humanMovePaper(cMove);
			break;
		
		}
		resultList.add(result);
		return result;
			
			
			
		}
	public int[] numberOfWins(List<String> resultList2 ) {
		int winCount = 0;
		int tiedCount = 0;
		int lostCount = 0;
		
		for(String i:resultList2) {
			switch(i) {
			case "Won":
				winCount++;
				break;
			case "Tied":
				tiedCount++;
				break;
			case "Lost":
				lostCount++;
				break;
			}
		}
		int[] resultsArray = {winCount, tiedCount, lostCount};
		return resultsArray;
		
	}



}



