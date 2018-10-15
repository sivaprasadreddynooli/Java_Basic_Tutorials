package saistask;

import java.util.*;

public class sortarraybasedonfrequency {

	public static void main(String[] args) {
		int a[] = {1,2,1,2,3,4,3,4,6,6,6,7,8,10};
		
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hmap.containsKey(a[i]))
			{
			hmap.put(a[i], hmap.get(a[i])+1);	
			}
			else
			{
			hmap.put(a[i],1);
			}
		}
		
		
	//Set entryset = hmap.entrySet();
		
	//Iterator iter = entryset.iterator()
	
		for(Map.Entry<Integer, Integer> entry:hmap.entrySet())
		{
			int i= entry.getValue();
			int j = entry.getKey();
			System.out.println(i + " " + j );	
		}
		

	}

}
