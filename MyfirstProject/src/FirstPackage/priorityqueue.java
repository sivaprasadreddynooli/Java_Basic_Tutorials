package FirstPackage;

import java.util.*;

public class priorityqueue {

	public static void main(String[] args)
	{
		
		PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
		
		temp.add(190);
		temp.add(45);
		temp.add(34);
		temp.add(3456);
		temp.add(3);
		
		System.out.println(temp.peek());
		System.out.println(temp.poll());
		
		for(Integer value:temp)
		{
			//System.out.println(value);
			
		}
		System.out.println(temp.poll());
		System.out.println(temp.poll());
		System.out.println(temp.poll());
		System.out.println(temp.poll());
		System.out.println(temp.poll());
		
		
	}
	
	
}
