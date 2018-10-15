package Leetcode_printout_papers;

import java.util.Scanner;
import java.util.*;
public class Valid_Paranthesis {

	static boolean find(String sen)
	{
		
		HashMap<Character,Character> hp = new HashMap<Character,Character>();
		Stack<Character> stack = new Stack<Character>();
		hp.put('[', ']');
		hp.put('(', ')');
		hp.put('{', '}');
		
		char ch[] = sen.toCharArray();
		for(char c:ch)
		{
			if(hp.keySet().contains(c))
			{
				stack.push(c);
			}
			else
			{
				if(hp.values().contains(c))
				{
					if(hp.get(stack.pop()) == c)
					{
						continue;
					}
					else
					{
						return false;
					}
				}
			}
		}
		if(stack.isEmpty())
		return true;
		else
		return false;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String sen = s1.next();
		System.out.println(find(sen));

	}

}
