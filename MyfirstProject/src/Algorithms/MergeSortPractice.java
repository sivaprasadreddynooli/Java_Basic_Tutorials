package Algorithms;
public class MergeSortPractice {
	static void merge(int a[],int l,int m,int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		int n1a[] = new int[n1];
		int n2a[] = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			n1a[i] = a[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			n2a[i] = a[m+i+1];
		}
		int i=0;
		int j=0;
		int index = l;
		while(i<n1 && j<n2)
		{
			if(n1a[i] < n2a[j] )
			{
				a[index] = n1a[i];
				i++;
			}
			else
			{
				a[index] = n2a[j];
				j++;
			}
			index++;
		}
		while(i<n1)
		{
			a[index] = n1a[i];
			i++;
			index++;
		}	
		while(j<n2)
		{
			a[index] = n2a[j];
			j++;
			index++;
		}
	}
	static void mergesort(int a[],int l,int r)
	{
		if(l>=r)
		{
			return;
		}
		int m= (r+l)/2;
		mergesort(a,l,m);
		mergesort(a,m+1,r);
		merge(a,l,m,r);
	}
	public static void main(String[] args) {	
		int a[] = {34,53,43,4,3,4,32,43,42,1};
		mergesort(a,0,a.length-1);
		for(int value:a)
		{
			System.out.println(value);
		}
	}
}
