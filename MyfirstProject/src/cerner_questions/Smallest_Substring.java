package cerner_questions;

import java.util.Scanner;

public class Smallest_Substring {

	
	static boolean find(String sen)
	{
		
		int n = sen.length();
		for(int i=n/2;i>0;i--)
		{
			if(n%i == 0)
			{
				int m = n/i;
				StringBuilder temp = new StringBuilder();
				for(int j=0;j<m;j++)
				{
					temp.append(sen.substring(0,i));
				}
				if(sen.contentEquals(temp))
				{
					return true;
				}
				
			}
			
		}
		
		return false;
	}

	public static void main(String []args)
	{
		Scanner s1 = new Scanner(System.in);
		
		String sen  = s1.nextLine();
		System.out.println(find(sen));
	}	
}
