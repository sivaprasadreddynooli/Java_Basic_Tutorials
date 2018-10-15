package FirstPackage;

public class Employee {

	int id;
	String name;
	static int employee_count=0;
	
	public Employee(int idd,String namee){
		++employee_count;
		id = idd;
		name = namee;
			
	}
	public int getEmployyeCount()
	{
		return employee_count;
	}
	
	public static void printMessage()
	{
		
		//you can't reference non static variables in static method
		//this will cause error, see below
		//++id; this will cause error
		System.out.println("hello world");
	}


}
