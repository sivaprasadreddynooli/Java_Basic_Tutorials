package Oops_basics;


//Default constructor is used to provide the default values to the object like 0, null etc. depending on the type

class student
{
String name;
int id;	
}


public class DefaultConstructor {
	public static void main(String[] args) {
		student s1 = new student();
		System.out.println(s1.id);
		System.out.println(s1.name);

	}

}
