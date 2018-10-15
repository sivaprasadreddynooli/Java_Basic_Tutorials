package Cracking_the_coding_interview;

public class chap1_1_8 {

	static void nullifyrow(int a[][],int row)
	{
		
		for(int i=0;i<a[0].length;i++)
		{
			a[row][i] = 0;
		}
	}
	
	static void nullifycolumn(int a[][],int column)
	{
	
		for(int i=0;i<a.length;i++)
		{
			a[i][column] = 0;
		}
	}
	
	static void find(int a[][])
	{
		
		boolean firstrow = false;
		boolean firstcolumn = false;
		
		for(int i=0;i<a[0].length;i++)
		{
			if(a[0][i] == 0)
			{
				firstrow = true;
			}
		}
		
		

		for(int i=0;i<a.length;i++)
		{
			if(a[i][0] == 0)
			{
				firstcolumn = true;
			}
		}
		
		for(int i=1;i<a.length;i++)
		{
		
			for(int j=1;j<a[0].length;j++)
			{
				if(a[i][j] == 0)
				{
					a[i][0] = 0;
					a[0][j] = 0;
				}
			}
		}
		
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i][0] == 0)
			{
				nullifyrow(a,i);
			}
			
		}
		
		

		for(int i=1;i<a[0].length;i++)
		{
			if(a[0][i] == 0)
			{
				nullifycolumn(a,i);
			}
			
		}
		
		
		
		if(firstrow)
		{
			for(int i=0;i<a[0].length;i++)
			{
				a[0][i] = 0;
			}
		}
		
		
		if(firstcolumn)
		{
			for(int i=0;i<a.length;i++)
			{
				a[i][0] = 0;
			}
		}
		
		
	}
		
	
	
		
		
	
	
	
	
	
	public static void main(String[] args) {
		
		int a[][] = {{1,2,0},
					{4,0,6},
					{7,8,9}};
		find(a);
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		
	}
}
