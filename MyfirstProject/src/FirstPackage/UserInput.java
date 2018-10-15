//import java.util.*;
package FirstPackage;

import java.util.Scanner;

public class UserInput {

	public static void main( String[]  args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter some number");
		int user_input = s1.nextInt();
		System.out.println("the entered numner is "+ user_input);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter some string");
		String user_string = s2.nextLine();
		System.out.println(user_string);
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter a decmical number");
		float user_float = s3.nextFloat();
		System.out.println(user_float);
		
		s1.close();
		s2.close();
		s3.close();
		
	}
	
}
