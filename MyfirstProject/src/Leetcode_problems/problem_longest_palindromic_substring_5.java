package Leetcode_problems;

public class problem_longest_palindromic_substring_5 {

	
	public static int max_value(int x,int y)
	{
		if (x>y)
			return x;
		else
			return y;
			
	}

	
	public static int findvalue(String name,int l,int r)
	{
		int n = name.length();
		while( l >= 0 && r < n && name.charAt(l) == name.charAt(r)  )
		{
			l = l - 1;
			r = r + 1;
		}
		
		return r-l-1;
	}
	
	

	
	public static void main(String[] args) {
	
		String name = "geeksskeeg";
		int max = 0;
		int n = name.length(); 
		for(int i=1;i<n-1;i++)
		{
			max = max_value(max,max_value(findvalue(name,i,i),findvalue(name,i,i+1)));
		}
	System.out.println(max);	

	}

}
