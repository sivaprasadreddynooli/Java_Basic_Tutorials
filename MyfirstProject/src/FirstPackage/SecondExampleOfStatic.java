package FirstPackage;





public class SecondExampleOfStatic {
	
	int x,y;
	static int count;
	static void func1()
	{
		count = count+1;
		SecondExampleOfStatic s1 = new SecondExampleOfStatic();
		s1.x = count + 1;
	}
	
	void funz()
	{
		x  = x +1;
		count = count+1;
		func1();
	}
	

	public static void main(String[] args) {
		SecondExampleOfStatic s2 = new SecondExampleOfStatic();
		s2.funz();
		System.out.println(s2);
		System.out.println(s2.x);
		System.out.println(s2.y);
		System.out.println(count);
		System.out.println(s2.count);
		System.out.println(SecondExampleOfStatic.count);

	}

}
