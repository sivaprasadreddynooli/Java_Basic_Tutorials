package FirstPackage;

public class StaticBlock {

	
	
	//static block is executed first than the main block
	//"hello static"  is printed first and then
	//"this main" is printed
	//static block is generally used to initialize the static variables
	static
	{
		System.out.println("hello static");
	}
	
	public static void main(String[] args)
	{
		System.out.println("this main");
	}
	
}
