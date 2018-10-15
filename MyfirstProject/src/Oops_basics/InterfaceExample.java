package Oops_basics;
interface laptop
{
	void model();
	void keyboardtype();
}
interface pc extends laptop
{
	void mousetype();	
}
class sony implements pc
{
	public void model()
	{
		System.out.println("this si first model");
	}
	public void keyboardtype()
	{
		System.out.println("this is qwerty keyborard");
	}
	public void mousetype()
	{
		System.out.println("this is geneal mouse");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		sony s1 = new sony();
		s1.model();
		s1.keyboardtype();
		s1.mousetype(); 	
	}
}
