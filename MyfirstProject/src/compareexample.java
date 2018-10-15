import java.util.*;


class Student
{
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}
 

public class compareexample {

	public static void main(String args[])
	{
	
		Student student1 = new Student(1,"siva","1000 Whaley street");
		Student student2 = new Student(2,"sai","1000 Whaley street");
		Student student3 = new Student(5,"hemanth","1000 Whaley street");
		
		List<Student> res = new ArrayList<Student>();
		res.add(student1);
		res.add(student2);
		res.add(student3);
		
		Collections.sort(res,new Comparator<Student>()
				{
			public int compare(Student o1, Student o2)
			{
				return o2.name.length()-o1.name.length();
			}
				}
				);
		
		
		for(Student value:res)
		{
			System.out.println(value.rollno + " " +value.name +  " "+value.address);
		}
		
		
		
	}
}
