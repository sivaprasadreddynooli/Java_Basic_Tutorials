package Leetcode_printout_papers;

public class Two_Sum_Input_Array_Sorted {

	static int[] find(int a[],int target)
	{
		int b[] = new int[2];
		int i = 0;
		int  j = a.length-1;
		
		while(i<a.length && j>=0 && i<=j)
		{
			int diff = a[i] + a[j] - target;
			
			if(diff > 0 )
			{
				j = j - 1;
			}
			else if( diff < 0 )
			{
				i = i+1;
				
			}
			else
			{
				b[0] = i+1;
				b[1] = j+1;
				return b;
				
			}
				
			
			
		}
		
		
		
		
		return b;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,5,6,8,98,99,100,546,999,4549,5000,6001,7007,8008,100001};
		int b[] = new int[2];
		int target = 7012;
		b = find(a,target);
		System.out.println(b[0] + " " + b[1]);

	}

}
