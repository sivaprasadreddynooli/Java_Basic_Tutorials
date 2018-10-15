package Oops_basics;
//Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
//They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler 
//by the number of parameters in the list and their types.
class student6
{
	int id;
	String name;
	String school;
	student6(int a,String b)
	{
		id = a;
		name = b;	
	}
	student6(int a,String b, String c)
	{
		id = a;
		b = name;
		c = school;
	}	
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		student6 s1 = new student6(2,"siva");
		student6 s2 = new student6(2,"reddy","chaitanya");
	}
}
