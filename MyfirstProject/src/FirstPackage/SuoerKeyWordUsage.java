package FirstPackage;

class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class SuperKeyWordUsage extends Person
{  
	float salary;  
	SuperKeyWordUsage(int id,String name,float salary)
{  
		super(id,name);//reusing parent constructor  
		this.salary=salary;  
}  
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}  

}  
class TestSuper5{  
public static void main(String[] args){  
	SuperKeyWordUsage e1=new SuperKeyWordUsage(1,"ankit",45000f);  
e1.display();  
}} 