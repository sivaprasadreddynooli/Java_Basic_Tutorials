package FirstPackage;

public class StaticDescription {

	int number = 45;
	
	void display()
	{
		System.out.println("Display message");
	}
	
	
	static void displayStatic()
	{
		System.out.println("this is display message from static method");
	}
	
	public static void main(String[] args)
	{
		//we can't call a non static method directly from a static method
		//here a non static method named display() is called from
		//a static method named main
	    //below statement will give error
		//display();
		
		//to access a non static method from a static method 
		//we should create a instance and then we should access it
		StaticDescription d1 = new StaticDescription();
		d1.display();
		
		
		
		//we can call a static method directly from a static method
		//here a static method named displayStatic() is called from
		//another static method named main
		
 		displayStatic();
		
	}
	
	
	
}
