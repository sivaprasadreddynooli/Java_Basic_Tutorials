package Cracking_the_coding_interview;

public class chap8_8_3 {

	static int find(int[] a,int l,int r)
	{
		while(l<=r)
		{
			int m = (r+l)/2;
			if(a[m] < m)
			{
			l = m+1;	
			}
			else if( a[m] > m  )
			{
			r = m-1;
			}
			else
			{
				return m;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int a[] = {-10,-11,-6,-4,0,1,3,7,10,11,43,4353,56767};
		System.out.println(find(a,0,a.length-1));

	}

}
