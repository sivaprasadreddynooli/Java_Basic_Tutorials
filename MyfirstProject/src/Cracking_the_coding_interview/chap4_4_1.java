package Cracking_the_coding_interview;

import java.util.*;

public class chap4_4_1 {

	private int V;
	private LinkedList<Integer> adj[];
	
	chap4_4_1(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for(int i = 0;i<V;i++)
		{
			adj[i] = new LinkedList();
		}
		
		
	}
	
	
	void addedge(int v,int w)
	{
		adj[v].add(w);
	}
	
	
	
	boolean dfsutil(int f1,int f2,boolean[] visited)
	{

		visited[f1] = true;
		
		
		if (f1 == f2)
		{
			return true;
		}
		 Iterator<Integer> I = adj[f1].iterator();

		while(I.hasNext())
		{
			int n = I.next();
			
			if (n == f2)
			{
				return true;
			}
			
			else if (!visited[n])
				{
						if (dfsutil(n,f2,visited))
						{
							return true;
						}
				 }
			
		}
		return false;
	}
	
	boolean find(int f1,int f2)
	{
		
		boolean visited[] = new boolean[V];
		
		return dfsutil(f1,f2,visited);
		
	}
	
	
	public static void main(String[] args) {
		chap4_4_1 tree = new chap4_4_1(10);
		
		tree.addedge(0, 1);
		tree.addedge(1,2);
		tree.addedge(2,4);
		tree.addedge(4,8);
		tree.addedge(8,9);
		tree.addedge(1,7);
		tree.addedge(2,6);
		tree.addedge(2,5);
		tree.addedge(4,3);
		tree.addedge(8,3);

		System.out.println(tree.find(5,8));
		
		
		

	}

}
