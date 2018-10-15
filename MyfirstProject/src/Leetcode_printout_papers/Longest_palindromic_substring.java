package Leetcode_printout_papers;

import java.util.*;

public class Longest_palindromic_substring {

	static String dpfind(String sen)
	{
		
		int n = sen.length();
		int a[][] = new int[n+1][n+1];
		
		for(int i=0;i<=n;i++)
		{
			a[i][i] = 1;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(sen.charAt(i) == sen.charAt(j))
				{
					a[i][j] = 0;
				} 
			}
		}
		
		return "";
	}
	
	
	static int fufind(String sen)
	{
		int n = sen.length();
		int sublen = 0;
		int maxvalue=0;
		for(int i=0;i<n;i++)
		{
			
		sublen = oddsubstring(sen,i);
		if( i+1 < n && sen.charAt(i) == sen.charAt(i+1) )
		{
		sublen = max(sublen,evensubstring(sen,i,i+1));	
		}
		maxvalue = max(maxvalue,sublen);
			
		}
		return maxvalue;
	}
	
	
	static int max(int a,int b)
	{
		return a>b?a:b;
	}
	static int oddsubstring(String sen,int i)
	{
		int temp = i;
		int count = 0;
		while(  (temp-count) >=0 && (temp+count) <= sen.length()-1   && sen.charAt(temp-count) == sen.charAt(temp+count))
		{
			count++;
		}
		return count*2+1;
	}
	static int evensubstring(String sen,int l,int r)
	{
		while(l>= 0 && r<= sen.length()-1 && sen.charAt(l) == sen.charAt(r))
		{
			l = l-1;
			r = r+1;
		}		
			return r-l-1;
	}
	public static void main(String[] args) {
		Scanner s1 =  new Scanner(System.in);
		String sen = s1.nextLine();
		System.out.println(fufind(sen));
		

	}

}
