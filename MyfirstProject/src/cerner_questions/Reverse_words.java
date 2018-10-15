package cerner_questions;

import java.util.Scanner;

public class Reverse_words {

	
	static void reverse(char[] ch,int i,int j)
	{
	char  temp;
		while(i<= j)
		{
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
	}
	static String find(String sen)
	{
		char ch[] = sen.toCharArray();
		int i = 0;
		int n = ch.length;
		int j = 0;
		while(i < n && j< n )
		{
			while( i < n && j< n && ch[i] == ' ')
			{
				i = i+1;
			}
			j = i;
			while(i < n && j< n && !(ch[j] == ' '))
			{
				j = j+1;
			}
			reverse(ch,i,j-1);
			i = j;
		
		}
		return new String(ch);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		String sen = s1.nextLine();
		System.out.println(sen);

		System.out.println(find(sen));

	}

}
