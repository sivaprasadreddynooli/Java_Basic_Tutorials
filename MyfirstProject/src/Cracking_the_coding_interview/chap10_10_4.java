package Cracking_the_coding_interview;

public class chap10_10_4 {

	static int find(int a[],int b)
	{
		
		int count = 1;
		
		while(a[count] != -1 && a[count*2] != -1)
		{
			count = count *2;
		}
		
		
		if(a[count/2] > b)
		{
			return binarysearch(a,b,0,count/2);
		}
		else
		{
			return binarysearch(a,b,count/2,count);
		}
		
	}
	
	static int binarysearch(int a[],int b,int l,int r)
	{
		if(l<=r)
		{
		int m = (r+l)/2;
		if(a[m] == b)
		{
		return m;	
		}
		else if(a[m] > a[l] || a[m] == -1)
		{
			return binarysearch(a,b,l,m-1);
		}
		else
		{
			return binarysearch(a,b,m+1,r);
		}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,4,6,7,8,10,11,34,56,78,99,100,-1,-1,-1,-1,-1,-1};
		int b = 8;
		System.out.println(find(a,b));

	}

}
