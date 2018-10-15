package Algorithms_synopsis;

import java.util.*;

public class Array_vs_Arraylist {

	/*
	An array is basic functionality provided by Java. ArrayList is part of collection 
	framework in Java. Therefore array members are accessed using [], 
	while ArrayList has a set of methods to access elements and modify them.
	
	Array is a fixed size data structure while ArrayList is not. One need not to
	 mention the size of Arraylist while creating its object. Even if we specify 
	 some initial capacity, we can add more elements.
	 
	Array can contain both primitive data types as well as objects of a class depending on 
	the definition of the array. However, ArrayList only supports object entries,
	 not the primitive data types.
	
    Note: When we do arraylist.add(1); : it converts the primitive int data type into an Integer object. Sample Code:
	
	Since ArrayList can’t be created for primitive data types, members of ArrayList are always 
	references to objects at different memory locations (See this for details). Therefore in ArrayList, 
	the actual objects are never stored at contiguous locations. References of the actual 
	objects are stored at contiguous locations.
	
     In array, it depends whether the arrays is of primitive type or object type.
     In case of primitive types, actual values are contiguous locations, but in case of objects, 
     allocation is similar to ArrayList.
	*/
	
	public static void main(String[] args) {
	
		/* ........... Normal Array............. */
        // Need to specify the size for array 
		int arr[] = new int[10];
		
		arr[0] = 1;
		arr[1] = 2;
		System.out.println(arr[0]);
		
		
		 /*............ArrayList..............*/
        // Need not to specify size 
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		System.out.println(al.get(0));
		
		
		
		

	}

}
