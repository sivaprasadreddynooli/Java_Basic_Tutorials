package FirstPackage;
/*

java static block
1. Is used to initialize the static data member.
2. It is executed before main method at the time of classloading.
*/

public class StaticBlockBeforeMainMethod {

	static{System.out.println("ths is static block");}
	public static void main(String[] args) {
		System.out.println("this is main method");

	}

}
