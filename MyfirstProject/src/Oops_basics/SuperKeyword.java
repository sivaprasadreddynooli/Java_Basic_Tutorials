package Oops_basics;

/*

super keyword in java
The super keyword in java is a reference variable which is used to refer immediate parent class object.

Whenever you create the instance of subclass, an instance of parent class is created implicitly 
which is referred by super reference variable.

Usage of java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.

Note: super() is added in each class constructor automatically by compiler if there is no super() or this().

*/
class Animal1{
	String color = "red";
	Animal1()
	{
		System.out.println("this is animal class constructor");
	}
	void eat()
	{
		System.out.println("animal is eating");
	}	
}

class cat extends Animal1{
	String colot = "black";
	cat()
	{
		
		System.out.println("this is cat class constructor");
	}
	
	void display()
	{
		System.out.println(colot + "  " + super.color);
	}
	
	void eat()
	{
		System.out.println("cat is eating");
		super.eat();
	}
	
}



public class SuperKeyword {

	public static void main(String[] args) {
		
		cat c1 = new cat();
		c1.display();
		c1.eat();

	}

}
