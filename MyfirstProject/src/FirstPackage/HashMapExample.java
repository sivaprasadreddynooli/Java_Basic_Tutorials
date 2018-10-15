package FirstPackage;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		
		h1.put(1,"siva");
		h1.put(2, "sai");
		h1.put(1, "hema");
		
		h1.remove(2);
		
		
		for(Map.Entry m :h1.entrySet())
		{
			System.out.println(m.getKey() + "  " +m.getValue());
		}
		
		
		
	}

}
