package FirstPackage;

public class JavaString {

	public static void main(String[] args)
	{
		String name="Siva Prasad Reddy";
		
		int n = name.length();
		System.out.println(n);
		String upper_case = name.toUpperCase();
		String lower_case  = name.toLowerCase();
		
		System.out.println(upper_case);
		System.out.println(lower_case);
		
		String city  = "Hyderabad" + "pune";
		System.out.println(city);
		
		
		
		
		
		city = city.replace("bad", "palle");
		System.out.println(city);
		
		System.out.println(city.indexOf('e'));
		
		
	}
	
}
