
import java.util.*;


public class dummyaddf {

	
	public static int sum(int a,int b)
	{
		int res = 0;
		res = a^b;
		int carry = 0;
		carry = ((a&b) << 1);
		if(carry != 0)
		{
		return sum(res,carry);
		}
		return res;
	}
	
	public static void main(String args[])
	{
		
		int a = 10;
		int b = 56;
		
		System.out.print(sum(a,b));
		
	}
	
}
