package FirstPackage;

public class Incrementdecrement {

	public static void main(String[] args)
	{
		int x = 10;
		int y = 10;
		x++;
		++y;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x++);
		System.out.println(++y);
		
		/*
		 * The x++ the post increment operator will increase the value of
		 * x after the current use
		 *  
		 *  the ++x the pre increment operator will first increase the value 
		 *  of x and then uses it increments value
		 */
		
		
		x += 6; // x =x +6
		y -= 3; // y = y-3
		System.out.println(x);
		System.out.println(y);
		
		x *= 5;
		System.out.println(x);
		
		
	}
	
}
