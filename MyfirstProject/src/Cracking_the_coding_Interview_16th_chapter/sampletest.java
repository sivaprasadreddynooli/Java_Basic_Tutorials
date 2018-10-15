package Cracking_the_coding_Interview_16th_chapter;

class sampletest {
		
		
static public String solution(String S) {
    // write your code in Java SE 8
    
    String temp = S;
    S= S.replace(":","");
    S = S.replace(S.substring(0,1),"");
    
    if(S.length() == 0) 
    {
     return temp;   
    }
    else
    {
    	String[] values = temp.split(":");
	     
	     String tempvalue = values[1].replace(values[1].substring(0,1),"");
	     
	     if(tempvalue.length() == 0)
	     {
	    	 //deal with minutes
	       String tempvaluestring =  Integer.toString(permute(values[0]));
	       if(tempvaluestring.length() == 1)
	       {
	           tempvaluestring = tempvaluestring+tempvaluestring;
	       }
	         
	     return tempvaluestring + ":" +  values[1] ;
	     }
	     else
	     {
	    	 //deal with seconds 
	         
	         String tempvaluestring =  Integer.toString(permute(values[1]));
	       if(tempvaluestring.length() == 1)
	       {
	           tempvaluestring = tempvaluestring+tempvaluestring;
	       }
	         
	     return values[0] +  ":" + tempvaluestring;
	     }
    
    }

}

static public int permute(String value)
	{
		int temp[] =new int[3];
		
		 temp[0] = Integer.parseInt(value.substring(0,1) + value.substring(0,1));
		int i1 = Integer.parseInt(value.substring(0,1) + value.substring(1,2));
		temp[1] = Integer.parseInt(value.substring(1,2) + value.substring(0,1));
		 temp[2] = Integer.parseInt(value.substring(1,2) + value.substring(1,2));
		int store = 0;
        int min = Integer.MAX_VALUE;
        System.out.println(i1);
        System.out.println(temp[0]);
        System.out.println(temp[1]);
        System.out.println(temp[2]);
        for(int i=0;i<3;i++)
        {
        	
        	if(temp[i] < i1 && min > i1 - temp[i])
        	{
        		min = i1 - temp[i];
        		store = temp[i];
        	}
        
        }
        
        System.out.println(store);
        	return store;	
	}
	
	
		

public static void main(String args[])
{

	System.out.println(solution("10:10"));

}
		
		
}
		
		
		
	
	
	

