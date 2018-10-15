package Leetcode_printout_papers;

import java.util.*;

public class Two_Sum {

	static int[] find(int []a,int target)
	{
	
		HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
		
		int b[] = new int[2] ;
		
		for(int i=0;i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
			{
				b[0] = hp.get(a[i])+1;
				b[1] = i+1;
				return b;
			}
			else
			{
				hp.put(target-a[i], i);
			}
		}
		return b;
	}
	
	
	public static void main(String[] args) {
		int a[] = {2,7,11,15};
		int target  = 9;
		int b[] = new int[2];
		b = find(a,target);
		
		System.out.println(b[0] + " " + b[1]);	

	}
}
