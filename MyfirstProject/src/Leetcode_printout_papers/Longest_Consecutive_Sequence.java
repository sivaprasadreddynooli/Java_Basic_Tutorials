package Leetcode_printout_papers;

import java.util.*;

public class Longest_Consecutive_Sequence {

	static int maximum(int a,int b )
	{
		return a>b? a:b;
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {100,4,300,3,5,2,1,0,434};
		
		Set<Integer> set = new HashSet<Integer>();
		
		
		for(int i:a)
		{
			set.add(i);
		}
		
		int max = 0;
		for(int j:a)
		{
			
			int left = j-1;
			int right = j+1;
			int count = 1;
			
			while(set.contains(left))
			{
				count++;
				set.remove(left);
				left = left-1 ;
				
			}
			while(set.contains(right))
			{
				count++;
				set.remove(right);
				right = right+1 ;
			}
			max = maximum(count,max);
		}
		System.out.println(max);
		

	}

}
