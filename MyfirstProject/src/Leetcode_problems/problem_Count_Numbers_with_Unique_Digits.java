package Leetcode_problems;
public class problem_Count_Numbers_with_Unique_Digits {
	public int calc(int n)
	{
		int count = 10;
		if (n == 1)
		{
			return count;
		}
		for(int i=2;i<=n;i++)
		{
			int p = 9;
			int rem = 9;
			for(int j=1;j<=(i-1);j++,p--)
			{
				rem = rem * p ;
			}		
			count = count + rem;
		}
		return count;
	}
	public static void main(String[] args) {
		problem_Count_Numbers_with_Unique_Digits p1 = new problem_Count_Numbers_with_Unique_Digits();
		System.out.println(p1.calc(2));
	}

}
