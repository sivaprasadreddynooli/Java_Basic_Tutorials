package FirstPackage;


//creating object for a vehicle does not make sense since
//there won't be anything like vehicle as a vehicle
//so we should stop creating objects for vehicle class
//making it as abstract class will stop us from creating the objects


//we cannot create objects from the abstract class
//we can use abstract class for inheritance 
abstract public class Vehicle {

	void brand()
	{
		System.out.println("this is a general vehivle with no brand");
	}
	
}
