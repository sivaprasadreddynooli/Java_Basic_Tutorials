package Algorithms;



class Node{
	int data;
	Node right ;
	Node left;
	
	Node(int val)
	{
		data = val;
		left = right = null;
	}	
}


public class Binarytree {

	
	Node root;
	
	
	Binarytree()
	{
		root = null;
	}
	
	Binarytree(int val)
	{
		root = new Node(val);
		root.data = val;
		root.left = null;
		root.right = null;
	}

	
	void Traverse(Node root)
	{
		if(root == null)
		{
			
		}
		else
		{
			Traverse(root.left);
			System.out.println(root.data);
			Traverse(root.right);
		}
	}
	
	public static void main(String[] args) {
		Binarytree  b1 = new Binarytree(1);
		
		b1.root.left = new Node(2);
		b1.root.right = new Node(3);
		b1.root.left.left = new Node(4);
		b1.Traverse(b1.root);		
	}

}
