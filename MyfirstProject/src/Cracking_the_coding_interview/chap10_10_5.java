package Cracking_the_coding_interview;

public class chap10_10_5 {

	static int find(String[] s,String fi,int l,int r)
	{
		if(l>r)
		return -1;
		int m = (r+l)/2;
		if(s[m].equals(fi))
		{
			return m;
		}
		
		int left = m-1;
		int right = m+1;
		
		if(s[m].isEmpty())
		{
			while(right<=r && s[right].compareTo("") == 0)
			{
				right++;
			}
			while(left<=r && s[left].compareTo("") == 0)
			{
				left++;
			}	
		}
		
		
		if(s[left].equals(fi))
		{
			return m;
		}
		if(s[right].equals(fi))
		{
			return m;
		}
		
		if(s[left].compareTo(fi) > 0)
		{
			return find(s,fi,l,left-1);
		}
		else
		{
			return find(s,fi,right+1,r);
		}
		
	}
	
	
	public static void main(String[] args) {
		String s[] = new String[11];
		s[0] = "at"; 
		s[1] =	""	;
		s[2] = "";
		s[3] =	"ball";	
		s[4] = "";
		s[5] =	"";	
		s[6] = "";
		s[7] =	"cat";	
		s[8] = "";
		s[9] =	"";
		s[10] = "dad";
		String fi = "ball";
		System.out.println(find(s,fi,0,10));
	}

}
