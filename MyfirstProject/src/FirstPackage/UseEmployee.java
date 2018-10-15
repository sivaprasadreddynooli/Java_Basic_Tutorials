package FirstPackage;


public class UseEmployee {

	public static void main(String[] args)
	{
		
		//variables declared as static will be accessed from any object
		//created from the class and have memory allocated only once
		//that is during the creation of class
		//the variable will only be one and keeps incrementing
		//whenever we create the objects
		//look for the variable employeecount in Employee class
		
		Employee e1 = new Employee(2,"siva");
		System.out.println(e1.getEmployyeCount());
		
		Employee e2 = new Employee(3,"hema");
		System.out.println(e2.getEmployyeCount());
		
		//the static variable can be accessed directly from the varible
		//but not recommended
		System.out.println(e2.employee_count);
		
		
		
		
		//the static variable can be accessed directly through the class
		//we no need to create the instance of the class to access the static variable
		System.out.println(Employee.employee_count);
	     
		
		
		//static methods can be directly accessed through class name
		Employee.printMessage();
		
		
		//static methods can be accessed through the instance of the class 
		//but its not recommended
		e2.printMessage();
		
		
		//since variable id is not static, we cannot refer that through the class
		//this will give the error
		//first of all it don't know to which instance it should point to
		//below stetement will give the error
		//System.out.println(Employee.id);
		
		
		
		
		
		
		//finally
		//static is more related to the class rather than the instance of the class
		//its works better with the class name rather than the instance of the class
		
		
	
	}
	
}
