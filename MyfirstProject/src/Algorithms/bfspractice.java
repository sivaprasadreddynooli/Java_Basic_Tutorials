package Algorithms;

import java.util.*;

class gf
{
int V;
LinkedList adj[];
gf(int v)
{
	V =v;
	adj = new LinkedList[V];
	for(int i=0;i<v;i++)
	{
		adj[i] = new LinkedList();
	}
}

void addedge(int v, int w)
{
adj[v].add(w);	
}

void traverse(int n)
{
	
	boolean b[] = new boolean[V];
	bfsutil(n,b);
}

void bfsutil(int n,boolean b[])
{

	
	b[n] = true;
	System.out.println(n + " ");
	
	Iterator<Integer> i = adj[n].listIterator();
	while(i.hasNext())
	{
		int p = i.next();
		
		while(!b[p])
		{
			
			bfsutil(p,b);
		}
		
		
	}
	
	
	
}

}
public class bfspractice {

	public static void main(String[] args) {
		gf g1 = new gf(5);
		g1.addedge(2,3);
		g1.addedge(2,4);
		g1.addedge(3,4);
		g1.addedge(3,1);
		g1.addedge(0,3);
		g1.traverse(2);

	}

}
