package FirstPackage;

/*
Java is different from many other languages in that all method parameters 
are passed by value. In fact, they cannot be passed by reference. For value 
data types (primitive types) this means that only a local copy of the 
variable is changed within the method, so the change will not affect the 
original variable. For reference data types (classes, interfaces and arrays)
 it means that only a copy of the memory address is passed to the method.
Therefore, if the entire object is replaced the change will not propagate 
back to the caller, but changes to the object will affect the original 
since the copy points to the same memory location. 
*/


public class MethodParametersPassByReference {

	public void set_value(int b)
	{
		b = 10;
	}
	
	public void set_value(int[] a )
	{
		a[0] = 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodParametersPassByReference m1 = new MethodParametersPassByReference();
		int x = 5;
		int[] y = {3};
		m1.set_value(x);
		//this will print the actual value that is 5
		System.out.println("Value of a after setting " + x);
		m1.set_value(y);
		//this will print the changed value 10
		System.out.println("value of b after setting " + y[0]);
		
		
	}

}
