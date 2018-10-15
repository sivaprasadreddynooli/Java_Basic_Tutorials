package Thirslevel;
import java.util.ArrayList;
import java.util.List;

enum Symptoms{Flue,Cough,Fever};
enum AllergyNames{Astama,DustAllergy};
enum Severity{High,Medium,Low};
enum AllergyReportedBy{Kin,Self};

class Allergy
{
	List<Symptoms> AllergySymptoms; 
	AllergyNames AllergyName;
	Severity AllergySeverity;
	AllergyReportedBy AllergyReported;
	Allergy()
	{
		AllergySymptoms = new ArrayList<Symptoms>();
	}
}

class PatientAllergyRecord
{
	private String Name;
	private String PatientId;
	private List<Allergy> PatientAllergies;
	
	public PatientAllergyRecord()
	{
		PatientAllergies = new ArrayList<Allergy>();
	}
	
	public void setName(String name)
	{
		this.Name = name;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setPatientId(String Id)
	{
		this.PatientId = Id;
	}
	public String getPatientId()
	{
		return this.PatientId;
	}
	/*
	public void CreatePatientAllergy(
									List<Symptoms> AllergySymptoms,
									AllergyNames AllergyName,
									Severity AllergySeverity,
									AllergyReportedBy AllergyReported)
	{
		Allergy a1 = new Allergy();
		a1.AllergyName =  AllergyName;
		a1.AllergyReported = AllergyReported;
		a1.AllergySeverity = AllergySeverity;
		a1.AllergySymptoms = AllergySymptoms;
		AddAllergy(a1);
	}
	*/
	public void addAllergy(Allergy a)
	{
		this.PatientAllergies.add(a);
	}
	public void DisplayAllergies()
	{
		System.out.println("Below are the allergies that Patient with name: " + this.Name + " and with id  " + this.PatientId + " has");
		if(this.PatientAllergies.size() == 0)
		{
			System.out.println("He has no allergies");
		}
		else
		{
			for(Allergy temp:this.PatientAllergies)
			{
				System.out.println("Allergy: " + temp.AllergyName + " With severity: " + temp.AllergySeverity + " and Reported by: " + temp.AllergyReported);
			}
		}
		
	}

}


public class Allergyclass {

	public static void main(String[] args) {
		PatientAllergyRecord p1 = new PatientAllergyRecord();
		p1.setName("siva");
		p1.setPatientId("PATIENT1");
		
		Allergy a = new Allergy();
		a.AllergyName = AllergyNames.Astama;
		a.AllergySeverity =  Severity.High;
		a.AllergyReported = AllergyReportedBy.Kin;
		a.AllergySymptoms.add(Symptoms.Cough);
		a.AllergySymptoms.add(Symptoms.Fever);
		
		p1.addAllergy(a);
		
		p1.DisplayAllergies();

	}

}
