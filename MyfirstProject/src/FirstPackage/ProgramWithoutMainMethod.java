package FirstPackage;

//we execute a program without main() method, one of the way is static block but in previous version of JDK not in JDK 1.7
public class ProgramWithoutMainMethod {
	static{System.out.println("this is static block");
	System.exit(0);
	}
}
