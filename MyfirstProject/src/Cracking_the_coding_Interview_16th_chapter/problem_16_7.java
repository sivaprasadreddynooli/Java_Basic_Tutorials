package Cracking_the_coding_Interview_16th_chapter;

import java.util.*;

public class problem_16_7 {

	
	
	public static void main(String args[])
	{
		String S = "2-4A0r7-4k";
		int k = 3;
	
		StringBuilder sb = new StringBuilder();
		
		S = S.replace("-","");
		
		
		S.toUpperCase();
		System.out.println(S);
		int n = S.length();
		if(n%k == 0)
		{
			int i =0;
			for(i=0;i<n-k;i = i+k)
			{
				sb = sb.append(S.substring(i, i+k) + "-");
			}
			sb = sb.append(S.substring(i, i+k));
			System.out.println(sb.toString());
		}
		else
		{
		int r = n%k;
		int i=0;
		sb.append(S.substring(0,r) + "-");
		System.out.println(sb.toString());
		for(i=r;i<n-k;i = i+k)
		{
			sb = sb.append(S.substring(i, i+k) + "-");
		}
		sb = sb.append(S.substring(i, i+k) );
		System.out.println(sb.toString());
			
		}
		
	}
	
	
}
