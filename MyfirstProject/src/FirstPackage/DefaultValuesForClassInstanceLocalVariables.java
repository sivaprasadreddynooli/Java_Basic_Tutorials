package FirstPackage;

//defualt initilization is applicable to only to the instance varibles, and default
//intilization is not applicable to the local variables and class variables.


class variables
{
	int x;//this is a instance variable
	static int count; // this is a class variable
	void trailmethod()
	{
		int y = 6;//this is a local variable
		System.out.println("this is in trail method");
	}	
}


public class DefaultValuesForClassInstanceLocalVariables {

	public static void main(String[] args) {
		variables v1 = new variables();
		System.out.println(v1.x + "  " + v1.count);

	}

}
