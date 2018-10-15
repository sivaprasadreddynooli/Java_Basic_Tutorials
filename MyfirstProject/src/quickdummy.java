
import java.util.*;


public class quickdummy {

	public static void quicksort(int a[],int l,int r)
	{
	
		if(l>=r)
		{
			return;
		}
		int m = quick(a,l,r);
		quicksort(a,l,m-1);
		quicksort(a,m+1,r);
		
	}
	
	
	
	public static int quick(int a[],int l,int r)
	{
		int value = a[r];
		
		int low = l-1;
		for(int i=l;i<r;i++)
		{
			if(a[i]<value)
			{
				low++;
				int temp = a[i];
				a[i] = a[low];
				a[low] = temp;
			}
		}
		low++;
		int temp = a[low];
		a[low] = a[r];
		a[r] = temp;
		
		return low;
	}
	
	
	
	public static void main(String args[])
	{
		int a[] = {2,4,5,3,2,78,97,4,36,56,43,90,999,34,3454};
		quicksort(a,0,a.length-1);
		for(int value:a)
		{
			System.out.println(value);
		}
	}
}
