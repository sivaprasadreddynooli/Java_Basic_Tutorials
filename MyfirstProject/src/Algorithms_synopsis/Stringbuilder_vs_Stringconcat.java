package Algorithms_synopsis;

import java.util.*;

public class Stringbuilder_vs_Stringconcat {

	
	//its advisable to use StringBuilder instead of string concatenation.
	
	
	
	public static void main(String[] args) {
		
		String s = "";
		String[] names = {"siva","sai","hemanth","prasad","nath","reddy","kumar","teja"};
		
		for(String w:names)
		{
			s = s +  w + " "; 
		}
		
		System.out.println(s);
				
		
		StringBuilder b1 = new StringBuilder();
		
		
		for(String w:names)
		{
			b1.append(w + " ");
		}
		
		System.out.println(b1.toString());

	}

}
