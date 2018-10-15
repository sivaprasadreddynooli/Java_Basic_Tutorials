package Cracking_the_coding_interview;

import java.util.*;

public class chap1_1_2 {

	
	public static boolean validate(String n1,String n2)
	{
		
		HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
		
		char[] c1 = n1.toCharArray();
		char[] c2 = n2.toCharArray();
		
		
		for(char c:c1)
		{
			if(hm1.containsKey(c))
			{
				hm1.put(c, hm1.get(c) + 1);
			}
			else
			{
				hm1.put(c, 1);
			}
		}
		
		
		for(char c:c2)
		{
			if(hm1.containsKey(c))
			{
				if(hm1.get(c) > 0)
				{
					hm1.put(c, hm1.get(c)-1);
				}
				else
				{
					return false;
				}
				
			}
			else
			{	
				return false;
			}
			
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
	
		String n1 = "siva";
		
		String n2 = "saiz";
		
		boolean result =  ( validate(n1,n2) || validate(n2,n1) );
		System.out.println(result);
		

	}

}
