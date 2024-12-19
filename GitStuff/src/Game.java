import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To quit the game press 'q' or 'Q'");
		String response = sc.next();
		
		if(!response.equals("q")|| !response.equals("Q")) {
			System.out.println("Game is Quitted");
		}
		else {
			System.out.println("You are still in the game");
		}
	}

}
