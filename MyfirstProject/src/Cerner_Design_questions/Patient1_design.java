package Cerner_Design_questions;

enum state{SC,NC,KS,IL,MI};
enum country{USA,INDIA,IRAN};
enum patientType{child,adults,youlders,citizens};
public class Patient1_design {

	String patientId;
	String name;
	state patientState;
	country patientCountry;
	String streename;
	int apt;
	int zipcode;
	String timefirstreported;
	String timelastreported;
	Object healthrecord ;
	String DOB;
	patientType patype;
	String timezone;
	
	
	void setPatientRecords(String name,String patientId, state patientState, country patientCountry )
	{
		this.name = name;
		this.patientCountry = patientCountry;
		this.patientState = patientState;
		this.patientId = patientId;
	}
	
	
	void getdob()
	{
		String presenttime = getpresent();
	}
	
	String getpresent()
	{
		return "convertedvalue";
	}
	
	
}
