package cerner_questions;

import java.util.Scanner;

public class Question_Armstrong_Number {

	
	static boolean find(int n)
	{
		int res = 0;
		int m = n;
		int rem = 0;
		while(n > 0 )
		{
			rem = n%10;
			res = res + (rem*rem*rem);
			n = n/10;
		}
		return m==res;
		
	}
	
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		
		int n = s1.nextInt();

		System.out.println(find(n));
	}

}
