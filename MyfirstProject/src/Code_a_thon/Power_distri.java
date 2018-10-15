package Code_a_thon;

import java.util.*;
import java.io.*;
public class Power_distri {

	
	static long travarse(int i,long n,Set<Integer> st,long mat[][],long presum)
	{
		
		long value = presum;
		
		for(int j=0;j<n;j++)
		{
			if(st.size() == n)
			{
				return value;
			}
			
			if(mat[i][j] != 0 && (!st.contains(i) || !st.contains(j)))
			{
				value = mat[i][j] + value;
				st.add(j);
				st.add(i);
			}
		}
		
		if(st.size() == n)
		{
			return value;
		}
		else
		{
			for(int j=0;j<n;j++)
			{
				if(st.size() ==n)
				{
					return value;
				}
				
				if(!st.contains(j))
				{
					value = value + travarse(j,n,st,mat,value);
					st.add(j);
				}
			}
			return value;
		}

	}
	
	static long find(long mat[][])
	{	
		long min = Integer.MAX_VALUE;	
		long n = mat.length;
		for(int i=0;i<n;i++)
		{
			Set<Integer> st = new HashSet<Integer>();
			
			min = Math.min(travarse(i,n,st,mat,0),min);
			System.out.println("min value "+ min);
		}
		return min;
	}
	
	public static void main(String[] args)  throws IOException {
		Scanner s1 = new Scanner(System.in);
	List<Long> res = new ArrayList<Long>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String s = br.readLine();
		long a = Integer.parseInt(br.readLine());
		while(a!=0)
		{
		int n = Integer.parseInt(br.readLine());
		if(n==1)
		{	
			String s = br.readLine();
			String values[] = s.split(" ");
			int i = Integer.parseInt(values[0]);
			int iter = Integer.parseInt(values[1]);
			int next = Integer.parseInt(values[2]);
			long cost  = Integer.parseInt(values[3]);
			res.add(cost);	
		}
		else
		{
			long mat[][] = new long[n][n];
			while(n > 0)
			{
				String s = br.readLine();
				String values[] = s.split(" ");
				int i = Integer.parseInt(values[0]);
				int iter = Integer.parseInt(values[1]);
				int j = 2;
				while(iter!=0)
				{
					int next = Integer.parseInt(values[j]);
					long cost  = Integer.parseInt(values[j+1]);
					mat[i][next] = cost;
					mat[next][i] = cost;
					iter--;
					j = j+2;
				}
				n--;
				}
			res.add(find(mat));
		}
		a--;
		}
		for(Long value:res)
		{
			System.out.println(value);
		}
	}	
	

}
