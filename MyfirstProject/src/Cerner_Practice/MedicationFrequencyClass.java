package Cerner_Practice;


import java.text.SimpleDateFormat;
import java.util.*;
enum frequency{DailyOnce,PRN,BeforeBed,Every4Hours,Forever,Monthly,weekly};
enum medicationType{Metacin,Crocin,Paracetemal};


class Medication
{
	medicationType patientMedication;
	Date StartDate;
	Date EndDate;
	frequency MedicationFrequency;
}


class patientData
{

	private List<Medication> PatientMedicationChart;
	
	public void setPatientMedicationRecords(int medStartDay,int medStartMonth,int medStartYear,int medEndDay,int medEndMonth,int medEndYear,medicationType patientMedication,frequency MedicationFrequency )
	{	
		Medication m1 = new Medication();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/year");
		String date_ds = Integer.toString(medStartDay) + "/" + Integer.toString(medStartMonth) + "/" + Integer.toString(medStartYear);
		Date dates = null;
		try
		{
			dates = sdf.parse(date_ds);	
		}
		catch (Exception e)
		{
			
		}
		m1.StartDate  = dates;
	
		
		SimpleDateFormat edf = new SimpleDateFormat("dd/mm/year");
		String date_eds = Integer.toString(medStartDay) + "/" + Integer.toString(medStartMonth) + "/" + Integer.toString(medStartYear);
		Date datee = null;
		try
		{
			datee = sdf.parse(date_ds);	
		}
		catch (Exception e)
		{
			
		}
		m1.EndDate  = dates;
		
		m1.patientMedication = patientMedication;
		m1.MedicationFrequency = MedicationFrequency;
		
		PatientMedicationChart.add(m1);
	}
	
	public List<Medication> getPatientRecords()
	{
		return PatientMedicationChart;
	}
	
	
	public void displayMedications()
	{
		
		for(Medication temp:PatientMedicationChart)
		{
			
			System.out.println("patient with medication " + temp.patientMedication + " should take medicines in the following dates");
			frequency tempfreq = temp.MedicationFrequency;
			
			while(temp.StartDate.compareTo(temp.EndDate) < 0 )
			{
			if(tempfreq == frequency.DailyOnce)
			{
				System.out.println(temp.StartDate);
				temp.StartDate = new Date(temp.StartDate.getTime() + (1000 * 60 * 60 * 24));
			}
			else if(tempfreq == frequency.Monthly)
			{
				System.out.println(temp.StartDate);
				temp.StartDate = new Date(temp.StartDate.getTime() + (1000 * 60 * 60 * 24 * 30));
			}
			else if(tempfreq == frequency.Every4Hours)
			{
				System.out.println(temp.StartDate);
				temp.StartDate = new Date(temp.StartDate.getTime() + (1000 * 60 * 60 * 4));
			}
			
			}
		}
		
		
	}
	
}

public class MedicationFrequencyClass {
	public static void main(String[] args) {
		
		patientData p1 = new patientData();
		
		//p1.setPatientMedicationRecords(2, 4, 2018, , medEndMonth, medEndYear, patientMedication, MedicationFrequency);
		
	}
}
