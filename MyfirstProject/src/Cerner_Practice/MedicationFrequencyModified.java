package Cerner_Practice;

public class MedicationFrequencyModified {

}



/*


package Cerner_Practice;


import java.text.SimpleDateFormat;
import java.util.*;
enum frequency{DailyOnce,PRN,BeforeBed,Every4Hours,Forever};
enum medicationType{Metacin,Crocin,Paracetemal};

class Date
{
	int day;
	int month;
	int year;
}


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
		
		
		
		
		
		Date start = new Date();
		start.day = medStartDay;
		start.month = medStartMonth;
		start.year = medStartYear;
		
		Date end = new Date();
		end.day = medEndDay;
		end.month = medEndMonth;
		end.year = medEndYear;
		
		
		m1.patientMedication = patientMedication;
		m1.MedicationFrequency = MedicationFrequency;
		
		PatientMedicationChart.add(m1);
	}
	
	public List<Medication> getPatientRecords()
	{
		return PatientMedicationChart;
	}
}




public class MedicationFrequencyClass {

	public static void main(String[] args) {
		
		

	}

}

*/