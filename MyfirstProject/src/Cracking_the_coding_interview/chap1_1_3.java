package Cracking_the_coding_interview;

public class chap1_1_3 {

	public static void main(String[] args) {
		
		String name = "siva reddy";
		
		char[] c = name.toCharArray();
		
		StringBuilder s = new StringBuilder();
		
		for(char c1:c)
		{
			
			if(c1 == ' ')
			{
				s.append("%20");
			}
			else
			{
				s.append(c1);
			}
			
		}
		
		
		name = s.toString();
	}
	

}
