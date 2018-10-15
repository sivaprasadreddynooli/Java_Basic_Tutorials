package Cracking_the_coding_Interview_16th_chapter;


import java.util.*;

public class secondtest {

	
	
	
	static String[] sortWordsByScore(String[] words) {
        /*
         * Write your code here.
         */
		Map<String,Integer> wordsfreq = createFreq(words);
        Map<String, Integer> scoreMap = createScoreMap(words);
        List<Map.Entry<String, Integer>> entryList = sortByValue(scoreMap);
        resArray(words, entryList,wordsfreq);
        return words;

    }
	
	
	public static Map<String,Integer> createFreq(String[] words)
	{
		Map<String,Integer> wordsFreq = new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++)
		{
			if(wordsFreq.containsKey(words[i]))
				{
				wordsFreq.put(words[i], wordsFreq.get(words[i])+1);
				}
			else
			{
				wordsFreq.put(words[i], 1);
			}
			
		}
		return wordsFreq;
	}
	
    public static void resArray(String[] words,  List<Map.Entry<String, Integer>> list, Map<String,Integer> wordsFreq){
        int index = 0;
        for(Map.Entry<String,Integer> entry: list){
        	for(int i=0;i<wordsFreq.get(entry.getKey());i++)
        	{
            words[index++] = entry.getKey();
        	}
        }
    }
    
    
    public static Map<String, Integer> createScoreMap(String[] words){
        Map<String,Integer> scoreMap = new LinkedHashMap();
        for(int i=0; i<words.length; i++){
            scoreMap.put(words[i], calculateScore(words[i]));
        }
        return scoreMap;
    }
public static int calculateScore(String word){
    int result = 0;
    String temp = word.toUpperCase();
    for(int i=0; i<temp.length(); i++){
        char c = temp.charAt(i);
        if(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' ){
            result = result +(2*(c - 'A' + 1));
        }
        else{
            result = result +(c - 'A' + 1);
        }
    }
    return result;
}

public static List<Map.Entry<String,Integer>> sortByValue(Map<String,Integer> scoreMap){
    List<Map.Entry<String,Integer>> entryList = new ArrayList<Map.Entry<String,Integer>>(scoreMap.entrySet());
    Collections.sort(entryList, new Comparator<Map.Entry<String,Integer>>()
                     {
                         @Override
                         public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                             return o1.getValue().compareTo(o2.getValue());
                         }
                     }
                    );
    return entryList;
        
}
	

public static void main(String args[])
{

	String words[] = {"this","this","that"};
	sortWordsByScore(words);
	for(String value:words)
	{
		System.out.println(value);
	}

}
	
	
}
