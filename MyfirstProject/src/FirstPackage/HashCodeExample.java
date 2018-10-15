package FirstPackage;



public class HashCodeExample {

	int x=1;
	int y = 3;
	
	//index and hashcode are the same, hashcode is the decimal format of idnex
	
	public static void main(String[] args) {
		
		HashCodeExample h1  =new HashCodeExample();
		System.out.println(h1);
		System.out.println(h1.hashCode());
		
	}

}
