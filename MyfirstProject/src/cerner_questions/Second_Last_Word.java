package cerner_questions;

import java.util.Scanner;

public class Second_Last_Word {

	static String find(String sen)
	{
		
		char ch[] = sen.toCharArray();
		int i = 0;
		int j = ch.length-1;
		while((j>=0 ) && (ch[j] == ' '))
		{
			j = j-1;
		}
		
		while((j>=i) && !(ch[j] == ' '))
		{
			j = j-1;
		}
		
		
		while((j>=i) && (ch[j] == ' '))
		{
			j = j-1;
		}
		
		int res = j;
		while((j>=i) && !(ch[j] == ' '))
		{
			j = j-1;
		}
		
		return sen.substring(j+1,res+1);
	}
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		String sen = s1.nextLine();
		System.out.println(find(sen));

	}

}
