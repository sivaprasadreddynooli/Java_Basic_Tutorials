package FirstPackage;

class dd
{
int t = 90;	
}

class cc
{
dd d1 = new dd();
int a = 9;
int b = 6;
void funcc()
{
System.out.println("this is the function in cc");	
}
}


public class ClassAccessedFromAnotherClass {

	public static void main(String[] args) {
		cc c1 = new cc();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.d1);
		System.out.println(c1.d1.t);

	}

}
