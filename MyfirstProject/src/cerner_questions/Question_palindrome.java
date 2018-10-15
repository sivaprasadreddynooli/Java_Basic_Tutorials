package cerner_questions;

import java.util.*;
import java.lang.*;

public class Question_palindrome {

	
	
	static boolean ispalindrome(int a)
	{
		return a == reverseno(a);
	}
	
	static int check(int a)
	{
		int r = reverseno(a);
		int count = 0;
		while(!(ispalindrome(r+a)))
		{
			a = r+a;
			r = reverseno(a);
			count = count +1;
		}
		return count;
	}
	

	static int reverseno(int a)
	{
		int res = a%10;
		a = a/10;
		while(a > 0)
		{
			int re = a%10;
			res  = res*(10) + re; 
			a = a / 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		s1.close();
		System.out.println(check(a));

	}

}
