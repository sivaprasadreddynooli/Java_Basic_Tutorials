package FirstPackage;

import java.util.Scanner;

public class VoidMethod {

 int a = 4;	
	
	public void printSomething(int b)
	{
		
		if(b != 4)
		{	
			//the return statement may also be used in void methods
			//to exit before the end block id reached
			return;
		}
		else
		{
			System.out.println("the value is 4");
		}

	}
	
	
	public static void main(String[] args)
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a number");
		int a;
		VoidMethod m1 = new VoidMethod();
		while(true)
		{
			a = s1.nextInt();
			m1.printSomething(a);
			if ( a != 4 )
			{
				continue;
			}
			else
			{
				break;
			}
		}
		
		//m1.printSomething();
		
	}
	
	
}
