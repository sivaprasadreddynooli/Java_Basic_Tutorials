package FirstPackage;

public class VegBiriyani extends Food{
	
	
	//Whenever we override a method from super class , we should take same 
	//arguments and same return type as the parent class and we cannot change
	//the scope of the subject that is we cannot change the access modifier
	//this is overriding not over loading
	void print()
	{
		System.out.println("Veg Biriyani is great to eat");
	}
	
	
	//below method is overloaded method, over load method will have the same 
	//name as the above method,but can have different set of parameters,
	//return types. etc.
	//generally method overloading happens in the same class
	//below one is the overloaded method
	
	/*
	int print(int a)
	{
 		System.out.println("hello");
	    return 5;
	}
	*/
	

}
