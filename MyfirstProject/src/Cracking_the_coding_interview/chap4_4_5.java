package Cracking_the_coding_interview;

class Node1
{
int data;
Node1 right;
Node1 left;
Node1(int val)
{
data = val;
}
}


public class chap4_4_5 {

	Node1 root; 
	
	boolean isbst(Node1 ref)
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
	chap4_4_5 c1 = new chap4_4_5();
	c1.root =  new Node1(40);
	c1.root.data = 44;
	c1.root.left = new Node1(23);
	c1.root.right = new Node1(55);
	
	c1.root.left.left = null;
	c1.root.left.right = null;
	
	c1.root.right.left = null;
	c1.root.right.right = null;
	
	

	System.out.println(c1.isbst(c1.root));
	
	}

}
