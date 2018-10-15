
import java.util.*;

public class dummyrecursiveknightproblem {

	
	public static boolean solve(int a[][],int col)
	{	
		if(col >= a.length)
		{
			return true;
		}	
		
		for(int i=0;i<a.length;i++)
		{
			if(validate(a,i,col))
			{
				a[i][col] = 1;
				if(solve(a,col+1))
				{
					return true;
				}
				a[i][col] = 0;
			}
		}
		
		return false;
	}
	
	
	public static boolean validate(int a[][],int n,int m)
	{
		
		for(int i=0;i<=m;i++)
		{
			
		    if(a[n][i] == 1)
			{
				return false;
			}
		}
		
		
		for(int i=n,j=m;i>=0 && j>=0;i--,j--)
		{
				if(a[i][j] == 1)
				{
					return false;
				}
		}
		
		for(int i=n,j=m;i<a.length && j>=0;i++,j--)
		{
				if(a[i][j] == 1)
				{
					return false;
				}
		}

		
		return true;
	}
	
	
	public static void main(String args[])
	{
		
		
		int a[][] ={{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0}};
			
		solve(a,0);
		
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
