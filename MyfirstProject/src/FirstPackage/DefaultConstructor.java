package FirstPackage;




//the role of the constructor is to assign the default values like 0, null
class ggg
{
	int j;
}

class hhh
{	
	int i ;
hhh()
{
	System.out.print("object hhh is created");
}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		ggg g1 = new ggg();
		hhh h1 = new hhh();
		System.out.println(h1.i);
		System.out.println(g1.j);

	}

}
