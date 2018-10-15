package Cracking_the_coding_interview;

import java.util.*;


public class chap8_8_1 {

	
	static int recursivefind(int n)
	{
		if (n ==1)
			return 1;
		else if(n == 2)
			return 2;
		else if (n ==3)
			return 4;
		else
			return recursivefind(n-1)+recursivefind(n-2)+recursivefind(n-3);
	
	}
	
	static int recursivefind2(int n)
	{
		
		if (n < 0)
			return 0;
		else if (n == 0)
			return 1;
		else 
			return recursivefind2(n-1)+recursivefind2(n-2)+recursivefind2(n-3);
	}
	
	static int dpfind(int n)
	{
		
	
		int dp[] = new int[n+1];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i =4;i<=n;i++)
		{
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		return dp[n];
		
		
	}
	
	static int dpfind2(int n)
	{

		int dp[] = new int[n+1];
		
		int a = 1;
		int b  = 2;
		int c  = 4;
		int d = 0;
		
		for(int i =4;i<=n;i++)
		{
			d = a + b+ c;
			a = b;
			b = c;
			c = d;
		}
		return d;
		
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int n= s1.nextInt();
		System.out.println(recursivefind(n));
		System.out.println(recursivefind2(n));
		System.out.println(dpfind(n));
		System.out.println(dpfind2(n));
	}

}
