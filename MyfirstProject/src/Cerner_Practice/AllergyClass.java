package Cerner_Practice;

import java.util.*;
enum Severity{High,Medium,Low};
enum Reported{Patient,Kin};
enum Symptoms{High_Fever,High_Couugh,High_Boold_Pressure};
enum AllergyName{Asthama,Others};

class Allergy{
	
	AllergyName patientAllergy;
	Severity PatientAllergySeverity;
	Reported IssueReportedBy;
	List<Symptoms> patientSymptoms;
}




public class AllergyClass {
	
	private List<Allergy> patientAllergies;

	public List<Allergy>  getAllergies()
	{
		return patientAllergies;
	}
	
	public void setAllergy(Severity PatientAllergySeverity,Reported IssueReportedBy,List<Symptoms> patientSymptoms,AllergyName patientAllergy )
	{
		Allergy allergy = new Allergy();
		allergy.PatientAllergySeverity = PatientAllergySeverity;
		allergy.IssueReportedBy = IssueReportedBy;
		allergy.patientSymptoms = patientSymptoms;
		allergy.patientAllergy = patientAllergy;
		patientAllergies.add(allergy);
	}
	
	public void displayAllergies()
	{
		for(Allergy temp:patientAllergies)
		{
			
			System.out.print("Allegy name: " + temp.patientAllergy + ", Allergy Severity: " + temp.PatientAllergySeverity + ", Allergy Reporte by: " + temp.IssueReportedBy);		
			System.out.println("Symptoms");
			for(Symptoms tempsymptoms:temp.patientSymptoms)
			{
				System.out.println(tempsymptoms);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
