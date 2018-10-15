

import java.util.*;

public class dummy {

	public static void main(String args[])
	{
		
		
		int a[] = {44,67,89,90,34,23};
		
		List<Integer> res = new ArrayList<Integer>();
		res.add(44);
		res.add(67);
		res.add(89);
		res.add(90);
		res.add(34);
		res.add(23);
		
		Collections.sort(res,new Comparator<Integer>()
		
			{
				public int compare(Integer o1,Integer o2)
				{
					return 0;
				}
			}	
		);
		
	for(Integer value:res)
	{
		System.out.println(value);
	}
		
		
	}
	
	
}
