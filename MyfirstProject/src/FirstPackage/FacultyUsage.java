package FirstPackage;

public class FacultyUsage {

	public static void main(String[] args)
	{
		Faculty f1 = new Faculty();
		
		f1.setId(21);
		f1.setName("Manohar");
		f1.setSubject("maths");
		
		System.out.println("Professor " + f1.getName() + " Teaches "+ f1.getSubject());
		
	}
	
	
}
