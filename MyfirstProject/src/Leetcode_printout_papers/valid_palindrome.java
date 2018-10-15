package Leetcode_printout_papers;

import java.util.Scanner;

public class valid_palindrome {

	static boolean find(String sen)
	{
		sen = sen.toLowerCase();
		int n = sen.length()-1;
		char[] ch = sen.toCharArray(); 
		int i = 0;
		int j = n;
		while(j>=0 && i<=n )
		{
			
			while(!(ch[i] >= 'a' && ch[i] <= 'z'))
			{
				i = i+1;
			}
			while(!(ch[j] >= 'a' && ch[j] <= 'z'))
			{
				j = j-1;
			}
			if(ch[i] != ch[j])
			{
				return false;
			}
			i = i+1;
			j = j-1;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner s1 =  new Scanner(System.in);
		String sen = s1.nextLine();
		System.out.println(find(sen));
		
		

	}

}
