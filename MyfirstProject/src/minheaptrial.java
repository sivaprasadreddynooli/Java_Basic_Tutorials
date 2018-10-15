
public class minheaptrial {

	public static void sort(int a[])
	{
		
		int n = a.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a,n,i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			heapify(a,i,0);
		}
	}
	
	static void heapify(int a[],int n,int index)
	{
		int left = 2*index + 1;
		int right  = 2*index+2;
		
		int small = index;
		if(right < n && a[right] > a[small])
		{
			small = right;
		}
		
		if(left<n && a[left] > a[small])
		{
			small = left;
		}
		
		if(small != index)
		{
			int temp = a[index];
			a[index] = a[small];
			a[small] = temp;
			
			heapify(a,n,small);
		}
		
	}
	
	
	public static void main(String args[])
	{
		int a[] = {2,34,34,5,4,54,35,6,46,45};
		sort(a);
		for(int value:a)
		{
			System.out.println(value);
		}
	}
	
}
