package Leetcode_printout_papers;

public class Set_Matriz_Zeros {

	static void find(int [][]a)
	{
		boolean firstrowzero = false;
		boolean firstcolumnzero = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i][0] == 0)
			{
				firstcolumnzero = true;
			}
		}
		
		for(int j = 0;j<a[0].length;j++)
		{
			if(a[0][j] == 0)
			{
				firstrowzero = true;
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
			for(int j=1;j<a[0].length;j++)
			{
				if(a[i][0] == 0 || a[0][j] == 0 )
				{
					a[i][j] = 0;
				}
			}
		}
		
		
		if(firstcolumnzero)
		{
			for(int i=0;i<a.length;i++)
			{
				a[i][0] = 0;
			}
		}
		
		if(firstrowzero)
		{
			for(int i=0;i<a[0].length;i++)
			{
				a[0][i] = 0;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int [][]a = {{1,2,4},{5,6,7},{8,9,0}};
		find(a);
		System.out.println(a);
	

	}

}
