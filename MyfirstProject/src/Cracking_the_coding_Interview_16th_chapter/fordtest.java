package Cracking_the_coding_Interview_16th_chapter;


import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.LinkedHashMap;

import java.util.List;

import java.util.Map;

import java.util.Map.Entry;

public class fordtest {

	
	public static void sortByFrequency(String[] values) {

		Map<String, Integer> frequencyMap = createFrequencyMap(values);



		List<Entry<String, Integer>> entryList = sortByValue(frequencyMap);



		putSortedElementsBackInArray(values, entryList);

	}
	
	



	public static void putSortedElementsBackInArray(String[] values,

			List<Entry<String, Integer>> list) {

		int index = 0;


/*
		// Arrange array elements in sorted list of entry set of frequency map.

		for (Map.Entry<String, Integer> entry : list) {

			System.out.println(entry);
			for (int i = 0; i < entry.getValue(); i++) {

g				System.out.println(index);
				values[index] = entry.getKey();
				index++;

			}

		}
*/
		for (Map.Entry<String, Integer> entry : list) {

		
				System.out.println(index);
				System.out.println( entry.getKey() +  " "+ entry.getValue());
				values[index] = entry.getKey();
				index++;

			}

		
		
		
	}


private static Map<String, Integer> createFrequencyMap(String[] values) {


	// Use LinkedHashMap because it maintains insertion order of elements.

	Map<String, Integer> frequencyMap = new LinkedHashMap<>();


	for (int i = 0; i < values.length; i++) {
			frequencyMap.put(values[i], calc(values[i]));
	}
	return frequencyMap;

}




public static int calc(String value)
{
	int res = 0;
	String temp = value.toUpperCase();
	for(int i=0;i<temp.length();i++)
	{
		if(temp.charAt(i) == 'A' || temp.charAt(i) == 'E' 
				|| temp.charAt(i) == 'I' || temp.charAt(i) == 'O' || temp.charAt(i) == 'U')
		{
			res = res + (2*(temp.charAt(i)-'A' + 1) );
		}
		else
		{
			res = res + temp.charAt(i) - 'A' + 1;
		}
		
		
	}
	return res;
}








public static List<Entry<String, Integer>> sortByValue(

		Map<String, Integer> frequencyMap) {



	// List containing elements of map's entry set.

	List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(
			frequencyMap.entrySet());



	// Sort the list.
	Collections.sort(entryList,
			new Comparator<Map.Entry<String, Integer>>() {



				@Override

				public int compare(Entry<String, Integer> o1,

						Entry<String, Integer> o2) {

					return o1.getValue().compareTo(o2.getValue());

				}

			});

	return entryList;

}



		public static void main(String args[])
		{
			
			String temp[]  = {"this","that"};
			 sortByFrequency(temp);
			 for(String value:temp)
			 {
				 System.out.println(value);
			 }
		
		
		
		}

}












