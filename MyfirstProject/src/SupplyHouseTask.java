import java.util.*;


public class SupplyHouseTask {
	public static void main(String[] args) {	
		String filename="home/accountid/file_path_on_server/";
		String ext[] = filename.split(".");	
		//Supplier Id will be file name without extension
		String supplierId = ext[0];
		
	
		HashMap<String,Product> Product_details = new HashMap<String,Product>();

			if ( ext[1] == ".csv")
			{
				Product_details = OpenFileNames.SetProductDetailscsv(filename);
			}
			else if(ext[1] == ".xlsx")
			{
				Product_details = OpenFileNames.SetProductDetailsxlsx(filename);				
			}
		
		for(String productId:Product_details.keySet())
		{
			//Here is the main part in updating the database table
			// We will have supplier id from the file name 
			//Here we will loop through the each product record and will update the 
			//database table 
		}
	}
}
