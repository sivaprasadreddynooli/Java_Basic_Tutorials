package Cracking_the_coding_Interview_16th_chapter;

public class problem_16_5 {

	public static void main(String[] args)
	{
		int n = 100;
		
		
		int count = 0;
		for(int i=5;i<n;i=i*5)
		{
			count = count + n/i;
		}
		System.out.println(count);
		
	}
	
}
