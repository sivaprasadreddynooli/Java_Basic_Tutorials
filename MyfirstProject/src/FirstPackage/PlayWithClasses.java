package FirstPackage;

//we can create multiple references to same object
//one object may have multiple references but one reference can point to only one object
//by assigning a new object to the previous reference or old reference, the previous object associated with the old
//reference would be lost


public class PlayWithClasses {

	public static void main(String[] args) {
		ff f4 = new ff();
		ff f5 = f4;
		if(f5 == f4)
		{
			System.out.println("both are the same obejcts");
		}
		else
		{
			System.out.println("both are different");
		}
		
		System.out.println(f5);
		System.out.println(f4);
		
		f5.i = 56;
		System.out.println(f4.i);
		
		ff f6 = new ff();
		System.out.println(f6);
		f6.i = 555;
		f6.j = 666;
		ff f7 = new ff();
		System.out.println(f7);
		f7 = f6;
		
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f6.i);
		System.out.println(f6.j);
		System.out.println(f7.i);
		System.out.println(f7.j);
		

	}

}
