package FirstPackage;

public class CallingMethod {

	int a;
	int b;

	
	//Parameters appeared in method definitions, while arguments appear in
	//method calls, however, the two terms are sometimes used interchangeably
	public void get_values(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int return_add_value()
	{
		return a+b;
	}
	
	
	
	public static void main(String[] args)
	{
		
		CallingMethod c1 = new CallingMethod();
		
		
		
		//Parameters appeared in method definitions, while arguments appear in
		//method calls, however, the two terms are sometimes used interchangeably
		c1.get_values(2, 3);
		System.out.println(c1.return_add_value());
		
	}
}
