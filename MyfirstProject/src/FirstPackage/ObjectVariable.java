package FirstPackage;
class pp
{
}
class ii
{
}
class yy
{
}
public class ObjectVariable {
	void funca(pp p1)
	{
		System.out.println("funca");
	}	
	void funo(Object o )
	{
		System.out.println("funo");
	}
	public static void main(String[] args) {
		ObjectVariable  o1 = new ObjectVariable();
		o1.funca(new pp());
		o1.funo(new ii());
		o1.funo(new yy());
	}
}
