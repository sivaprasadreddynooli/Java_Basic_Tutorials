package Cracking_the_coding_interview;

import java.util.*;

public class chap8_8_4 {

	static List<List<Integer>> find(int a[])
	{
		List<List<Integer>> ls = new ArrayList<List<Integer>>();
		helper(ls,new ArrayList<Integer>(),a,0);
		return ls;
	}
	
	static void helper(List<List<Integer>> ls, ArrayList<Integer> temp ,int a[] , int start)
	{
		ls.add(new ArrayList<Integer>(temp));
		for(int i=start;i<a.length;i++)
		{
			temp.add(a[i]);
			helper(ls,temp,a,i+1);
			temp.remove(temp.size() - 1);
		}
	}
	
	
	public static void main(String[] args) {
		int a[] = {1,2,3};
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res = find(a);
		for(List<Integer> temp:res)
		{
				System.out.println(temp);
			
		}

	}

}
