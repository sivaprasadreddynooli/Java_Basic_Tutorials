package Leetcode_printout_papers;
import java.util.*;

public class String_To_Integer {
	static int find(String sen)
	{
		if(sen.length() == 0)
		{
			return 0;
		}
		int flag ;
	int n;
		if(sen.charAt(0) == '-')
		{
			flag = 1;
			 n = 1;
		}
		else
		{
			flag = 0;
			n = 0;
		}
		
		
		int res = 0;
		int count = 0;
		while(n<sen.length())
		{
			res = res*10  + sen.charAt(n) - '0' ; 
			n = n+1;
			count++;
			
		}	
		if(flag == 1)
		{
			res = -res;
		}

	return res;
	}
	
	
	static int power(int a,int b)
	{
		if(b == 0)
			return 1;
		int res = 1;
		for(int i=0;i<b;i++)
		{
			res = res * 10;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String sen = s1.next();
		System.out.println(find(sen));
	}

}
