package FirstPackage;

public class UseVehicle {

	public static void main(String[] args)
	{
		
		//creating object for a vehicle does not make sense since
		//there won't be anything like vehicle as a vehicle
		//so we should stop creating objects for vehicle class
		//making it as abstract class will stop us from creating the objects
		
		//We cannot create objects from a abstract class
		//below statement will give error since Vehicle is a abstract class
			
		//Vehicle v1 = new Vehicle();
		
		
		//we can create objects from the subclass whose super class is 
		//abstract class
		Car c1 = new Car();
		
		Bike b1 =new Bike();
		
		c1.brand();
		b1.brand();
		
		
		
	}
	
}


