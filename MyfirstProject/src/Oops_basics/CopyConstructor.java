package Oops_basics;
//In this example, we are going to copy the values of one object into another using java constructor.
//constructor returns the value , that is the current class instance
class student5
{		
	String name;
	int id;
	student5(int i,String value)
	{
		id = i;
		name = value;
	}
	student5(student5 s1)
	{
		name = s1.name;
		id = s1.id + 1;
	}
	void display()
	{
		System.out.println(name+ "  " + id);	
	}
}
public class CopyConstructor {
	public static void main(String[] args) {
		student5 s1 = new student5(1,"siva");
		student5 s2 = new student5(s1);
		s1.display();
		s2.display();
	}
}