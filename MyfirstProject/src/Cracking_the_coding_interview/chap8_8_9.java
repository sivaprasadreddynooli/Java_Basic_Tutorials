package Cracking_the_coding_interview;

import java.util.Scanner;
import java.util.*;
public class chap8_8_9 {

	static Set<String> find(int n)
	{
		Set<String> res = new HashSet<String>();
		if(n == 0)
		{
			res.add("");
			return res;
		}		
		
		if(n == 1)
		{
			res.add("()");
			return res;
		}	
		
		Set<String> temp = find(n-1);
		
		for(String stemp:temp)
		{
			for(int i=0;i<stemp.length();i++)
			{
				String tempstring = new String();
				if(stemp.charAt(i) == '(')
				{
					tempstring = stemp.substring(0, i+1) + "()" + stemp.substring(i+1); 
					res.add(tempstring);
				}
				
			}
			//res.add(stemp);
			//String stemps = new String();
			//stemps = "()" +stemp;
			res.add("()"+stemp);
		
		}
			
		
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		Set<String> res = new HashSet<String>();
		res = find(a);
		for(String temp:res)
		{
			System.out.println(temp);
		}

	}

}
