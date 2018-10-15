package FirstPackage;

public class Methods {

	public static void main(String[] args)
	{
		helloFriend("siva");
		int sum = add(30,40,50);
		System.out.println("the added sum is " + sum);
		
		
	}
	
	
	public static void helloFriend(String name)
	{
		System.out.println("Hello "+name);
	}
	
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
