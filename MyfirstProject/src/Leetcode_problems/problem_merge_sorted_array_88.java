package Leetcode_problems;

public class problem_merge_sorted_array_88 {
	
	
	public static int[] validate(int[] a,int[] b,int m,int n)
	{
		
		
		
		int i = m-1;
		int j = n-1;
		
		int k = m+n - 1;
		
		while(  i >=0 && j >= 0 && k >= 0  )
		{
			
			if(a[i] > b[j])
			{
				b[k] = a[i];
				i = i-1;
			}
			else if(a[i] < b[j])
			{
				b[k] = b[j];
				j = j-1;
			}
			else if(a[i] == b[j])
			{
				b[k] = a[i];
				i = i-1;
			}
			
			
			k = k-1;
			
		}
		
		while(i >= 0)
		{
			b[k] = a[i];
			i = i-1;
			k = k-1;
		}
		
		/*
		while(j >= 0)
		{
			b[k] = a[j];
			j = j-1;
			k = k-1;
		}
		*/
		
		for(int l:b)
		{
			System.out.println(l);
		}
		
		return b;
	}
	
	
	public static void main(String args[])
	{
		
		int[] a = {3,6,7,8,9};
		int[] b = new int[17];
		b[0] = 1;
		b[1] = 2;
		b[2] = 7;
		b[3] = 9;
		b[4] = 11;
		b[5] = 15;
		
		validate(a,b,5,6);
		
		
		for(int i:b)
		{
			//System.out.println(i);
		}
		
		
	}

}
