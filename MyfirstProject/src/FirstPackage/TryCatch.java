package FirstPackage;

public class TryCatch {

	public static void main(String[] args)
	{
		int a = 100;
		int b[] = new int[4];
		try 
		{
			
			//try deviding by 0, arithmetic exception will raise
			int c = a/5;
			 b[5] = 45;		
		}
		
		//this Exception will occur whenever there is a ArithmericException
		//from the code present in the try block
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}

	
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println(e);
		}
		
		//this is more like a generalized exception and this code will execute 
		//if none of the catch blocks present above catch that exception
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		//the code after try catch block will execute if Exceptions handled 
		//properly
		System.out.println("the last line");
		
		
	}
	
	
}
