package Oops_basics;


/*
Anonymous simply means nameless. An object which has no reference is known as anonymous object. 
It can be used at the time of object creation only.

*/
class calculate
{
	void fact(int i)
	{
		int res = 1;
		for(int j=1;j<=i;j++)
		{
			res = res * j;
		}	
		System.out.println(res);
	}
}

public class AnonymousObject {
	public static void main(String[] args) {
		new calculate().fact(5);
	}
}
