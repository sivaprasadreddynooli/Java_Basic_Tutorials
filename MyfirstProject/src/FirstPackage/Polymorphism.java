package FirstPackage;

public class Polymorphism {

	public static void main(String[] args)
	{
		Bank sbi = new SbiBank();
		Bank hdfc = new HdfcBank();
		Bank andhra = new AndhraBank();
		
		
		System.out.println(sbi.getInterestRate());
		System.out.println(hdfc.getInterestRate());
		System.out.println(andhra.getInterestRate());
		
		
		//declaring polymorphic array
		Bank banks[] = new Bank[5];
 		 
		for (int i = 0;i<2;i++)
		{
			banks[i] = new SbiBank();
		}
		
		banks[2] = new HdfcBank();
		banks[3] = new HdfcBank();
		banks[4] = new AndhraBank();
		
		for(int i=0;i<banks.length;i++)
		{
			System.out.println(banks[i].getInterestRate());
		}
		
		
	}
	
}
