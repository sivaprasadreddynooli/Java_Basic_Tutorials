package FirstPackage;


import java.util.ArrayList;
public class ArraylistExample {

	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		
		mylist.add(2);
		mylist.add(5);
		mylist.add(67);
		
		for(int i:mylist)
		{
			System.out.println(i);
		}
		
		System.out.println("the size of the list is "+mylist.size());
		//removes the element at index 1
		mylist.remove(1);
		
	  for(int i:mylist)
	  {
		  System.out.println(i);
	  }
		
	  System.out.println("the size of the list is " + mylist.size());
		
	  mylist.add(456);
	  mylist.add(56);
	  mylist.set(3, 567);
	 
	  for(int i:mylist)
	  {
		  System.out.println(i);
	  }
	  
	  //will clear all the content present in the list
	  mylist.clear();
	 

	  for(int i:mylist)
	  {
		  System.out.println(i);
	  }
	}
	
	
}
