package Cracking_the_coding_interview;

import java.util.*;

public class chap1_1_1 {

	public static boolean validate(String name)
	{
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		
		char[] c = name.toCharArray();
		
		for(char c1:c)
		{
			
			if(hm.containsKey(c1))
			{
				return false;
			}
			else
			{
				hm.put(c1, 1);
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		String name = "sivareddy";
		
		validate(name);

	}

}
