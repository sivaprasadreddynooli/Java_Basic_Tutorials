package Algorithms;

import java.util.*;

class bfs
{
int V;
LinkedList adj[];


bfs(int v)
{
V =v;
adj = new LinkedList[V];
for(int i=0;i<v;i++)
{
	adj[i] = new LinkedList();
}

}


void addedge(int n,int w)
{
adj[n].add(w);	
}


void traverse(int n)
{

	boolean b[] = new boolean[V];
	
	Queue<Integer> q = new LinkedList();
	
	q.add(n);
	b[n] = true;
	while(!q.isEmpty())
	{
		int t = q.poll();
		System.out.println(t + "");
		Iterator<Integer> i = adj[t].listIterator();
		
		while(i.hasNext())
		{
			int p = i.next();
			if(!b[p])
			{
				q.add(p);
				b[p] = true;
			}
		}
	}
	
	
	
}

}


public class BFSgraph {

	public static void main(String[] args) {
	bfs b1 =new bfs(5);
	b1.addedge(2,3);
	b1.addedge(2,4);
	b1.addedge(3,4);
	b1.addedge(3,1);
	b1.addedge(3,0);
	
	b1.traverse(2);

	}

}
