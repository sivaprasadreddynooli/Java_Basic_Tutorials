package Leetcode_problems;

public class problem_remove_duplicates_from_sorted_array_80 {

	
	
	public static int validate(int[] a,int k)
	{
		int cnt = k;
		
		for(int i=0;i<a.length;i++)
		{
			if(i>1 && a[i] > a[i-2])
			{
				cnt = cnt+1;
			}	
		}
		
		
		for(int j:a)
		{
			System.out.println(j);
		}
		
		return cnt;
		
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,1,1,2,2,3};
		
		System.out.println("the value is" + validate(a,2));
		
	}

}
