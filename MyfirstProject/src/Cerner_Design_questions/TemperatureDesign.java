package Cerner_Design_questions;

enum healthState {Healthy,Unhealthy,NotKnown};
enum  issue {Fever,cough,cold};
enum temperatureSource {ear,mouth,armpit};
enum tempUnit{kelvin,celsius,farenheit};
public class TemperatureDesign {

	
	String patientId;
	private healthState patientState;
	private issue patientissue;
	double temperature;
	private tempUnit temperatureUnit;
	private temperatureSource tempBodyPart;

	void settemperature(double temperature,tempUnit unit, temperatureSource source,issue healthissue)
	{
		this.temperature = temperature;
		this.temperatureUnit = unit;
		this.tempBodyPart = source;
		this.patientissue = healthissue;
		this.patientState = getpatientState(this.temperature,unit);
	}
	
	healthState getpatientState(double temperature,tempUnit unit )
	{
		if(unit == tempUnit.kelvin)
		{
			if(temperature < 100)
			{
				return healthState.Healthy;
			}
			else
			{
				return healthState.Unhealthy;
			}
		}
		return healthState.NotKnown;
	}


}
