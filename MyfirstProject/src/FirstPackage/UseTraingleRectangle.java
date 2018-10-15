package FirstPackage;

public class UseTraingleRectangle {

	public static void main(String[] args)
	{
		Rectangle res = new Rectangle();
		res.setValues(2,3);
		
		Triangle tri  = new Triangle();
		tri.setValues(4, 6);
		
		
		System.out.println(res.area());
		System.out.println(tri.area());
	}
	
}
