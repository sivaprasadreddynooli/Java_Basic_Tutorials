import java.util.*;


public class Mergedummy {

	
	static void mergesort(int a[],int l,int r)
	{
	
		if(l>=r)
		{
			return;
		}
		int m = (r+l)/2;
		
		mergesort(a,l,m);
		mergesort(a,m+1,r);
		merge(a,l,m,r);
	}
	
	static void merge(int a[],int l,int m,int r)
	{
	
		int n1 = m-l+1;
		int n2 = r-m;
		int templ[] = new int[n1];
		int tempr[] = new int[n2];
		for(int i=l;i<=m;i++)
		{
			templ[i-l] = a[i];
		}
		
		for(int i=m+1;i<=r;i++)
		{
			tempr[i-m-1] = a[i]; 
		}
		
		
		int i = 0;
		int j = 0;
		int index = l;
		while(i<n1 && j< n2)
		{
			if(templ[i] < tempr[j])
			{
				a[index] = templ[i];
				i++;
			}
			else
			{
				a[index] = tempr[j];
				j++;
			}
			index++;
		}
		
		while(i!=n1)
		{
			a[index] = templ[i];
			i++;
			index++;
		}
		

		while(j!=n2)
		{
			a[index] = tempr[j];
			j++;
			index++;
		}
		
		
	}
	public static void main(String args[])
	{
		int a[] = {3,6,734,5,3,1,2,2,2,2,2,2,90,3443};
		mergesort(a,0,a.length-1);
		for(int value:a)
		{
			System.out.println(value);
		}
		
	}
}
