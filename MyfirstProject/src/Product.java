//============================================================================
// Name        : Product.java
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Product in java
//============================================================================


// This is a product object created for each record in the file that we receive.
// This contains all the fields needed for the both the file formats that is 
// CSV and Excel file formats. Depending on the file format we will use the 
// corresponding details. But every file contains the mandatory fields like 
// Supplier,Product and quantity . So, Product method has been created with all
// the mandatory fields as parameters. 

public class Product {

	private String supplier,product;
	double price;
	int quantity;
	//Brand value will only be non empty in case of excel files and may be empty incase of CSV files
	private String brand = "";

	public String getSupplier() {
		return supplier;
	}
	public Product(String sup,String prod,int qty) {
		supplier = sup;
		product = prod;
		quantity = qty;
	}

	public String getProduct() {
		return product;
	}


	public double getQuantity() {
		return quantity;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
}
