package Cerner_Practice;

import java.util.Date;
import java.text.SimpleDateFormat;

enum timeformat{EST,CST,PST};
enum gender{Male,Female,UnKnown}
enum maritalStatus{Single,Married,Divorced};
enum Category{Adult,Baby,Citizen};

class DOB
{
int day;
int month;
int year;
timeformat dateformat;	
int hour;
int min;

DOB()
{
	hour = 0;
	min = 0;
}
}


class demographics
{

	
private Date DateOfBirth;	
private gender PatientGender;
private int age;
private maritalStatus patientMaritalStatus;
private Category patientCategory; 


	public void setAdultDOB(int day,int month,int year, Category patientCategory,timeformat dateformat)
	{	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/year");
		String date_ds = Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year);
		Date date = null;
		try
		{
			date = sdf.parse(date_ds);	
		}
		catch (Exception e)
		{
			
		}
		this.DateOfBirth = date;
		this.patientCategory = patientCategory;
	}
	
	
	public void setBabyDOB(int day,int month,int year,int hour,int min,Category patientCategory,timeformat dateformat)
	{	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/year HH-MM");
		String date_ds = Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year) + " " + Integer.toString(hour) + "-" + Integer.toString(min) ;
		Date date = null;
		try
		{
			date = sdf.parse(date_ds);	
		}
		catch (Exception e)
		{
			
		}
		this.DateOfBirth = date;
		this.patientCategory = patientCategory;
	}
	
	public void setGender(gender value)
	{
		this.PatientGender = value;
	
	}
	public void setAge(int value)
	{
		this.age = value;
	}
	public void setMaritalStatus(maritalStatus patientMaritalStatus)
	{
		this.patientMaritalStatus = patientMaritalStatus;
	}
	
	
	public gender getGender(gender value)
	{
		return	this.PatientGender;
	
	}
	public int getAge(int value)
	{
		return this.age;
	}
	public maritalStatus getMaritalStatus(maritalStatus patientMaritalStatus)
	{
		return	this.patientMaritalStatus ;
	}
	
	public Date getAdultDob()
	{
		return DateOfBirth;
	}
	
	public Date getBabyDob()
	{
		return DateOfBirth;
	}
	
}


public class PersonDemographics 
{	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
