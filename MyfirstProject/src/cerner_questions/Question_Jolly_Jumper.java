package cerner_questions;

import java.util.Scanner;
import java.lang.*;

public class Question_Jolly_Jumper {

	static boolean find(int a[])
	{
		int n = a.length;
		int exr = 0;
		for(int j=1;j<n;j++)
		{
			exr = exr^(Math.abs(a[j]-a[j-1]));
	        exr = exr^j;	
		}
	return exr == 0;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int a[] = new int[n];
		int i=0;
		for(i = 0;i<n;i++)
		{
			a[i] = s1.nextInt();
		}
		System.out.println(find(a));

	}

}
