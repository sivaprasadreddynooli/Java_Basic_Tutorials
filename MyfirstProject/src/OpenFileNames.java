import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;



public class OpenFileNames {

	
	
	// This method will parse through the CSV file format file and for each record
	// this will create a record with Product object against productId
	// and this will return the hashTable with all the records.

	//HashMap<String,Product> Product_details = new HashMap<String,Product>();
	
	
	// we will loop through the each record and will parse the record to get the 
	// required fields and insert into hashmap 
	// Since each file will contain the one record per one product, we can insert into
	// hashmap based on the product id.

	
	
	static HashMap<String,Product> SetProductDetailscsv(String filename)
	{
		HashMap<String,Product> Product_details = new HashMap<String,Product>();
		//do the parsing and update the hashmap
		return  Product_details;
	}
	
	
	static HashMap<String,Product>  SetProductDetailsxlsx(String file_name)
	{	
		HashMap<String,Product> Product_details = new HashMap<String,Product>();
		//do the parsing and update the hashmap
		return  Product_details;
			
	}
}
