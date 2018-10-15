package Code_a_thon;

import java.util.*;

public class pinnaples {
	
	String helper(long l,long r,long k)
	{
		if(k==0)
		 {
			 return "";
		 }
		 else if(k==1)
		 {
			 return "L";
		 }
		 else if(k==2)
		 {
			 return "M";
		 }
		 else if(k==3)
		 {
			 return "R";
		 }
		
		long offset = (r-l+1)/3;
		
		long n = l-((r-k)/3)-1;
		
		if(k <= (l+offset-1))
		{
			return "L"+helper(l,l+offset-1,k);
		}
		else if(k<=(l+(2*offset)-1))
		{
			return "M"+helper(l+offset,l+(2*offset)-1,k);
		}
		else if(k<=(l+(3*offset)-1))
		{
			return "R"+ helper(l+(2*offset),l+(3*offset)-1,k);
		}
		return "";
	}

	 String find(long n)
	{
		 
		 
		 if(n==0)
		 {
			 return "";
		 }
		 else if(n==1)
		 {
			 return "L";
		 }
		 else if(n==2)
		 {
			 return "M";
		 }
		 else if(n==3)
		 {
			 return "R";
		 }
			 
		long run = 1;
		long count = 0;
		long prev = 1;
		while(count<n)
		{
			run = run*3;
			prev = count;
			count = count + run;
		}

	
		return helper(prev+1,count,n);
	}
	
	public static void main(String[] args) {
		pinnaples P1 = new pinnaples();
		Scanner s1 = new Scanner(System.in);
	   long n = s1.nextInt();
		System.out.println(P1.find(n-1));

	}

}
