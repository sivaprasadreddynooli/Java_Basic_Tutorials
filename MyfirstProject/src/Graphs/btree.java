package Graphs;

import java.util.*;

class NNode{
	int value;
	NNode left;
	NNode right;
	
	NNode(int v)
	{
		value = v;
		left = null;
		right = null;
	}
	

}


public class btree {

	NNode root;
	
	btree()
	{
		
	}
	
	NNode constr(int arr[],NNode root,int i)
	{
		
		if(i < arr.length)
		{
			
			NNode temp = new NNode(arr[i]);
			
			root = temp;
			
			root.left = constr(arr,root.left,2*i + 1);
			root.right = constr(arr,root.right,2*i + 2);
		}
		
		return root;
	}
	
	void inorder(NNode root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.println(root.value);
			inorder(root.right);
		}
	}
	
	
	public static void main(String[] args) {
		
		btree tree = new btree();
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };

		tree.root = tree.constr(arr,tree.root,0);
		
		tree.inorder(tree.root);
		
	}

}
