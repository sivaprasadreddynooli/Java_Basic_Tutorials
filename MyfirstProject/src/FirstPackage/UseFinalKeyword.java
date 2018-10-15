package FirstPackage;

public class UseFinalKeyword {

	public static void main(String[] args)
	{
		FinalKeyword k1 = new FinalKeyword();
		
		
		//the below two statements will give error, as they are trying to
		//assign values to the final type instance variables
		//k1.id = 456;
		//k1.pi = 45.67;
		
		
		System.out.println(k1.id);
	}
	
}
