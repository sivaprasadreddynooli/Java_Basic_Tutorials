package FirstPackage;

public class LogicalOperator {

	public static void main( String[] args)
	{
		int subject1 = 34;
		int subject2 = 39;
		
		/*
		 * && logical and operator
		 * || logical or operator
		 * 
		 */
		
		if ( subject1 >= 35 && subject2 >= 35)
		{
			System.out.println("he passes both the subejcts");
		}
		else if( subject1 >= 35 || subject2 >= 35)
		{
			System.out.println("he passesd only one subject");
		}
		else
		{
			System.out.println("he passes neither of those");
		}
		
		
	}
}
