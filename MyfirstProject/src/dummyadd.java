
import java.util.*;

public class dummyadd {

	
	public static int negate(int a)
	{
		int neg = 0;
		int delta =  a<0?1:-1;
		while(a!=0)
		{
			neg+=delta;
			a+=delta;
		}
		return neg;
	}
	
	
	public static int negatedelta(int a)
	{
		int neg = 0;
		int delta = a<0?1:-1;
		boolean isdiffsame;
		while(a!=0)
		{
			isdiffsame = ((a+delta <0 ) == (a<0));
			if(!isdiffsame)
			{
				delta = a<0?1:-1;
			}
			neg+=delta;
			a+=delta;
			delta+=delta;
		}
		
		return neg;
	}
	
	public static void main(String args[])
	{
	
		System.out.println(negate(-10));
		System.out.println(negate(67));
		System.out.println(negate(0));
		System.out.println(negate(-1));
		System.out.println(negate(2));
	
	
		System.out.println(negatedelta(-10));
		System.out.println(negatedelta(67));
		System.out.println(negatedelta(0));
		System.out.println(negatedelta(-1));
		System.out.println(negatedelta(2));
	}
}
