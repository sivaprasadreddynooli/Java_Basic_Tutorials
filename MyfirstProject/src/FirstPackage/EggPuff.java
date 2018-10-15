package FirstPackage;

public class EggPuff extends Food {

	//Whenever we override a method from super class , we should take same 
	//arguments and same return type as the parent class and we cannot change
	//the scope of the subject that is we cannot change the access modifier
	//this has everything same as print method from Food class except logic
	//inside
	//this is overriding not over loading
	
	void print()
	{
		System.out.println("Egg puff is great to eat");
	}
	
}
