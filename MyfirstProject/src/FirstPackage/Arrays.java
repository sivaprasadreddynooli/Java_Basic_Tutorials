package FirstPackage;

public class Arrays {

	public static void main(String[] args)
	{
		int[] my_int_array = {1,2,3,4,5};
		int my_int_array2[] = {1,2,4,5,6,6}; 
		
		/*
		 * these are the some more ways of declaring the int array
		 * int[] int_variable = new int[3];
		 * int[] int_variable = new int[] {1,2,4};
		 * 
		 */

		//index of the array starts from 0
		System.out.println(my_int_array[3]);
		
		int i = 0;
		while( i< my_int_array.length)
		{
			System.out.println(my_int_array[i]);
			i++;
		}
		
	}
	
}
