package FirstPackage;
abstract public class Device {
	//all subclasses inheriting Device has to define deviceId method in 
	//their classes or else it will through error
	abstract int deviceId();
	
}
