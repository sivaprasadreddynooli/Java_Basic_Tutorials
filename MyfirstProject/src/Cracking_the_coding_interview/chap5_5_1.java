package Cracking_the_coding_interview;

public class chap5_5_1 {

	public static void main(String[] args) {
		int a = 1024;
		int b= 19;
		
		int i = 2;
		int j = 6;
		
		int set = 0;
		
		for(int p = i;p<j;p++)
		{
			set = set | (1 << i);
		}
			
		set = ~set;
		
		a = a & set;
		
		/*
		for(int p=0;p<2;p++)
		{
			b = b << 1;
		}
		*/
	
		b = b << i;
		
		a = a | b;
		
		System.out.println(a);


	}

}
