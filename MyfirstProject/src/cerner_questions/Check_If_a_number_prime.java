package cerner_questions;

import java.util.Scanner;

import java.lang.Math.*;

public class Check_If_a_number_prime {

	static boolean find(int n)
	{
		
		int m = (int)Math.sqrt(n);
		System.out.println(m);
		for(int i=2;i<=m+1;i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		int n = s1.nextInt();
		System.out.println(find(n));
		

	}

}
