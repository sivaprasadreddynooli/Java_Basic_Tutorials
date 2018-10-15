package Cracking_the_coding_interview;

public class chap1_1_6 {

	
	public static String validate(String name)
	{
		
		int n = name.length();
		int i = 0;
		
		char[] c = name.toCharArray();
		
		StringBuilder s = new StringBuilder();
		
		while(i<n)
		{
			int j = i;
			while(i<n && c[j] == c[i])
			{
				i = i+1;
			}
		
			s.append(c[j]);
			s.append(String.valueOf(i-j));
		}
		String finalvalue = s.toString();
		
		if(finalvalue.length() < name.length())
		{
			return finalvalue;
		}
		else
		{
			return name;
		}
	}
	
	public static void main(String[] args) {
		String name = "siiivvvaaadddd";
		
		System.out.println(validate(name));

	}

}
