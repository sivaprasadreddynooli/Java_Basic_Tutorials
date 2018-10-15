package Leetcode_printout_papers;

import java.util.*;

public class Evaluate_Reverse_Polish_Notation {

	
	static int find(String []args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		for(String s:args)
		{
			char c = s.charAt(0); 
			if(c == '*' )
			{
				stack.push(stack.pop() * stack.pop());
			}
			else if (c == '+')
			{
				stack.push(stack.pop() + stack.pop());
			}
			else if(c == '-' )
			{
				stack.push(stack.pop() - stack.pop());
			}
			else if (c == '/')
			{
				stack.push(stack.pop() / stack.pop());
			}
			else
			{
				stack.push(c - 48);
			}
		}
		
		return stack.pop();
	}
	
	public static void main(String[] args) {
		String token[] = {"2","3","*","5","+"};
		
		System.out.println(find(token));

	}

}
