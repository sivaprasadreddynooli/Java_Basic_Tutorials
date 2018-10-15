package FirstPackage;

public class StaticVariables {

	int x,y;
	static int count;
	
	
	public static void main(String[] args) {
		StaticVariables s1 = new StaticVariables();
		System.out.println(s1.x);
		System.out.println(s1.y);
		s1.count = 6;
		StaticVariables s2 = new StaticVariables();
		System.out.println(s2.count);
		count = count +7;
		System.out.println(count);
		System.out.println(s1.count);
		System.out.println(s2.count);

	}

}
