package cerner_questions;

import java.util.*;

public class Question_coins_problem {


	static int find(int v,int a[],int n)
	{
		
	int b[] = new int[v+1];
	
	
	for(int i=0;i<v+1;i++)
	{
		b[i] = Integer.MAX_VALUE;
	}
	
	int res;
	for(int i=1;i<v+1;i++)
		
	{
		
		for(int j=0;j<n;j++)
		{
			if(a[j] == i)
			{
				b[i] = 1;
				break;
			}
			else if(i > a[j])
			{
				b[i] = min(1+b[i-a[j]],b[i]);
			}
		}
		
	}
	
	return b[v];
	}
	static int min(int a,int b)
	{
		return a>b? b:a;
	}
	
	static int max(int a,int b)
	{
		return a>b? a:b;
	}
	
	
	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		int value = s1.nextInt();
		int a[] = {1,3,5};
		System.out.println(find(value,a,3));

	}

}
