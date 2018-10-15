package Cerner_Design_questions;


enum severity{medium, high, low};
enum allergytype{asthama,dustallegy};
enum patientreported{self,kin};
public class Allergy_design {

	String patientId;
	severity healthSeverity;
	allergytype healthissue;
	patientreported reportingperson;
	
	void setPatientData(String patientIDvalue,severity severlevel,allergytype type,patientreported patient)
	{
		this.patientId = patientIDvalue;
		this.healthSeverity = severlevel;
		this.healthissue = type;
		this.reportingperson = patient;
	}
	


}
