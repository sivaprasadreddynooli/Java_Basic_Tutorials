package Cracking_the_coding_interview;

import java.util.*;

public class chap8_8_7 {

	static List<String> find(String s)
	{
		List<String> ls = new ArrayList<String>();
		char [] ch = s.toCharArray();
		Arrays.sort(ch);
		String res = new String(ch);
		helper(ls,new String(),res,new boolean[s.length()]);
		return ls;	
	}
	static void helper(List<String> ls,String temp,String s,boolean used[])
	{
		if(temp.length() == s.length())
		{
			ls.add(temp);
		}
		for(int i=0;i<s.length();i++)
		{
			if( used[i] || i > 0 && s.charAt(i-1) == s.charAt(i) && !used[i-1]) continue;
			used[i] = true;
			temp = temp + s.charAt(i);
			helper(ls,temp,s,used);
			used[i] = false;
			temp = temp.substring(0,temp.length()-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		String s = "abcc";
		List<String>  res = new ArrayList<String>();
		res = find(s);
		for(String temp:res)
		{
			System.out.println(temp);
		}

	}

}
