package cerner_questions;

import java.util.Scanner;

public class question_charactere_and_number_matching {

	
	static String find(String sen)
	{
		
		char ch[] = sen.toCharArray();
		String s2 = new String();
		for(int i=0;i<ch.length;i++)
		{
			int diff = ch[i] - 'a';
			if(diff >= 0 && diff <= 25)
			{
				s2 = s2 + Integer.toString(diff);
			}
			else
			{
				return "None";
			}
			
		}
		
		
		return s2;
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String sen = s1.next();
		System.out.println(find(sen));
		

	}

}
