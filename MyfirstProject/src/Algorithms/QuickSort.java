package Algorithms;

import java.util.Scanner;

public class QuickSort {

	static int qsrt(int a[],int l,int r)
	{
		
		int m = a[r];
		
		int i = l;
		int j = r-1;
		int temp;
		while(i<=j)
		{
			
			
		while(a[i] < m)
		{
			i = i+1;
		}
		
		while(a[j] > m)
		{
			j = j-1;
		}
		
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		i = i+1;
		j = j-1;
		
		}
		
		
		return j;
	}
	
	
	static void find(int a[],int l,int r)
	{
		while(l<r)
		{
		int m = qsrt(a,l,r);
		find(a,l,m-1);
		find(a,m+1,r);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		QuickSort q1 = new QuickSort();
		Scanner s1  = new Scanner(System.in);
		int n = s1.nextInt();
		int b[] = new int[10];
		int a[] = {5,7,365,54,3,2,9,4,4,2};
		System.out.println("hello");
		q1.find(a, 0, a.length-1);
		//System.out.println(5/0);
		for(int i:a)
		{
			System.out.println(i);
		}
	

	}

}
