package FirstPackage;

class ee
{
	int i;
	int j;
}

public class PlayWithObjects {

	void fun1(ee e1 )
	{
		System.out.println(e1);
		if(e1 != null)
		{
			e1.i = e1.i + 4;
			e1.j = e1.j + 6;
		}
		System.out.println("fun1()");
	}
	
	public static void main(String[] args) {
		
		 PlayWithObjects p1 = new  PlayWithObjects();
		 ee e1 = new ee();
		 p1.fun1(e1);
		 e1.i = 5;
		 e1.j = 10;
		 p1.fun1(e1);
		 System.out.println(e1.i);
		 System.out.println(e1.j);
		 p1.fun1(new ee());
		 System.out.println(e1.i);
		 System.out.println(e1.j);
		 p1.fun1(null);
		 System.out.println(e1.i);
		 System.out.println(e1.j);
	}

}
