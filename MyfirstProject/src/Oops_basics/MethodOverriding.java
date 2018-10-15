package Oops_basics;

import java.util.*;

/*
 If subclass (child class) has the same method as declared in the parent class, 
 it is known as method overriding in java.

In other words, If subclass provides the specific implementation of the method that has been provided by one
of its parent class, it is known as method overriding.

Rules for Java Method Overriding
method must have same name as in the parent class
method must have same parameter as in the parent class.
must be IS-A relationship (inheritance).
 */
class vehicle{
		
	void run()
	{
	System.out.println("vehicle startred");
	}
}

class bike extends vehicle
{
	}

class car extends vehicle{
	void run()
	{
		System.out.println("car has started");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		bike b1 = new bike();
		b1.run();
		car c1 = new car();
		c1.run();
		
	}

}
