package FirstPackage;

public class Laptop extends Device{

	
	
	// if we don't define devideId method here it will show the error.
	//since Laptop class is inherited from Device and deviceId is abstract
	//method in Device class, deviceId method has to be defined in baseclass
	//Laptop
	//commenting this will give error
	int deviceId()
	{
		return 1;
	}
	
	
	
}
