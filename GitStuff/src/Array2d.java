
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cars = new String[3][3];
		
		cars[0][0]="Tesla";
		cars[0][1]="Corvette";
		cars[0][2]="Ferrari";
		cars[1][0]="Invicto";
		cars[1][1]="Harrier";
		cars[1][2]="Silverado";
		cars[2][0]="Cadilac";
		cars[2][1]="Safari";
		cars[2][2]="Innova";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	
	}

}
