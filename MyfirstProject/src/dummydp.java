
import java.util.*;

public class dummydp {

	
	public static int calc(String a)
	{
		int n = a.length();
		
		int dp[] = new int[n+1];
		
		dp[0] = 0;
		
		dp[1] = 1;
	
		for(int i=0;i<=n;i++)
		{
			dp[i] = i;
		}
		
		for(int i=1;i<=n;i++)
		{
			if(i<=n/2 && a.substring(0,i).equals(a.substring(i,2*i)))
			{
				dp[i] = Math.min(dp[i],dp[i-1] + 1);
			     dp[2*i] = dp[i] + 1;
			}
			else
			{
				dp[i] = Math.min(dp[i],dp[i-1]+1);
			}
		}

		
		return dp[n];
		
	}
	
	public static void main(String[] args)
	{
		
		
		String s = "ABCDEFGHIJKLMNOPZABCDEFGHIJKLMNOP";
		System.out.println(calc(s));
		
	}
	
}
