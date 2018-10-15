
import java.util.*;

public class dpdummy {

	public static void main(String args[])
	{
		
		
		String s1 = "ABFGHJ";
		String s2 = "AJKFGYUI";
	
		int n = s1.length();
		int m = s2.length();
		
		int dp[][] = new int[n+1][m+1];
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				
				if(i == 0|| j ==0)
				{
					dp[i][j] = 0;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1))
				{
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else
				{
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
				
			}
		}
		
		System.out.println(dp[n][m]);
		
		
		
	}
}
