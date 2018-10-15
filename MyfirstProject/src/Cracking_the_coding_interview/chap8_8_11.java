package Cracking_the_coding_interview;

import java.util.Scanner;

public class chap8_8_11 {

	static int find(int n,int coins[])
	{
		int m = coins.length;
		int dp[][] = new int[n+1][m];
		
		for(int i=0;i<m;i++)
		{
			dp[0][i] = 1;
		}
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<m;j++)
			{
				
				dp[i][j] = (j>=1 ? dp[i][j-1]:0) + (i >= coins[j] ? dp[i-coins[j]][j]:0);
			}
		}
		
		
		return dp[n][m-1];
	}
	
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int coins[] = {1,5,10,25};
		int a = s1.nextInt();
		System.out.println(find(a,coins));
		

	}

}
