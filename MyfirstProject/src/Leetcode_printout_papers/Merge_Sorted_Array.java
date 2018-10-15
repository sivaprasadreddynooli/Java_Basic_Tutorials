package Leetcode_printout_papers;
import java.util.*;
public class Merge_Sorted_Array {
	static void find(int a[],int m,int  b[],int n)
	{
	
	
		int  i = m+n-1;
		m = m-1;
		n = n-1;
		while(i>=0 && m>=0 && n>= 0)
		{
			if(a[m] > b[n])
			{
				a[i] = a[m];
				i = i-1;
				m = m-1;
			}
			else if(a[m] < b[n])
			{
				a[i] = b[n];
				i = i-1;
				n = n-1;				
			}
			else
			{
				a[i] = a[m];
				i = i-1;
				m = m-1;
			}
		}
		
		
	}
	public static void main(String[] args) {
		int a[] = new int [10];
		a[0] = 1;
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
				
		int b[] = {2,3,6,9};
		System.out.println(a.length);
		find(a,4,b,b.length);
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
