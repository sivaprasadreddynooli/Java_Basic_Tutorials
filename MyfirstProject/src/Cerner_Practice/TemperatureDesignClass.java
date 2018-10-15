package Cerner_Practice;

enum healthStatus{UnHealthy,Healthy,NA};
enum measurement{Fahrenheit,Celsius,Kelvin };
enum tempSource{Ear,Mouth,Armpit};

public class TemperatureDesignClass {

	
	private double temperature;
	private measurement patienttempmeasurement;
	private healthStatus patientStatus; 
	private tempSource temperatureBodypart;
	
	TemperatureDesignClass()
	{
		this.patientStatus = healthStatus.NA;
	}
	
	public healthStatus determinestatus()
	{
		if(patienttempmeasurement == measurement.Celsius)
		{
			
			if(this.temperature > 99.4 || this.temperature < 97.4)
			{
				return healthStatus.UnHealthy;
			}
			else
			{
				return healthStatus.Healthy;
			}
		}
		
		else if(patienttempmeasurement == measurement.Fahrenheit)
		{
			
			if(this.temperature > 99.4 || this.temperature < 97.4)
			{
				return healthStatus.UnHealthy;
			}
			else
			{
				return healthStatus.Healthy;
			}
		}
		
		
		else 
		{
			
			if(this.temperature > 99.4 || this.temperature < 97.4)
			{
				return healthStatus.UnHealthy;
			}
			else
			{
				return healthStatus.Healthy;
			}
		}
	}
	
	
   public void setTemperatue(double temperature,tempSource value,measurement measureSource)
	{
		this.temperature = temperature;
		this.temperatureBodypart = value;
		this.patienttempmeasurement = measureSource;
		this.patientStatus  = this.determinestatus();
	}
	
   public	double getTemperature()
	{
		return temperature;
	}
		
	public healthStatus getHealthStatus()
	{
		return patientStatus;	
	}
 
	
	public tempSource getTempSource()
	{
		return temperatureBodypart;
	}
	
	
	public static void main(String[] args) {
		

	}

}
