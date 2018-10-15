package Oops_basics;

/*
The static keyword in java is used for memory management mainly.
 We can apply java static keyword with variables, methods, blocks and nested class. 
 The static keyword belongs to the class than instance of the class.

The static can be:

variable (also known as class variable)
method (also known as class method)
block
nested class


1) Java static variable
If you declare any variable as static, it is known static variable.

The static variable can be used to refer the common property of all objects 
(that is not unique for each object) e.g. company name of employees,college name of students etc.
The static variable gets memory only once in class area at the time of class loading.

If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it.



There are two main restrictions for the static method. They are:
The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.


3) Java static block
Is used to initialize the static data member.
It is executed before main method at the time of classloading.
*/

class student4{
	
	int rollno;
	String name;
	static String collegename = "CBIT";
	static int staticvariablecount = 0;
	int variablecount = 0;
	
	
	student4(int i,String value)
	{
		rollno = i;
		name = value;
		staticvariablecount++;
		variablecount++ ;
	}
	
	static void calculate(int n)
	{
		System.out.println(n*n-1);
	}
	
	void display()
	{
		System.out.println(rollno+ " " + name + "  " + collegename + " " + variablecount + " " + staticvariablecount);
	}
	
	static void change()
	{
	 collegename  = "VIT";
	}
}


public class StaticVariable {
	 static{System.out.println("static block is invoked");} 
	public static void main(String[] args) {
		student4 s1 = new student4(1,"siva");
		s1.display();
		student4 s2 = new student4(2,"ram");
		s2.display();
		
		student4.calculate(4);
		student4.change();
		
		
		student4 s3 = new student4(3,"hema");
		s3.display();
		
		student4 s4 = new student4(4,"mohan");
		s4.display();
		
		
	}

}
