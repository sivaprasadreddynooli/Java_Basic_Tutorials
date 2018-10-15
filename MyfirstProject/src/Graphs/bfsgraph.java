package Graphs;
import java.util.*;
public class bfsgraph {

	private int V;
	private LinkedList adj[];
	
	bfsgraph(int v)
	{
		V = v;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++)
		{
			adj[i] = new LinkedList();	
		}
	}
	
	void addedge(int v,int w)
	{
		adj[v].add(w);
	}
	
	void bfssearch(int v)
	{
		
		boolean visited[] = new boolean[V];
		
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		visited[v] = true;
		q.add(v);
		
		while(q.size() !=0 )
		{
			int n = q.poll();
			System.out.println(n + " ");
			
			Iterator<Integer> i = adj[n].listIterator();
			
			while(i.hasNext())
			{
			
				int m = i.next();
				if( !visited[m])
				{
					visited[m] = true;
					q.add(m);
				}
				
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		bfsgraph bg = new bfsgraph(5);
		bg.addedge(0, 1);
		bg.addedge(0, 3);
		bg.addedge(3, 4);
		bg.addedge(3, 2);
		
		bg.bfssearch(0);

	}

}
