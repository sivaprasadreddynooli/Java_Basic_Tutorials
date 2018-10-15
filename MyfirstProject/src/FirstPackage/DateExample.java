package FirstPackage;

import java.util.Date;
import java.text.*;
public class DateExample {
	public static void main(String[] args)
	{
		Date dt =new Date();
		System.out.println(dt.toString());
		
		//getTime method prints the epoch time, that the milliseconds since
		//jan 1st 1970 
		System.out.println(dt.getTime());
		
		System.out.println(dt.getDate());
		//it prints the number of years since 1900
		//add 1900 to get the present year
		System.out.println(dt.getYear());
		//get the monthid in digits
		//with jan-0,feb-1,march-2 etc.
		System.out.println(dt.getMonth());		
		//get todays date
		System.out.println(dt.getDay());
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd hh:mm");
		System.out.println(sdf.format(dt));
			
	}
}
 