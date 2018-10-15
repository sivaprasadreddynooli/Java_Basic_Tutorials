package FirstPackage;

public class Cube {

	int length;
	int breadth;
	int height;
	
	
	//constructor Cube never returns anything and it will have the same name 
	//as class name
	//By default even if we won't create one there will be a default
	//constructor 
	
	Cube()
	{
		System.out.println("the object is created");
		length = 10;
		breadth = 20;
		height = 30;
	}
	
	
	//we can create multiple constructors for a class
	//also known as method over loading
	//then the above constructor will act as default constructor
	
	Cube(int l,int b,int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	
	public int getCubeVolume()
	{
		return (length*breadth*height);
	}
	
	
	
	
}
