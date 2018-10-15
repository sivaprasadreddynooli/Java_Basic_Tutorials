package FirstPackage;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args)
	{
		
		
		LinkedList<String> linklist = new LinkedList<String>();
		
		linklist.add("siva");
		linklist.add("sai");
		linklist.add("bujji");
		linklist.addFirst("head");
		linklist.addLast("last");
		
		System.out.println(linklist);
		
		
		linklist.removeLast();
		linklist.removeFirst();
		
		linklist.add(3, "hello");
		
		linklist.remove(2);
		
		linklist.set(2, "4thindex");
		
		System.out.println(linklist.size());
		
		for(String x:linklist)
		{
			System.out.println(x);
		}
		
		linklist.clear();
	
	}
	
}
