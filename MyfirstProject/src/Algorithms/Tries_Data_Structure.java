package Algorithms;

class TN
{
	boolean iscomplete = false;
	TN charset[] = new TN[26];
	TN()
	{
		for(int i=0;i<26;i++)
		{
			charset[i] = null;
		}
	}
}


public class Tries_Data_Structure {

TN root;	
void insert(String s,TN root)
{
	TN dummy;
	dummy = root;
	
	for(int i=0;i<s.length();i++)
	{
		if(dummy.charset[s.charAt(i) - 'a'] == null){
			TN temp = new TN();
			dummy.charset[s.charAt(i) - 'a'] = temp; 
			dummy = temp;
		}
		else
		{
			dummy = dummy.charset[s.charAt(i) - 'a'] ;
		}
	}
	
	dummy.iscomplete = true;
}
	
boolean search(String s,TN root)
{

	TN dummy = root; 
	
	for(int i=0;i<s.length();i++)
	{
		if(dummy.charset[s.charAt(i) - 'a'] == null)
		{
			return false;
		}
		else
		{
			dummy = dummy.charset[s.charAt(i)- 'a'];
		}
	}
	
	return dummy.iscomplete;
}

	public static void main(String[] args) {
		
		Tries_Data_Structure t1 = new Tries_Data_Structure();
		t1.root = new TN();
		String s1 = "siva";
		String s2 = "sivareddy";
		t1.insert(s1,t1.root);
		t1.insert(s2, t1.root);
		
		System.out.println(t1.search("sivareddyz",t1.root));
		

	}

}
