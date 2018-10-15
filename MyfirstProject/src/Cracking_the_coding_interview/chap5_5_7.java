package Cracking_the_coding_interview;

public class chap5_5_7 {

	public static void main(String[] args) {
		
		
		int n = 29;
		int m = n;
		
		int i = 0;
		
		while(m != 0)
		{
			
			int i0 = (n & (1 << i));
			int i1 = (n & (1 << (i+1)));
			
			n = n ^ (i0 << i+1);
			n = n ^ (i1 >> i);
			
			i = i +1;
			
			m = m >> 2;
			
		}
		
	 System.out.println(n);

	}

}
