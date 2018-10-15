package Cracking_the_coding_interview;

import java.util.Scanner;

public class chap8_8_5 {

	static int find(int a,int b)
	{
		
		if (b==1)
			return a;
		if( (b & 1) == 0)
		{
			return find(a,b/2)+find(a,b/2);	
		}
		else
		{
			return find(a,b/2)+find(a,b/2)+a;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(find(a,b));
		

	}

}
