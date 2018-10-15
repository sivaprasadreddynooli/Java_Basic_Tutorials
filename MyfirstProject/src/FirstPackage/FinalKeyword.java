package FirstPackage;

public class FinalKeyword {

	/* Final keyword has a numerous way to use
	 * 
	 * A final class cannot be subclassed.
	 * A final method cannot be overridden by subclasses
	 * A final variable can only be initialized once
	 */
	
	public final double pi = 3.14;
	public final int id ;
	
	FinalKeyword()
	{
		System.out.println("hello, object created");
		id = 345;
	}
	
	
	
}
