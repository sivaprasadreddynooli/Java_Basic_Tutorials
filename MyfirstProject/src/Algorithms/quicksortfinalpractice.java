package Algorithms;

public class quicksortfinalpractice {

	
	static int partition(int a[],int l,int r)
	{
		
		int pivot  = a[r];
		
		int i = l;
		
		for(int j=l;j<r;j++)
		{
			if(a[j] <= pivot)
			{
				
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
		}
		
		int temp = a[i];
		a[i] = a[r];
		a[r] = temp;
		return i;
	}
	
	
	static void quicksort(int a[],int l,int r)
	{
		if(l<=r)
		{
		int m = partition(a,l,r);
		quicksort(a,l,m-1);
		quicksort(a,m+1,r);
		}		
		
	}
	
	public static void main(String[] args) {
		int a[] = {8,4,2,5,34,6,1,2,56,89};
		
		quicksort(a,0,a.length-1);

		for(int value:a)
		{
			System.out.println(value);
		}
		
	}

}
