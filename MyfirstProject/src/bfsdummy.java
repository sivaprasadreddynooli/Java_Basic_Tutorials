
import java.util.*;

class bfs
{
int V;
LinkedList<Integer> adj[];

bfs(int v)
{
	V = v;
adj = new LinkedList[v];
for(int i=0;i<v;i++)
{

	adj[i] = new LinkedList<Integer>();
}

}

void add(int v,int w)
{
adj[v].add(w);
}

void traverse(int i)
{

	Queue<Integer> res = new LinkedList<Integer>();
	
	res.add(i);
	
	int temp = 0;
	while(!res.isEmpty())
	{
		temp = res.poll();
		System.out.println(temp);
		for(Integer value:adj[temp])
		{
			res.add(value);
		}	
	}
}
}




public class bfsdummy {

	public static void main(String args[])
	{
		
		bfs b1 = new bfs(5);
		
		b1.add(2, 3);
		b1.add(2, 4);
		b1.add(2, 1);
		b1.add(3, 1);
		b1.add(0, 1);
		b1.add(4, 1);
		
		b1.traverse(2);
	}
	
}
