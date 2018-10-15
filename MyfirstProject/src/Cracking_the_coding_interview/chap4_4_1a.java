package Cracking_the_coding_interview;

import java.util.*;

public class chap4_4_1a {

	private int V;
	private LinkedList adj[];
	
	
	chap4_4_1a(int v)
	{
		V = v;
		adj = new  LinkedList[V];
		for(int i=0;i<V;i++)
		{
			adj[i] = new LinkedList();
		}
		
	}

	
	void addedge(int v,int w)
	{
		adj[v].add(w);
	}
	
	
boolean find(int f1,int f2)
{
	boolean visited[] = new boolean[V];
	
	
	
	
	LinkedList<Integer> queue = new LinkedList<Integer>();
	
	queue.add(f1);
	
	
	while(!queue.isEmpty())
	{
		int n= queue.poll();
		visited[n] = true;
		
		if(n == f2)
		{
			return true;
		}
		else
		{
			Iterator<Integer> I = adj[n].iterator();
			
			while(I.hasNext())
			{
				int m = I.next();
				if( !visited[m])
				{
					queue.add(m);
				}
				
			}
			
		}
		
		
	}
	
	return false;
}
	
	
	public static void main(String[] args) {
		chap4_4_1a tree = new chap4_4_1a(10);
		
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

		System.out.println(tree.find(9,3));
		
		
		

	}

}
