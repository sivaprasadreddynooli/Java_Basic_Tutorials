package Oops_basics;

interface bag
{
	void model();
	void size();
	void weight();
}

abstract class nike implements bag
{

	public void model()
	{
		System.out.println("this is nike model");
	}
	
}

class adidas extends nike
{
public void size()
{
	System.out.println("the size is 15 inches");
	
}

public void weight()
{
	System.out.println("weight is 5 lbs");
}

}

public class AbstractVsInterface {

	public static void main(String[] args) {
		bag b1 = new adidas();
		b1.size();
		b1.weight();
		b1.model();
	}

}
