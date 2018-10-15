package Leetcode_printout_papers;

import java.util.*;

public class Solutions_Word_Break {

	static boolean find(String sen,Set<String> dict)
	{
		
		boolean a[] = new boolean[sen.length() + 1];
		a[0] = true;
		
		for(int i=0;i<sen.length();i++)
		{
			if(!a[i])
			continue;
			
			for(String s:dict)
			{
				int len = s.length();
				int end  = len+i;
				if(sen.substring(i, end).equals(s))
				{
					a[end] = true;
				}
			}
		}
		
		return a[sen.length()];
	}
	
	
	public static void main(String[] args) {
		String sen = "leetcode";
		Set<String> dict = new HashSet<String>();
		dict.add("leet");
		dict.add("codd");
		System.out.println(find(sen,dict));
	}

}
