package FirstPackage;

class sameobject
{
	int x;
	int y;
	
	void func()
	{
		x = 4;
		y = 5;
		sameobject s1 = new sameobject(); //we can create the object of a class with the same class also.
		System.out.println("object creted");
		s1.x = 5;
		s1.y = 6;
		s1.func();// we shouldn't write this statement which leads to infinite loop of creating objects	
	}
}



public class ObjectsInSameClass {

	public static void main(String[] args) {
		sameobject v2 = new sameobject();
		v2.func();
		

	}

}
