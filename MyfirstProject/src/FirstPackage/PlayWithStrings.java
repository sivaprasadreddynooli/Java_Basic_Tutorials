package FirstPackage;
public class PlayWithStrings {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("hjg");
		String s4 = new String("hjg");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		if(s1 == s2)
			System.out.println("s1 and s2 are same");
		if(s3==s4)
			System.out.println("s3 and s4 are same");
	}
}
