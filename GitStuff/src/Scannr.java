import java.util.Scanner;

public class Scannr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("What is your favourite food");
		String food = sc.nextLine();
		System.out.println("Hello "+ name);
		System.out.println("Your age is "+ age);
		System.out.println("My favourite food is "+food);
	}

}
