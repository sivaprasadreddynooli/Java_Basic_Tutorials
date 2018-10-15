package Algorithms;

public class QuickSortPractice {

	
	static int partition(int a[],int l,int r)
	{
		
		
		
		
		
		return 1;
	}
	
	
	
	static void quicksort(int a[],int l,int r)
	{
		int m = partition(a,l,r);
		quicksort(a,l,m);
		quicksort(a,m,r);
	}
	
	public static void main(String[] args) {
		int a[] = {1,45,4,3,423,43,433,89,10};
		quicksort(a,0,a.length-1);
		for(int value:a)
		{
			System.out.println(value);
		}

	}

}
