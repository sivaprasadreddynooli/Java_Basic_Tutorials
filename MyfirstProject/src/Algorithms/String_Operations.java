package Algorithms;

public class String_Operations {

	public static void main(String[] args) {
		String s1 = "siva";
		String s2 = "sivareddy";
		String s0 = "";
		
		char letter ;
		letter = s1.charAt(2);
		int n = s2.length();
		System.out.println(s1.format("%s is %d years old",s1,25));
		String s3 = s2.substring(4);
		System.out.println(s3);
		String s4 = s2.substring(4,8);
		System.out.println(s4);
		String s[] = {"i ","am ","good"};
		System.out.println(s2.contains("ddy"));
		System.out.println(String.join("+",s));
		System.out.println(s1.equals(s2));
		System.out.println(s0.isEmpty());
		System.out.println(s1.concat(" nooli"));
		System.out.println(s1.replace("si", "sai"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(Math.round(234.67));
		System.out.println(Math.floor(234.67));
		System.out.println(Math.ceil(234.67));
		
		
		int a = 1;
		char b = (char) a;
		System.out.println(b);//will print out the char with ascii value 1 (start-of-heading char, which isn't printable).
		
		int c ='1';
		char d = (char)c;
		System.out.println(d); // will print out the char with ascii value 49 (one corresponding to '1')
		
		
		int p = 3456;
		String s9 = Integer.toString(p);
		System.out.println(s9);
		
		String number = "45657";
		System.out.println(Integer.parseInt(number)+2);

		System.out.println(Integer.valueOf("6789"));
		
		String finalvalue = "the value is " + String.valueOf(456);
		System.out.println(finalvalue);
		
		float f = Float.parseFloat("25");
		String s10 = Float.toString(25.0f);
		System.out.println(s10);
		
		
	}

}
