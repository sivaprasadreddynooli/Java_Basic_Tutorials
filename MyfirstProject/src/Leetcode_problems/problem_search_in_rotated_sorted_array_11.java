package Leetcode_problems;
public class problem_search_in_rotated_sorted_array_11 {

	public static boolean validate(int[] a,int target)
	{
		int l = 0;
		int h = a.length-1;
		while(l < h)
		{
			
			int m = l + (h-l)/2;
					
			if(a[l] < a[m])
			{
				l = m+1;
			}
			else if(a[l] > a[m])
			{
				h = m-1;
			}
			
			
		}
		
		
		if(target > a[0])
		{
			h = l;
			l = 0;
		}
		else if(target < a[0])
		{
			h = a.length-1;			
		}
	
		while(l<h)
		{
			int m = l + (h-l)/2;
			if(a[m] == target)
			{
				System.out.println("true,yes");
			}
			else if(a[m] < target)
			{
				l = m+1;			
			}
			else if(a[m] > target)
			{
				h = m-1;
			}
		}	
		System.out.println("fasle,no");
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] a= {4,5,6,7,0,1,2,3};
		int target = 6;
		validate(a,target);
	}

}
