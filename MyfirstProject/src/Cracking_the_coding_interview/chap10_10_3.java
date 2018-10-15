package Cracking_the_coding_interview;

public class chap10_10_3 {

	
	static int find(int a[],int b,int l,int r)
	{
		
		if(l>r)
			return -1;
		
		int m = (r+l)/2;
		
		if(a[m] == b)
		{
			return m;
		}
		
		if(a[m] > a[l])
		{
			if(b > a[l] && b < a[m])
			{
				return find(a,b,l,m-1);
			}
			else 
			{
				return find(a,b,m+1,r);
			}
		}
		else if( a[m] < a[l] )
		{
			if(b>a[m] && b<a[l])
			{
				return find(a,b,m+1,r);
			}
			else 
			{
				return find(a,b,l,m-1);
			}
		}
	
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {15,16,19,20, 25, 1,3,4,5,7,10,14};
		int b = 5;
		System.out.println(find(a,b,0,a.length-1));

	}

}
