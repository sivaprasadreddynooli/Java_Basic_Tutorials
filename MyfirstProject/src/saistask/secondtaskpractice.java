package saistask;

import java.util.*;

public class secondtaskpractice {

	static void process(int a[])
	{
		Map<Integer,Integer> hmap = new LinkedHashMap<Integer,Integer>();
		
		
		for(int i=0;i<a.length;i++)
		{
			if(hmap.containsKey(a[i]))
			{
				hmap.put(a[i],hmap.get(a[i])+1);
			}
			else
			{
				hmap.put(a[i],1);
			}
		}
		
		
		List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(hmap.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
			
			@Override
			public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2)
			{
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		
		int index = 0;
		for (Map.Entry<Integer, Integer> entry : list) {
			for (int i = 0; i < entry.getValue(); i++) {
				a[index++] = entry.getKey();
			}
		}

		
	}
	
	
	public static void main(String[] args) {
		int a[] = {1,2,4,43,44,44,5,1,2,7,8,9,3,2,1,1,1,78};
		
		process(a);
		
		for(int value:a)
		{
			System.out.println(value);
		}

	}

}
