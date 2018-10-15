
import java.util.*;

public class treemapdummy {

	
	public static void main(String args[])
	{
		
		TreeMap<Integer,Integer> tree = new TreeMap<Integer,Integer>();
		
		tree.put(41, 2);
		tree.put(4, 9);
		tree.put(37, 9);
		tree.put(99, 9);
		tree.put(4, 9);
		tree.put(127, 9);
		
		for(Map.Entry<Integer, Integer>  temp:tree.entrySet())
		{
			System.out.println(temp.getKey() +  " " +temp.getValue());
		}
		
		
	}
	
	
}
