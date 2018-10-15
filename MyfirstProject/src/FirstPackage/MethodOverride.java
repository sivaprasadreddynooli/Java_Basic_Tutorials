package FirstPackage;


class qqq
{

	void display()
	{
		System.out.println("this is method from qqq class");
	}
	
}
class www extends qqq
{
	void display()
	{
		System.out.println("this is method from www class");
	}

}

public class MethodOverride {

	public static void main(String[] args) {
		qqq q1 = new www();
		q1.display();
		qqq q2 = new qqq();
		q2.display();
		www q3  =new www();
		q3.display();
		//www q4 = new qqq();
		//above statement will give error stating cannot convert from qqq to www 
	}

}
