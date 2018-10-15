package FirstPackage;

//different ways of assigning the values
class kkk
{
	int i;
	String name;
	kkk(int a,String name)
	{
		i = a;
		this.name = name;
	}
	kkk(kkk ob)
	{
		i = ob.i;
		name = ob.name;
	}
	kkk()
	{	
	}
	void display()
	{
		System.out.println("the values are " + i + " " + name);
	}
}


public class CopyValues {

	public static void main(String[] args) {
		kkk k1 = new kkk(1,"siva");
		kkk k2 = new kkk();
		kkk k3 = new kkk(k1);
		
		k2.i = k1.i;
		k2.name = k1.name;
		
		k1.display();
		k2.display();
		k3.display();
	}
}
