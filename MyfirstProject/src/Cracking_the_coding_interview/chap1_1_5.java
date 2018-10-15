package Cracking_the_coding_interview;

import java.util.*;

public class chap1_1_5 {

	static boolean comapare(String s1, String s2)
	{
		boolean diff = false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				if(diff)
				{
					return false;
				}
				else
				{
					diff = true;
				}
			}
		}
		return true;
	}
	
	static boolean find(String s1,String s2)
	{
		if(s1.length() == s2.length())
		{
			return comapare(s1,s2);
		}
		
		String string1 = s1.length() > s2.length() ? s2:s1;
		String string2 = s1.length() > s2.length() ? s1:s2;
		
		int i=0;
		int j=0;
		
		boolean diff = false;
		
		while(i<string1.length() && j<string2.length())
		{
			
		if(string1.charAt(i) != string2.charAt(j))
		{
			if(diff)
			{
				return false;
			}
			else
			{
				diff = true;
			}
			j = j+1;
		}
		else
		{
			i = i+1;
			j = j+1;
		}
		}
			
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		System.out.println(find(s1,s2));

	}

}
