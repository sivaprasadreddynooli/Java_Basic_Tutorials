package FirstPackage;

public class StudentUsage {

	
	public static void main(String[] args)
	{
		Student tom = new Student();
		//this is not the recommended way of assigning the values to 
		//the objects, as anyone can change the values by assigning the values
		//they want, so we will use getters and setters 
		//see Faculty class for more information	
		tom.id = 1;
	    tom.name = "Tom";
	    tom.age = 45;    
	    System.out.println("The " + tom.name + " age is " + tom.age);

	    
        Student siv = new Student();
		siv.id = 3;
	    siv.name = "Siva";
	    siv.age = 24;
	    System.out.println("The " + siv.name + " age is " + siv.age);
	    
	}
	
}
