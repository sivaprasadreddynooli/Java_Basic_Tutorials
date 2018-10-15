package Thirslevel;

import java.util.Date;
//Will this Proto type enable us to search, that is if we declare seperate class for address
enum Gender{M,F,NA};



//Should we have to declare enum for the state 
class Address
{
	String StreetName;
	int Apt;
	String City;
	String State;
	int Zip;
}


//should we have to create a hashrecord with patientid as key and record as value
class PatientRecord
{
	private String Name;
	private String PatientId;
//since Date will store the value as epoch time that is milliseconds, we don't need to worry about the timezone.
	private Date DOB;
	private Gender PatientGender;
	
	
	
	//float is suggested-------------------------
	private int PatientAge;
	private Address PatientAddress;
	
	PatientRecord()
	{
		this.PatientGender = Gender.NA;
	}
	public void setName(String name)
	{
		this.Name = name;
	}
	public String getName(String name)
	{
		return this.Name;
	}
	public void setPatientId(String patientId)
	{
		this.PatientId = patientId;
	}
	public String getPatientId(String patientId)
	{
		return this.PatientId;
	}
	public void setDOB(Date d)
	{
		this.DOB = d;
	}
	public Date getDOB()
	{
		return this.DOB;
	}
	public void setGender(Gender gender)
	{
		this.PatientGender = gender;
	}
	public Gender getGender()
	{
		return this.PatientGender;
	}
	public void setAge(int age)
	{
		this.PatientAge = age;
	}
	public int getAge()
	{
		return this.PatientAge;
	}
	public void AddAddress(Address a)
	{
		this.PatientAddress = a;
	}
	public Address getAddress()
	{
		return this.PatientAddress;
	}
}


public class DemoGraphics {

	public static void main(String[] args) {
		
		PatientRecord p1 = new PatientRecord();
		p1.setName("siva");
		p1.setPatientId("PATIENT1");
		p1.setGender(Gender.M);
		p1.setAge(25);
		
		
		/*
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date dateRepresentation = cal.getTime();
		*/
		
//For child we will add hours and minutes with the same logic.
		
		Date d = new Date(1993,6,8,0,0);
		p1.setDOB(d);
		
		Address a = new Address();
		a.StreetName = "1600 Park Circle";
		a.Apt = 1211;
		a.City = "Columbia";
		a.State = "SC";
		a.Zip = 29201;
		
		p1.AddAddress(a);
		
	
		
	}

}
