package FirstPackage;

//The finally block always executes when try block exists
//This ensures that the finally block is executed even if an unexpected 
//exception occurs.

public class FinallyBlock {

	public static int retint()
	{
		int a = 100;
		try
		{
			
			//even if the below return statement executes the method execution
			//will not end here, the finally block will 
			//still be executed
			return a;
		}
		catch(Exception e)
		{
			System.out.println("catch block called");
			return 300;
			
		}
		//since finally block is executed at the end of try and catch blocks
		//the return value from finally will be executed instead of return 
		//statements of try and catch blocks, since finally executes at the last
		finally
		{
			a = 5000;
			System.out.println("final block is called");
			return a;
		}	
	}
	
	public static void main(String[] args)
	{
		int a = 100;
		try
		{
			//the finally block is executed after try catch blocks for sure
			//the only reason that finally will not  be executed is when we call 
			//system exit like the below statement			
			//System.exit(1);
		}
		
		catch(Exception e)
		{
			System.out.println("catch called ");
			System.out.println(e);
		}
		//finally block is executed for sure after completion of above try catch
		//blocks		
		finally
		{
			System.out.println("the finally block is called");
		}
		System.out.println("the method retint is called");		
		System.out.println("the value from method is " + retint());
	}
	
}
