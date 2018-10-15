package FirstPackage;

import java.io.*;

public class FileHandling {

	public static void main(String[] args)
	{
		
		try
		{
		File file = new File("newfile.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}	
			
		PrintWriter pwr = new PrintWriter(file); 
		pwr.println("hello ");
		pwr.println("how are you");
		pwr.close();
		}
		catch( IOException e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	
	
	
	
}
