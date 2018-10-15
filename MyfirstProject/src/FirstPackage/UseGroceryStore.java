package FirstPackage;

public class UseGroceryStore {

	public static void main(String[] args)
	{
		GroceryStore g1 = new GroceryStore();
		
		g1.setItemCode(1);
		g1.setItemName("tomatoes");
		g1.setShopName("walmart");
		
		//the below statement will give error, as we can't access the private
		//variables in the package, we can access through getter methods
		//System.out.printlln(g1.itemName);
		System.out.println(g1.getItemName());
		
		//we can access below variable strait away, since it is not private
		System.out.println(g1.className);
		
	}
	
	
}
