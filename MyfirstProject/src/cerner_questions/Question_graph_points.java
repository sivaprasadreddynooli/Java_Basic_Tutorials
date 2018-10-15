package cerner_questions;

import java.util.*;

public class Question_graph_points {

	String find(int a[])
	{
		int d1 = a[0] - a[1];
		int d2 = a[2] - a[3];
		
		if( (a[0] == a[2]) && (a[1] < a[3]))
		{
			return "N"; 
		}
		else if( (a[0] < a[2]) && (a[1] < a[3]))
		{
			return "ne";
		}
		else if((a[0] == a[2]) && (a[1] > a[3]))
		{
			return "s";
		}
		else if((a[0] < a[2]) && (a[1] > a[3]))
		{
			return "se";
		}
		else if((a[1] == a[3] ) && (a[0] > a[2]))
		{
			return "w";
		}
		else if((a[1] < a[3] ) && (a[0] > a[2]))
		{
			return "nw";
		}
		else if((a[1] > a[3] ) && (a[0] > a[2]))
		{
			return "sw";
		}
		else 
		{
			return "e";
		}
		
			
		
	}
	
	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	int a[] = new int[4];
	for(int i =0;i<4;i++)
	{
		a[i] = s1.nextInt();
	}
	
	 Question_graph_points q1 = new  Question_graph_points();
	System.out.println(q1.find(a));
	s1.close();
		}
}
