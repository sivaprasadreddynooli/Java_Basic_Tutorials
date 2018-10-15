package Leetcode_problems;

public class problem_Longest_Palindromic_Subsequence {

	static int longestPalindrome(String s)
	{
		
		int n = s.length();
        int dp[][] = new int[n][n];
        
        int max = 0;
        
        for(int i=0;i<n-1;i++)
        {
            dp[i][i] = 1;
            max = 1;
            if(s.charAt(i) == s.charAt(i+1))
            {
                dp[i][i+1] = 2;
                max = Math.max(max,2);
            }
            else
            {
                dp[i][i+1] = 1;
            }
        }
        dp[n-1][n-1] = 1;
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n;i++)
            {
                int j = i+k-1;
                if(j<n && i<n && s.charAt(i) == s.charAt(j) && (j-i) > 2)
                   {
                       if(i<n-1 && j>0){
                       dp[i][j] = dp[i+1][j-1] + 2;
                         }
                   }
                else if( j<n && i<n && s.charAt(i) == s.charAt(j) && j-i == 2)
                {
                	if(i<n-1 && j>0){
                        dp[i][j] = dp[i+1][j-1] + 1;
                          }
                }
                else 
                {
                    if(j<n && i<n){
                dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);   
                    }
                }
                if(j<n && i<n)
                {        	
                          max = Math.max(max,dp[i][j]);
                }        
            }
                          
        }
        
        
        return max;
    
	}
	
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("aaa"));

	}

}
