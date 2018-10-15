package Leetcode_problems;

import java.util.*;

public class problem_pow_x_n_50 {

	public static double powercalc(double x,int y)
	{
		if(y == 0)
			return 1;
		return (y%2 == 0) ? powercalc(x*x,y/2) : x*powercalc(x*x,y/2);
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		double a = s1.nextDouble();
		int b = s1.nextInt();
		System.out.println("the output is " +  powercalc(a,b)) ;
		
		s1.close();
	}

}
