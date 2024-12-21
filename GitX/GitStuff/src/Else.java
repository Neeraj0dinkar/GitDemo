
public class Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 78;
		
		if(age==21) {
			System.out.println("You are an Adult");
		}
		else if(age>=75) {
			System.out.println("Ok Bloomer");
		}
		else if(age>=13&&age<=19) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are not an Adult");
		}
	}

}
