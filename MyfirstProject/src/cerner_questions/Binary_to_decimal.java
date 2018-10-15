package cerner_questions;

import java.util.Scanner;

public class Binary_to_decimal {

	
	static int power(int b)
	{
		int res = 1;
		if(b == 0)
		{
			return res;
		}
		else
		{
			
			for(int i =0;i<b;i++)
			{
				res =  res * 2; 
			}
		}
		return res;
	}
	
	static int find(String sen)
	{
	
		char ch[] = sen.toCharArray();
		int n = ch.length-1;
		int res = 0;
		int count = 0;
		while(n >= 0)
		{
			
			if(ch[n] == '1')
			{
				res = res + power(count);
			}	
			count++;
			n = n-1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String sen = s1.next();
		
		System.out.println(find(sen));

	}

}
