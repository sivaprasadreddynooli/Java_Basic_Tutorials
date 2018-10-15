package Graphs;

import java.util.*;

public class dfspractice {

	
	private int V;
	private LinkedList<Integer> adj[];
	
	void addedge(int v,int w)
	{
		adj[v].add(w);
	}

	
	dfspractice(int v)
	{
		V =v;
		adj = new LinkedList[V];
		
		for(int i =0 ;i<V;i++)
		{
			adj[i] = new LinkedList();
		}	
	}

	
	void dfsutil(int w,boolean val[])
	{
		
		val[w] = true;
		
		
		System.out.println(w + " ");
		
		Iterator<Integer> I = adj[w].listIterator();
		
		while(I.hasNext())
		{
			
			int n = I.next();
			if(!val[n])
			{
				dfsutil(n,val);
			}
			
			
		}
		
		
		
	}
	
	void dfs(int w)
	{
		
		boolean validate[] = new boolean[V];
		
		dfsutil(w,validate);		
	}
	
	public static void main(String[] args) {
	
		
		
		dfspractice df = new dfspractice(5);
	
		df.addedge(0, 1);
		df.addedge(0,3);
		df.addedge(3, 2);
		df.addedge(3, 4);
		
		
		df.dfs(1);

	}

}
