package Algorithms_synopsis;

import java.util.*;

class trail{
	
	int value1 = 3;
	int value2 = 4;
	
}


public class Hashmap_practice {

	public static void main(String[] args) {

	
		
		HashMap<String,Integer> m1 = new HashMap<String,Integer>();
		
		m1.put("siva", 100);
		m1.put("sai", 30);
		//this will replace the previous value
		m1.put("siva", 200);
		m1.put( "", 1000);
		m1.put("nath", 2000);
		
		for(Map.Entry m2:m1.entrySet())
		{
			System.out.println(m2.getValue() + " " +m2.getKey());
		}
		
		
		HashMap<String,trail> p1 = new HashMap<String,trail>();
		
		HashMap<Integer,trail> t1 = new HashMap<Integer,trail>();
		
		
		trail tp1 = new trail();
		trail tp2 = new trail();
		
		
		p1.put("sivasbook",tp1 );
		p1.put("saisbook", tp2);
		
		for(Map.Entry<String,trail> te1:p1.entrySet())
		{
			trail mid = te1.getValue();
			System.out.println(mid.value1);
		}
		

	}

}
