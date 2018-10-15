package Cracking_the_coding_interview;

public class chap5_6_1 {

	public static void main(String[] args) {
		int n = 29;
		int m = 15;
		
		int i = 0;
		
		int count =0;
		
		System.out.println(3 >> 1);
		System.out.println(1 >> 1);
		System.out.println((1&1) == (0&1));
		System.out.println("  ");
		
		
		count = count +  (n & 1) == (m & 1)? 0:1;
		
		while( n != 0 || m != 0)
		{
			
			System.out.println(n);
			System.out.println(m);
			System.out.println(count);
			System.out.println("  ");
			
			n = n >> 1;
			m = m >> 1;
			
			count  =  count  +  (n & 1) == (m & 1)? 0:1;
			
		}

		System.out.println(count);
	}

}
