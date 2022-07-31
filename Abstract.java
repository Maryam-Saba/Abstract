abstract class vehicle
{
	int no_of_tyres;
	abstract void start();
}
class Car extends vehicle
{
	void start()
	{
		System.out.println("Car start with Key");
	}
}
class Bike extends vehicle
{
	void start()
	{
		System.out.println("Bike start with Kick");
	}
}
public class Abstract
{
	public static void main(String args[])
	{
		Car C= new Car();
		C.no_of_tyres= 4;
		System.out.println(C.no_of_tyres);
		C.start();
	}

}

