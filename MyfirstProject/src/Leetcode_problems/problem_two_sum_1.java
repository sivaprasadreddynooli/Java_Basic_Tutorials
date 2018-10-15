package Leetcode_problems;


import java.util.*;



public class problem_two_sum_1 {

	
	
	public boolean myfunction(int arr[],int target)
	{
	
		int n = arr.length;
		
		for(int  i=0;i<n;i++)
		{
			
			int y = target - arr[i];
			for(int j = i+1;j<n;j++)
			{
				if (y == arr[j])
				{
					return true;
				}
			}
			
		}
		return false;
	}
	
	
	
	public int[] leetcodefunction(int arr[],int target)
	{
		int n = arr.length;
		
		int[] result = new int[2];  
		
		Map<Integer, Integer> values = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++)
	{
			if(values.containsKey(target- arr[i]))
			{
				result[1] = i+1;
				result[0] = values.get(target-arr[i]);
				return result;
				
			}
			values.put(arr[i], i);
	}
		return result;
	}
	
	
	
	
	public static void main(String args[])
	{
		
		int arr[] = {2,7,8,10};
		int target = 15;
		
		problem_two_sum_1  p1 = new problem_two_sum_1();
		System.out.println(p1.myfunction(arr, target));
		System.out.println(p1.leetcodefunction(arr, target));
		
	}
	
}
