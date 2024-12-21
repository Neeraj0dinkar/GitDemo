import java.util.Scanner;
class Demo{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your fav food: ");
		String food = sc.nextLine();
		
		
		System.out.println("Your name is "+name);
		System.out.println("Your age is "+age);
		System.out.println("Your favorite food is "+food);
	}
}