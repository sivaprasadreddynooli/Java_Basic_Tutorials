package FirstPackage;

public class CubeUsage {

	public static void main(String[] args)
	{
		
		Cube c1 = new Cube();
		
		System.out.println("the volume of the cube is " +c1.getCubeVolume() );
		//in above object creation
		//the last word Cube() is a constructor and
		//constructor never returns anything and it will have the same name 
		//as class name
		
		//constructor of the class is the first method executed when we create
		//the object
		
		Cube c2 = new Cube(20,20,20);
		System.out.println("the volume of the cube is " + c2.getCubeVolume());
	}
	
}
