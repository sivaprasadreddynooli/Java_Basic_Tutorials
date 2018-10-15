package Graphs;


 class node{
	
	public int value;
	public node left,right;
	
	public node(int v)
	{
		value = v;
		left = right = null;
	}
}


public class contree {

	public node root;
	
	contree(int v)
	{
		root = new node(v);
	}
	
	contree()
	{
		root = null;
	}
	
	
	void traverse(node a)
	{
		
		if (a == null)
			return;
		
		traverse(a.left);
		traverse(a.right);
		System.out.println(a.value);
	}
	
	
	public static void main(String[] args) {
		
		contree tree = new contree(1);
		
		tree.root.left = new node(2);
		tree.root.right = new node(3);
	
		tree.root.left.left = new node(4);
	
		tree.traverse(tree.root);
		

	}

}
