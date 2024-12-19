import java.util.Scanner;
public class Hypothenis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side a ");
		double x = sc.nextDouble();
		
		System.out.println("Enter the side b ");
		double y = sc.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The Hypothenous is: "+z);
		
		sc.close();
	}

}
