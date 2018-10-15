package FirstPackage;


//the subclass which extends the superclass will generally have "is-a" relationship
//that is , subclass is a superclass exmp:- dog is a animal


// classes in java can be extended
//creating new classes will retain
//characteristics of the base class

public class Triangle extends Polygon {

	
	public double area()
	{
		return ((height*width)/2);
	}
	
}
