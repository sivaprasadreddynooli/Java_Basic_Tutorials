//============================================================================
// Name        : Product.java
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Product in java
//============================================================================

public class Product {

	private String supplier,product;
	double quantity;

	public String getSupplier() {
		return supplier;
	}
	public Product(String sup,String prod,double qty) {
		supplier = sup;
		product = prod;
		quantity = qty;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double qty) {
		this.quantity = qty;
	}
	
	
}
