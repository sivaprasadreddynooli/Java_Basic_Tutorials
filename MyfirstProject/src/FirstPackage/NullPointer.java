package FirstPackage;

class aa
{
int x =9;
int y = 0;
void funca()
{
System.out.println("this is from class A");	
}
}


class bb
{
	aa a1;
	int z = 9;
	void funcb()
	{
		System.out.println("this is from class b");
	}

}



public class NullPointer {

	public static void main(String[] args) {
		bb b1 = new bb();
		System.out.println(b1.z);
		System.out.println(b1.a1);// this will show null pointer as, we have not created the instance
		System.out.println(b1.a1.x);// this will throw error,as null pinter can't point to anything

	}

}
