package Algorithms_synopsis;

import java.util.*;

public class Hashmap_vs_hashtable {

	/*
	Hashmap vs Hashtable
	1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many 
	threads without proper synchronization code whereas Hashtable is synchronized. 
	It is thread-safe and can be shared with many threads.
	2. HashMap allows one null key and multiple null values whereas 
	Hashtable doesn’t allow any null key or value.
	3. HashMap is generally preferred over HashTable if thread synchronization is not needed

	Why HashTable doesn’t allow null and HashMap does?
	To successfully store and retrieve objects from a HashTable, the objects used as keys must 
	implement the hashCode method and the equals method. Since null is not an object, it can’t
	 implement these methods. HashMap is an advanced version and improvement on the Hashtable.
	 HashMap was created later.
	*/
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("siva", 100);
		hm.put("sai", 20);
		hm.put("hema", 200);
		hm.put("", 400);
		hm.put("null", 500 );
		
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		
		ht.put("siva", 100);
		ht.put("sai", 200);
		ht.put("hema", 300);
		ht.put("", 400);
		ht.put("null", 500);
		

	}

}
