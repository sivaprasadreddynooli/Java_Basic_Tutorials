
import java.util.*;

public class binarydummy {

	
	public static int binary(int a[],int number)
	{
		
		int l = 0;
		int r = a.length-1;
		
		while(l<=r)
		{
			int m = (r+l)/2;
			
			if(a[m] == number)
			{
				return m+1;
			}
			else if(a[m] > number)
			{
				r = m-1;
			}
			else
			{
				l = m+1;
			}
		
		}
		return -1;
		
	}
	
	public static void main(String args[])
	{
		int a[] = {3};	
		System.out.println(binary(a,100));
	}
}
