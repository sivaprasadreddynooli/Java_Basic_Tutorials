
import java.util.*;

public class knapsacksdummy {

	public static void main(String args[])
	{
	
		int a1[] = {60,100,120};
		int a2[] = {10,20,30};
		
		int w = 50;
		
		
		int dp[][] = new int[4][w+1];
		
		
		for(int i=0;i<=3;i++)
		{
			
			for(int j=0;j<=w;j++)
			{
				
				if(i==0 || j==0)
				{
					dp[i][j] = 0;
				}
				else if(a2[i-1] <= j)
				{
					dp[i][j] = Math.max(a1[i-1] + dp[i-1][j-a2[i-1]], dp[i-1][j]);
					
				}
				else if(a2[i-1] <= j)
				{
					dp[i][j] =  dp[i-1][j];
				}
			}
		
		}
		
		System.out.println(dp[3][50]);
		
		
	}
}
