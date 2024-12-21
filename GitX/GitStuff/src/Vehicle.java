
abstract class Vehicle {
int tyres;
abstract void start();
}
class Car extends Vehicle
{
	int tyres = 4;
	void start()
	{
		System.out.println("Starts with keys");
	}
}
class Scooter extends Vehicle
{
	int tyres=2;
	void start()
	{
		System.out.println("Starts with kick");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		
		Scooter s = new Scooter();
		s.start();
		
	System.out.println("this line is to show git change");
	}
}