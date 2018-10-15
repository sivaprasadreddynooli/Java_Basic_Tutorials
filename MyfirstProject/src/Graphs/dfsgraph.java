package Graphs;

import java.util.*;

public class dfsgraph {

 private int V;
 private LinkedList<Integer> adj[];

 
 dfsgraph(int v)
 {
	 V = v;
	 adj = new LinkedList[v];
	 for(int i=0;i<V;i++)
	 {
		 adj[i] = new LinkedList();
	 }
	 
 }
 
 void addedge(int v, int w)
 {
	 adj[v].add(w);
 }
	
 void dfsutil(int v,boolean arr[])
 {
	 
	 arr[v] = true;
	 System.out.println(v+ " ");
	 
	 Iterator<Integer> I = adj[v].listIterator();
	 while(I.hasNext())
	 {
		 
		 
		 int n = I.next();
				 if( !arr[n])
				 {
					 
					 dfsutil(n,arr);
					 
				 }
		 
		 
	 }
	 
	 
	 
 }
 
 void dfssearch(int v)
 { 
	 boolean ba[] = new boolean[V];
	 
	 dfsutil(v,ba);
 }
 
	public static void main(String[] args) {
		
		dfsgraph gp = new dfsgraph(4);
		
		gp.addedge(0, 1);
		gp.addedge(0,2);
		gp.addedge(1, 2);
		gp.addedge(2, 0);
		gp.addedge(2, 3);
		gp.addedge(3, 3);
		gp.dfssearch(2);
	}
}
