package Leetcode_problems;

public class probelm_Longest_Palindromic_Substring_5dp {
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int maxlength = 1;
        int maxi = 0;
        int maxj = 0;
        for(int i=0;i<n-1;i++)
        {
            dp[i][i] = true;
            if(s.charAt(i) == s.charAt(i+1))
            {
                dp[i][i+1] = true;
                maxlength = 2;
                maxi = i;
                maxj = i+1;
            }
        }
        dp[n-1][n-1] = true;
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n;i++)
            {      int j = i+k-1;
                if(j<n && s.charAt(i) == s.charAt(j) && i < n-1 && j> 0 && dp[i+1][j-1])
                {
                        dp[i][j] = true;
                        if(maxlength < (j-i+1) )
                        {
                        maxlength = j-i+1;
                            maxi = i;
                            maxj = j;           
                        }
                }
            }
        }   
        return s.substring(maxi,maxj+1);

    }
	
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("saias"));

	}

}
