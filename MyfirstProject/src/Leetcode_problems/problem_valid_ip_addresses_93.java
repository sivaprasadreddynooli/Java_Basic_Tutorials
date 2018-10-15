package Leetcode_problems;

import java.util.*;

public class problem_valid_ip_addresses_93 {

	public static boolean validate(String s)
	{
		String x = s;
		//System.out.println(s);
		if( Integer.parseInt(x) < 256)
		{
			return true;
		}
		return false;
		
	}
	
	
	public static List<String> find(String y)
	{
		List<String> l1 = new ArrayList<>();
		
		for(int a=1;a<4;a++)
		{
			for(int b=1;b<4;b++)
			{
				for(int c=1;c<4;c++)
				{
					for(int d=1;d<4;d++)
					{
						if(a+b+c+d == y.length())
						{
						if(validate(y.substring(0, a)) && validate(y.substring(a, a+b)) && validate(y.substring(a+b, a+b+c)) && validate(y.substring(a+b+c, a+b+c+d)) )
						{
							l1.add(y.substring(0, a-1) + '.' + y.substring(a, b-1) + '.' + y.substring(b, c-1) + '.' + y.substring(c, d-1));
						}
				
						}
								
					}
				}
			}
		}
		
		return l1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "2554567856";
		find(a);
		

		
	}

}
