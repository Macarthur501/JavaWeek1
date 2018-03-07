import java.util.Scanner;

public class Person implements Move {
	Person(){
	}
	@Override
	public String move() {
		System.out.println("Choose rock, paper or scissors (r, p or s)");
		Scanner sc = new Scanner(System.in);
		String movement = sc.nextLine();
		movement = movement.substring(0, 1);
		return movement.toLowerCase();
		
		}
	public int gamesWanted() {
		Scanner sc = new Scanner(System.in);
		int numberOfGames = sc.nextInt();
		return numberOfGames;
	}
	public String gameExit() {
	Scanner sc = new Scanner(System.in);
	String quit = sc.nextLine();
	quit = quit.substring(0, 1);
	return quit.toLowerCase();
		
		
	}
	





}
