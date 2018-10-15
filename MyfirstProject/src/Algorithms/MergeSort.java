package Algorithms;

public class MergeSort {

	static void find(int a[],int l,int r)
	{
		while(l<r)
		{
			int m = l+(r-l)/2;
			find(a,l,m-1);
			find(a,m,r);
			merge(a,l,r);
		}
	}
	
	
	static void merge(int a[],int l,int r)
	{
		int temp[] = new int[r-l+1];
		int n = r-l+1;
		int i = 0;
		while(i<n)
		{
			
			
			
		}
		
	}
	public static void main(String[] args) {
		int a[] = {5,6,43,4,2,34,5,3,2,343,423,43,5};
		find(a,0,a.length-1);

		
	}

}
