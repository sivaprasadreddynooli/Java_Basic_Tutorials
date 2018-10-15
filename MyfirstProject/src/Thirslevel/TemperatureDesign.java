package Thirslevel;

enum Infection{Fever,Healthy,LowTemperature};


interface TemperatureInterface
{
	
}


class temperatureClass
{
	float HealthTemperature;
	float PresentTemperature;
	Infection PatientInfection;
	
	public void setHealthyTemperatureCelcius(float temp)
	{
		this.HealthTemperature = temp;
	}
	public void setHealthyTemperatureFarenHeit(float temp)
	{
		float celsius = (float)(temp - 32) * 5 /9;
		this.setHealthyTemperatureCelcius(celsius);
	}
	public void setHealthyTemperatureKelvin(float temp)
	{
		float celsius = temp - (float)272.15;
		this.setHealthyTemperatureCelcius(celsius);
	}
	
	
	public float getHealthyTemperatureCelcius()
	{
		return this.HealthTemperature;
	}
	
	public float getHealthyTemperatureFarenheit()
	{
		return (this.HealthTemperature * 9 )/5 + 32;
	}
	
	public float getHealthyTemperatureKelvin()
	{
		return this.HealthTemperature + (float)273.15;
	}

	

	public void setPresentTemperatureCelcius(float temp)
	{
		this.PresentTemperature = temp;
		this.PatientInfection = determineByTemp(temp);
	}
	public void setPresentTemperatureFarenHeit(float temp)
	{
		float celsius = (float)(temp - 32) * 5 /9;
		this.setPresentTemperatureCelcius(celsius);
		this.PatientInfection = determineByTemp(temp);
	}
	public void setPresentTemperatureKelvin(float temp)
	{
		float celsius = temp - (float)272.15;
		this.setPresentTemperatureCelcius(celsius);
		this.PatientInfection = determineByTemp(temp);
	}
	
	private Infection  determineByTemp(float temp)
	{		
		//should we have to consider +1,-1 variance here.
		if(temp > this.HealthTemperature)
		{
			return Infection.Fever;
		}
		else if(temp < this.HealthTemperature)
		{
			return Infection.LowTemperature;
		}
		return Infection.Healthy;
	}
	
	
	
	
	public float getPresentTemperatureCelcius()
	{
		return this.PresentTemperature;
	}
	
	public float getPresentTemperatureFahrenheit()
	{
		return (this.PresentTemperature * 9 )/5 + 32;
	}
	
	public float getPresentTemperatureKelvin()
	{
		return this.PresentTemperature + (float)273.15;
	}
	
	
}

//the fact that the temperature changes with everyone, means we haev to create a seperate record for every patient.

//If temperature changes with activity in day life, we have to record temperatures based on time

//Temperatures are recorded in Celsius
class PatientTemperatureRecord
{
	private String Name;
	private String PatientId;
	public temperatureClass Armpit ;
	public temperatureClass Mouth ;
	private Infection PatientInfection;
	
	PatientTemperatureRecord()
	{
		this.PatientInfection = Infection.Healthy;
		Armpit = new temperatureClass();
		Mouth = new temperatureClass();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getPatientId() {
		return PatientId;
	}

	public void setPatientId(String patientId) {
		this.PatientId = patientId;
	}

	public temperatureClass getArmpit() {
		return Armpit;
	}

	public void setArmpit(temperatureClass armpit) {
		this.Armpit = armpit;
	}

	public temperatureClass getMouth() {
		return Mouth;
	}

	public void setMouth(temperatureClass mouth) {
		this.Mouth = mouth;
	}

	public Infection getPatientInfection() {
		return PatientInfection;
	}

	public void setPatientInfection(Infection patientInfection) {
		this.PatientInfection = patientInfection;
	}
	
	
	
	
}



public class TemperatureDesign {

	
	public static void main(String args[])
	{
		 PatientTemperatureRecord p1 = new  PatientTemperatureRecord();
		 p1.setName("siva");
		 p1.setPatientId("Patient1");
		 
		 p1.Armpit.setHealthyTemperatureCelcius((float)98.4);
		 p1.Armpit.setPresentTemperatureCelcius((float)97.4);
		 System.out.println(p1.Armpit.PatientInfection);
		 p1.setPatientInfection(p1.Armpit.PatientInfection);
		
		
	}
	 
	
}
