package FirstPackage;

public class GroceryStore {

	
	
	//the variables with access modifier private cannot be visible in
	//package, subclass, and to the world
	//this can be accessed through getter and setter methods
	private int itemCode;
	private String itemName ;
	private  String shopName;
	String className = "GroceryStore";
	
	public int getItemCode() {
		return itemCode;
	}
	
	
	
	//when we have the two variables with same name one is the method parmeter
	//and another being the instance variable, the keyword "this" will be used to
	//distinguish instance variable from the parameter.
	//"this.parameter" refers to instance variable named "parameter"
	
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	
	
	
	
}
