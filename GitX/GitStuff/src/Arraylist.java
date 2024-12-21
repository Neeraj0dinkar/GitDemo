import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("burger");
		food.add("chowmin");
		
		//food.set(0, "Soup");
		//food.remove(2);
		//food.clear();
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
	}

}
