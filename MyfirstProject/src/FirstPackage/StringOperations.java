package FirstPackage;

public class StringOperations {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("abc");
		s1 = s1.append("siva");
		System.out.println(s1);
		String s2 = new String("reddy");
		
		String s3 = "reddy";
		String s4 = new String("reddy");
		
		boolean flag = s3.contentEquals(s4);
		System.out.println(flag);
		
		boolean flag2  = s2.contentEquals(s3);
		System.out.println(flag2);
	}
}
