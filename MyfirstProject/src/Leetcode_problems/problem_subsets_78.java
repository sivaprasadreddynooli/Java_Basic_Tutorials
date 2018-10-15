package Leetcode_problems;
import java.util.*;
public class problem_subsets_78 {
	public List<List<Integer>> find(int []a)
	{
		List<List<Integer>> lis = new ArrayList<List<Integer>>();
		Arrays.sort(a);
		helper(lis,new ArrayList<Integer>(),a,0);
		return lis;
	}
	public void helper(List<List<Integer>> lis,ArrayList<Integer> templist, int[] a,int start)
	{
		lis.add(new ArrayList<>(templist));
		for(int i=start;i<a.length;i++)
		{
			templist.add(a[i]);
			helper(lis,templist,a,i+1);
			templist.remove(templist.size() - 1);
		}
	}
	public static void main(String[] args) {
		problem_subsets_78 p1 = new problem_subsets_78();
		int a[] = {1,2,3,5,6,7};
		System.out.println(p1.find(a));
	}

}
