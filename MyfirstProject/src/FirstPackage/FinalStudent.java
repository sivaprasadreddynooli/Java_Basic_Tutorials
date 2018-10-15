package FirstPackage;


//this class cannot be subclassed, as this has the keyword final
//this won't allow us to extend the class
//check UseFinalKeyword for more information

public final class FinalStudent {

	public int id;
	
	FinalStudent()
	{
		System.out.println("Object created");
	}
	
	
}
