package ApprovedCernerAnswers;

public interface Temperature {
	public float getTempinCelcius(float tempInFahrenHeit);
	public float getTempinFahrenHeit(float tempInCelcius);
	public float getTempinKelvin(float tempInCelcius);
	public float getDefaultBodyTempMouth();
	public float getDefaultBodyTempArmpit();

}
