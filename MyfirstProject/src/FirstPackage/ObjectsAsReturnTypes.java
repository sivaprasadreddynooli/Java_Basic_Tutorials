package FirstPackage;

class ff
{
int i = 8;
int j = 11;
}

public class ObjectsAsReturnTypes {

	ff getff(int i)
	{
		ff f1 = new ff();
		f1.i = i;
		f1.j = i+1;
		return f1;
	}
	
	
	public static void main(String[] args) {
		ObjectsAsReturnTypes o1 = new ObjectsAsReturnTypes();
		ff f2 = o1.getff(5);
		System.out.println(f2.i);
		System.out.println(f2.j);
		o1.getff(9);
		System.out.println(f2);
		System.out.println(o1.getff(3));
		int i = o1.getff(13).i;
		System.out.println(i);
		ff f3 = o1.getff(45);
		

	}

}
