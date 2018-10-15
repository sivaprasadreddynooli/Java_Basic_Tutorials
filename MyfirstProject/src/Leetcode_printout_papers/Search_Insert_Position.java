package Leetcode_printout_papers;
import java.util.Scanner;
public class Search_Insert_Position {
	static int find(int a[],int n)
	{
		int l=0;
		int r = a.length-1;
		while(l<=r)
		{
			
			int m = (r+l)/2;
			if(a[m] > n)
			{
				r = m-1;
			}
			else if(a[m] < n)
			{
				l = m+1;
			}
			else
			{
				return m;
			}	
		}
		return l;
	}
	public static void main(String[] args) {	
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int a[] = {1,5,6,7,8,9,10,23,45,67,76,756,3454,5656,7879};
		System.out.println(find(a,n));
	}

}
