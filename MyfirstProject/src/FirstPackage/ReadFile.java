package FirstPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args)
	{
		BufferedReader br = null;	
		try{
			//if the file exists in the same path we can just give the 
			//file name, if not we can give the file path like th below'
			//statement
			//replace "\"  with "\\" as these are escape characters in Java
			//br  = new BufferedReader(new FileReader("C:\\Users\\sivap\\Desktop\\algo_test\\MyfirstProject\\newfile.txt"));
			br  = new BufferedReader(new FileReader("newfile.txt"));	
			String line;
			
			while(( line  = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
