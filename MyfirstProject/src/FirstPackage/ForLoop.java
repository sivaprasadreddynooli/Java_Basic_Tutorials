package FirstPackage;

public class ForLoop {

	public static void main(String[] args)
	{
		int[] my_variable = {1,2,4,5,56};
		
		for ( int i:my_variable)
		{
			System.out.println(i);
		}
		
		
		System.out.println("second for loop started" );
		
		for ( int i = 0;i<my_variable.length;++i)
		{
			System.out.println(my_variable[i]);
		}
		
		
		
		
		
	}
	
}
