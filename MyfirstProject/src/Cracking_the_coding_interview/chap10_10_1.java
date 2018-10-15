package Cracking_the_coding_interview;

//import FirstPackage.Arrays;

import java.util.*;

public class chap10_10_1 {

	static String[] find(String[] s)
	{
		
		for(int i=0;i<s.length;i++)
		{
			char ch[] =  new char[s.length];
			ch = s[i].toCharArray();
			Arrays.sort(ch);
			s[i] =  new String(ch);
		}
		
		Arrays.sort(s);
		return s;
	}
	
	public static void main(String[] args) {
		String s[] =  new String[5];
		
		s[0] = "siva";
		s[1] = "siav";
		s[2] = "reddy";
		s[3] = "redyd";
		s[4] = "prasad";
		
		find(s);
		
		for(String temp:s)
		{
			System.out.println(temp);
		}

	}

}
