package Oops_basics;


/*
 
If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

Consider a situation, Employee object contains many informations such as id, name, emailId etc.
It contains one more object named address, which contains its own informations such as city, state, 
country, zipcode etc. as given below.
 
 
 
 */



class Address
{
	String city, state;
	Address(String city, String state)
	{
		this.city = city;
		this.state = state;
	}
}


class employee
{

	int salary;
	Address adr;
	
	employee(int salary,Address adr)
	{
		this.salary = salary;
		this.adr = adr;
	}
	
	void display()
	{
		System.out.println(salary+ " " + adr.city + " " + adr.state  );
	}
	
}

public class AggregationExample {

	public static void main(String[] args) {
		Address a1 = new Address("Columbia","SC");
		employee e1 = new employee(1000,a1);
		
		e1.display();

	}

}
