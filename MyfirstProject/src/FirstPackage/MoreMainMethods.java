package FirstPackage;
//You can have any number of main methods in a class by method overloading. 
//But JVM calls main() method which receives string array as arguments only. 
public class MoreMainMethods {
	public static void main(String[] args) {
	System.out.println("this is the main method with array of strings");
	}
	public static void main(String args) {
		System.out.println("this is the main method with only one string");
		}
	public static void main() {
		System.out.println("this is the main method with no parameters");
		}
}
