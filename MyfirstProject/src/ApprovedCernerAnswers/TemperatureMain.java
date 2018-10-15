package ApprovedCernerAnswers;

import java.util.Scanner;

public class TemperatureMain {
	public static float currBodyTemp;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TemperatureConverter tc = new TemperatureConverter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter person's normal temperature in F when measured at Mouth");
		tc.setDeafultBodyTempMouth(scan.nextFloat());
		System.out.println("Enter person's normal temperature in F when measured at Armpit");
		tc.setDeafultBodyTempArmpit(scan.nextFloat());
		System.out.println("Enter the location of measurement(A or M)");
		String AorM = scan.next();
		if(AorM.equals("A"))
		{
			tc.setMeasurementLocation(TemperatureLocation.ARMPIT);
			System.out.println("Enter person's Active Armpit temperature in F ");
			tc.setActiveArmpitTemperature(scan.nextFloat());
		}
		else if(AorM.equals("M") ){
			
			tc.setMeasurementLocation(TemperatureLocation.MOUTH);
			System.out.println("Enter person's Active Mouth temperature in F ");
			tc.setActiveMouthTemperature(scan.nextFloat());
		}
		
		else{
			System.out.println("You should measure either at Armpit or Mouth");
		}
		
		
		System.out.println("Enter if person is Active(Y or N):");
		String YorN = scan.next();
		if(YorN.equals("Y"))
		{
			tc.setActiveOrNot(IsActive.YES);
		}
		else if(YorN.equals("N") ){
			
			tc.setActiveOrNot(IsActive.NO);
		}
		else{
			System.out.println("You should enter either Y or N");
		}
		System.out.println("In which unit are you entering the temperature? Enter either 'C' or 'F' ");
		
		char measurement = scan.next().charAt(0); 
		
		switch(measurement)
		{
		case 'C':
			System.out.println("Enter the current body temperature in C: ");
			currBodyTemp = scan.nextFloat();
			float tempInF = tc.getTempinFahrenHeit(currBodyTemp);
			tc.isFever(tempInF);
			
			break;
		case 'F':
			System.out.println("Enter the current body temperature in F: ");
			currBodyTemp = scan.nextFloat();
			tc.isFever(currBodyTemp);
			
			break;
		 default:
			 System.out.println("You should enter either C or K");
			break;
		
		
		}

	}

	
}

enum IsActive {
	YES, NO;
}

enum TemperatureLocation {
	MOUTH, ARMPIT;
}
