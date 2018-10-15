package first;

public class firstclass {
	public int marks = 34;
	public void printname(String name)
	{
		System.out.println("my name is " + name);
	}
	
	
	public void printcity(String city)
	{
		System.out.println("my name is " + city);
	}
	
	
	public static void main(String args[])
	{		
		firstclass c1 = new firstclass();
		firstclass c2 = new firstclass();
		c1.printname("siva");
		c2.printname("sai");
		c1.printcity("chicago");
		c2.printcity("banglore");
		System.out.println("c2 marks are " + c2.marks);	
		System.out.println("hello");
	}
}

