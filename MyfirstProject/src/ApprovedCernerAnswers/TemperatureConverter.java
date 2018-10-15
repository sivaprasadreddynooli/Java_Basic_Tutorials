package ApprovedCernerAnswers;

public class TemperatureConverter implements Temperature {

	private float defaultBodyTempMouth;
	private float defaultBodyTempArmpit;
	private float activeMouthTemperature;
	private float activeArmpitTemperature;
	private IsActive activeOrNot;
	private TemperatureLocation measurementLocation;

	
	public void setMeasurementLocation(TemperatureLocation measurementLocation) {
		this.measurementLocation = measurementLocation;
	}

	public TemperatureLocation getMeasurementLocation() {
		return measurementLocation;
	}
	public void setActiveOrNot(IsActive activeOrNot) {
		this.activeOrNot = activeOrNot;
	}

	public IsActive getActiveOrNot() {
		return activeOrNot;
	}


	public void setActiveArmpitTemperature(float activeArmpitTemperature) {
		this.activeArmpitTemperature = activeArmpitTemperature;
	}
	

	public float getActiveArmpitTemperature() {

		return activeArmpitTemperature;
	}

	public float getActiveMouthTemperature() {

		return activeMouthTemperature;
	}
	public void setActiveMouthTemperature(float activeMouthTemperature) {
		this.activeMouthTemperature = activeMouthTemperature;
	}

	public float getDefaultBodyTempMouth() {

		return defaultBodyTempMouth;
	}

	public void setDeafultBodyTempMouth(float defaultBodyTempMouth) {
		this.defaultBodyTempMouth = defaultBodyTempMouth;
	}

	public float getDefaultBodyTempArmpit() {

		return defaultBodyTempArmpit;
	}

	public void setDeafultBodyTempArmpit(float defaultBodyTempArmpit) {
		this.defaultBodyTempArmpit = defaultBodyTempArmpit;
	}

	public float getTempinCelcius(float tempInFahrenHeit) {

		return (((float) 5) / 9 * (tempInFahrenHeit - 32));
	}

	public float getTempinFahrenHeit(float tempInCelcius) {

		return (((float) 9 / 5 * tempInCelcius) + 32);
	}

	public float getTempinKelvin(float tempInCelcius) {

		return (float) (tempInCelcius + 273.15);
	}
	
	public void isFever(float currTempInF)
	{
		
		if( getActiveOrNot() == IsActive.YES)
		{
			if( getMeasurementLocation() == TemperatureLocation.ARMPIT)
			{
				if(currTempInF >  getActiveArmpitTemperature())
				{
					System.out.println("Patient has fever");
				}
				else{
					System.out.println("Patient doesn't has fever");
				}
			}
			else if( getMeasurementLocation() == TemperatureLocation.MOUTH)
			{
				if(currTempInF >  getActiveMouthTemperature())
				{
					System.out.println("Patient has fever");
				}
				else{
					System.out.println("Patient doesn't has fever");
				}
			}
			
		}
		else if ( getActiveOrNot() == IsActive.NO){
			if( getMeasurementLocation() == TemperatureLocation.ARMPIT)
			{
				if(currTempInF >  getDefaultBodyTempArmpit())
				{
					System.out.println("Patient has fever");
				}
				else{
					System.out.println("Patient doesn't has fever");
				}
			}
			else if( getMeasurementLocation() == TemperatureLocation.MOUTH)
			{
				if(currTempInF >  getDefaultBodyTempMouth())
				{
					System.out.println("Patient has fever");
				}
				else{
					System.out.println("Patient doesn't has fever");
				}
			}
			
		}
		
	}

}
