package Cracking_the_coding_Interview_16th_chapter;

import java.util.*;

public class problem_16_1 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 3;
		System.out.println("the value of a " + a);
		System.out.println("the value of b " + b);

		a = a + b;
		b = a - b;
		a = a-b;
	
		System.out.println("the value of a " + a);
		System.out.println("the value of b " + b);
		
	}

}
