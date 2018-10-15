package Thirslevel;

//enum Infection{Fever,Cough,Healthy,LowTemperature};



//class temperatureDesign
//{
	//float HealthTemperatureArmpit;
	//float PresentTemperatureMouth;
//}

//the fact that the temperature changes with everyone, means we haev to create a seperate record for every patient.

//If temperature changes with activity in day life, we have to record temperatures based on time

//Temperatures are recorded in Celsius
/*
class PatientTemperatureRecord
{
	private float HealthTemperatureArmpit;
	private float HealthTemperatureMouth;
	private float PresentTemperatureArmpit;
	private float PresentTemperatureMouth;
	private Infection PatientInfection;
	
	PatientTemperatureRecord()
	{
		this.PatientInfection = Infection.Healthy;
	}

	public void setHealthyTemperatureArmpit(float temp)
	{
		this.HealthTemperatureArmpit = temp;
	}
	public void setHealthyTemperatureArmpitCelcius(float temp)
	{
		this.HealthTemperatureArmpit = temp;
	}
	public void setHealthyTemperatureArmpitFarenHeit(float temp)
	{
		float celsius = (float)(temp - 32) * 5 /9;
		this.setHealthyTemperatureArmpitCelcius(celsius);
		//this.HealthTemperatureArmpit = temp;
	}
	public void setHealthyTemperatureArmpitKelvin(float temp)
	{
		float celsius = temp - (float)272.15;
		this.setHealthyTemperatureArmpitCelcius(celsius);
		//this.HealthTemperatureArmpit = temp;
	}
	
	
	
	public float getHealthyTemperatureArmpit(float temp)
	{
		return this.HealthTemperatureArmpit;
	}
	
	public void setHealthyTemperatureMouth(float temp)
	{
		this.HealthTemperatureMouth = temp;
	}
	
	public float getHealthyTemperatureMouth(float temp)
	{
		return this.HealthTemperatureMouth;
	}
	
	
	
	
	public void setPresentTemperatureArmpit(float temp)
	{
		this.PresentTemperatureArmpit = temp;
	}
	public void setPresentTemperatureArmpitCelcius(float temp)
	{
		this.PresentTemperatureArmpit = temp;
	}
	public void setPresentTemperatureArmpitFarenHeit(float temp)
	{
		float celsius = (float)(temp - 32) * 5 /9;
		this.setPresentTemperatureArmpitCelcius(celsius);
		this.PatientInfection = determineByArmpitTemp(temp);
	}
	public void setPresentTemperatureArmpitKelvin(float temp)
	{
		float celsius = temp - (float)272.15;
		this.setPresentTemperatureArmpitCelcius(celsius);
		this.PatientInfection = determineByArmpitTemp(temp);
	}
	
	private Infection  determineByArmpitTemp(float temp)
	{
		
		//should we have to consider +1,-1 variance here.
		if(temp > this.HealthTemperatureArmpit)
		{
			return Infection.Fever;
		}
		else if(temp < this.HealthTemperatureArmpit)
		{
			return Infection.LowTemperature;
		}
		return Infection.Healthy;
	}
	

	
	public float getPresentTemperatureArmpit(float temp)
	{
		return this.PresentTemperatureArmpit;
	}
	
	public void setPresentTemperatureMouth(float temp)
	{
		this.PresentTemperatureMouth = temp;
	}
	
	public float getPresentTemperatureMouth(float temp)
	{
		return this.PresentTemperatureMouth;
	}
	
	
}

*/

public class temppractice {

}
