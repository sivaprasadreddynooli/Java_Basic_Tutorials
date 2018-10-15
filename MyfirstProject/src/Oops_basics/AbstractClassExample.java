package Oops_basics;

abstract class vehicle1
{

	abstract void run();
	
	void horn()
	{
		System.out.println("horn horn horn");
	}
	
}


class Bike1 extends vehicle1
{
	
	void run()
	{
		
		System.out.println("bike started");
	}

	void horn()
	{
		System.out.println("this horn is from bike");
	}

}


class car1 extends vehicle1
{
	void run()
	{
		System.out.println("car has started");
	}

}

public class AbstractClassExample {

	public static void main(String[] args) {
		Bike1 b1 = new Bike1();
		car1 c1 = new car1();
		
		b1.run();
		b1.horn();
		c1.run();
		c1.horn();
		

	}

}
