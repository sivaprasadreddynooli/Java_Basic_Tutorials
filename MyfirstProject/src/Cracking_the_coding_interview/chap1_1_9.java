package Cracking_the_coding_interview;

public class chap1_1_9 {

	public static void main(String[] args) {
	String s1 = "waterbottle";
	String s2 = "erbottlewat";
	
	String s3 = s1 + s1;
	
	System.out.println(s1.length() == s2.length() ? s3.contains(s2): false);

	}

}
