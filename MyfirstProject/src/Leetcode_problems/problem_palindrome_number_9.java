package Leetcode_problems;

public class problem_palindrome_number_9 {

	
	public static boolean validate(int x)
	{
		if(x < 0  || x<10 )
			return false;
		int n =x;
		int reversedint = 0;
		while(n > reversedint)
		{
			reversedint = reversedint*10 + n%10;
			n = n/10;	
		}
		return (n == reversedint || n == reversedint/10);
	}
	
	
	public static void main(String[] args) {
		int a  = 1235675321;
		System.out.println(validate(a));

	}

}
