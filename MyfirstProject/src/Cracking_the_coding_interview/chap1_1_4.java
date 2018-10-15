package Cracking_the_coding_interview;

import java.util.*;

public class chap1_1_4 {

	public static void main(String[] args) {
		
		String name = "sivav a isz";
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		int oddcount = 0;
		
		char[] c = name.toCharArray();
		
		for(char c1:c)
		{
			if(c1 != ' ')
			{
			if(hm.containsKey(c1))
			{
				hm.put(c1, hm.get(c1)+1);
			}
			else
			{
				hm.put(c1, 1);
			}
			}
			
		}
		
		
		for(int value:hm.values())
		{
			if(value%2 != 0)
			{
				oddcount += 1;
			}
		}
		
		
		System.out.println(oddcount == 1? true: oddcount == 0? true:false);
		
		

	}

}
