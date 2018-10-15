package Algorithms;

import java.util.*;

public class AnagramsTemplate438 {

	
	
	public int calculate(String s,String t)
	{
		int result = 0;
		List<Integer> l1 = new LinkedList<>();
		if(t.length() > s.length())
		{
			return 0;
		}
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c:t.toCharArray())
		{
				map.put(c, map.getOrDefault(c, 0) + 1);	
		}
		int counter = map.size();
		int end = 0,begin = 0;
		int len = Integer.MAX_VALUE;	
		while(end<s.length())
		{
			char c = s.charAt(end);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)-1);
				if(map.get(c) == 0)
				{
					counter--;
				}	
			}
			end++;
			while(counter == 0)
			{
				char tempc  = s.charAt(begin);
				if(map.containsKey(tempc))
				{
					map.put(tempc, map.get(tempc) + 1);
					if(map.get(tempc) > 0 )
					{
						counter++;
					}	
				}
				begin++;	
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnagramsTemplate438  n1 = new AnagramsTemplate438();
		
		int r = n1.calculate("abcdfghj","cdf");
		
	}

}
