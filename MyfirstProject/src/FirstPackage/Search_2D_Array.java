package FirstPackage;

public class Search_2D_Array {

	
	static boolean find(int a[][],int target)
	{
		
		
		int m = a.length ;
		int  n =a[0].length;
		
	   int i=0;
	   int j = m*n-1;
		
		while(i<=j )
		{
			int rem= (i+j)/2;
			
			if(a[rem/n][rem%n] > target)
			{
				j = rem -1;
			}
			else if(a[rem/n][rem%n] < target)
			{
				i = rem+1;
			}
			else
			{
				return true;
			}
			
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		
		int a[][] = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,50}
		};
		int target = 17;
		System.out.println(find(a,target));

	}

}
