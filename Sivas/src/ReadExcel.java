import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ReadExcel {

	private static String file_name = "src/Book1.xlsx";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File x = new File(file_name);
	
	FileInputStream excel = new FileInputStream(x);
	Workbook wkbook = new XSSFWorkbook(excel);
	Sheet datatypeSheet = wkbook.getSheetAt(0);
	Iterator<Row> iterator = datatypeSheet.iterator();
	ArrayList<Product> list = new ArrayList<Product>();
	String product = "", supplier="";
	String[] y;
	int supplierAsInt=0;
	double qty=0;
	double productAsInt=0;
while(iterator.hasNext()) {
	//System.out.println("iterator call");
	Row curRow = iterator.next();
	Iterator<Cell> cellIterate = curRow.iterator();
	int productCount = 0;
	Product temp = new Product();
	supplier = x.getName();
	y = supplier.split(".xlsx");
	supplier = y[0];
	temp.setSupplier(supplier);
	//System.out.println("File name is "+supplier);
	if(cellIterate.hasNext()) {
		//System.out.println("cellIterateCall");
		Cell curCell1 = cellIterate.next();
		if(curCell1.getCellTypeEnum() == CellType.NUMERIC)
			productAsInt = curCell1.getNumericCellValue();
			else
				product = curCell1.getStringCellValue();
		
		Cell curCell2 = cellIterate.next();
		if(curCell2.getCellTypeEnum() == CellType.NUMERIC)
			qty=curCell2.getNumericCellValue();
			else
				System.out.println("Wrong data type in excel");
		
	}
	temp.setProduct(product);
	temp.setQuantity(qty);
	//insert this temp into database
	System.out.println(temp.getSupplier()+" "+temp.getProduct()+" "+temp.getQuantity());
	
}
	
}
catch (FileNotFoundException e) {
	e.printStackTrace();
}catch (Exception e) {
	e.printStackTrace();
}
	}

}
