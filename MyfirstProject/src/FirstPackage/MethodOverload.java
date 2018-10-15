package FirstPackage;

public class MethodOverload {
	
    public static void main(String[] args)
	{	
		System.out.println(add(3,6));
		System.out.println(add(3.6,5.6));
		System.out.println(add("siva"," reddy"));
	}
	
	//method overloading is creating different methods with same name
    //but with different type of parameters
    
	public static int add(int a,int b)
	{
		return (a+b);
	}
	
	public static double add(double a,double b)
	{
		return (a+b);
	}

	public static String add(String a,String b)
	{
		return a+b;
	}
	
}
