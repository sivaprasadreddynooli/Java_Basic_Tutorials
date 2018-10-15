package Oops_basics;

/*
If a class has multiple methods having same name but different in parameters, 
it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of arguments, 
if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then 
it may be difficult for you as well as other programmers to understand the behavior of the method because 
its name differs.


In java, Method Overloading is not possible by changing the return type of the method only.
*/

class Addops
{
int add(int a,int b)
{
	return a+b;
}
int add(int a,int b,int c)
{
	return a+b+c;
}
float add(float a,float b)
{
	return a+b;
}
}

public class MethodOverloading {
	public static void main(String[] args) {		
		Addops a1 = new Addops();
		System.out.println(a1.add(1,1));
		System.out.println(a1.add(1, 2,6));
	}
}
