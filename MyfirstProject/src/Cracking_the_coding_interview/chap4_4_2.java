package Cracking_the_coding_interview;
import java.util.*;
class Node
{
	int data;
	Node  right;
	Node left;
	Node(int val)
	{
		data = val;
		right = left = null;
	}
}


public class chap4_4_2 {

Node root;
	
Node buildtree(int a[],int l,int r)
{
	if(l<=r){
	int m = (r+l)/2;
	
	Node n = new Node(a[m]);
	n.left = buildtree(a,l,m-1);
	n.right = buildtree(a,m+1,r);
	return n;
	}
	return null;
}


void traverse(Node ref)
{
if(ref == null)
	return;

traverse(ref.left);
traverse(ref.right);
System.out.println(ref.data);

}

void findlevels(ArrayList<LinkedList<Node>> lists, Node ref, int level)
{

	if(ref == null)
	{
		return;
	}
	
	LinkedList<Node> temp ;
	
	if(lists.size() == level)
	{
		temp = new LinkedList<Node>();
		lists.add(temp);
	}
	else
	{
		System.out.println("the size of list " + lists.size() + " the level is " + level);
	 temp = lists.get(level);
	}
	
	temp.add(ref);
	findlevels(lists,ref.left,level+1);
	findlevels(lists,ref.right,level+1);


}

boolean isbalanced(Node ref)
{

	if(ref == null)
	{
		return true;
	}
	
	return Math.abs(height(ref.left) - height(ref.right)) > 1? false:isbalanced(ref.left)?isbalanced(ref.right)?true:false:false;
	
}


int height(Node ref)
{
	if(ref == null)
	{
		return 0;
	}
	return Math.max(1+height(ref.left),1+height(ref.right));
}


boolean isbst(Node ref)
{
	
	if(ref == null)
	{
		return true;
	}
	
	if(isbst(ref.right) && isbst(ref.left))
	{	
		int main = ref.data;
		int rightvalue = ref.right != null? ref.right.data: Integer.MAX_VALUE;
		int leftvalue = ref.left != null ? ref.left.data: Integer.MIN_VALUE;
		return (main < rightvalue && leftvalue<main);
	}
	else
	{
		return false;
	}
}

	public static void main(String[] args) {
	
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
	chap4_4_2 c1 = new chap4_4_2();
		int a[] = {3,5,6,34,48,99,100};
		Node ref;
		ref = c1.buildtree(a,0,a.length-1);
		
		c1.traverse(ref);
		
		c1.findlevels(lists,ref,0);
		
		System.out.println(c1.isbalanced(ref));
		
		System.out.println("the tree is bst " + c1.isbst(ref));
		
		for(LinkedList<Node> temp:lists)
		{
			for(Node tempnode:temp)
			{
				System.out.print(tempnode.data + " ");
			}
			
			System.out.print("\n");
		}
		
	}
}
