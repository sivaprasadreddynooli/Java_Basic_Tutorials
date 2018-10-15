package Algorithms;

import java.util.Arrays;

import java.util.*;

class integers implements Comparable<integers>
{
int a;
int b;
int c;

integers()
{
	
}

integers(int a,int b,int c)
{
	this.a = a;
	this.b = b;
	this.c = c;
}

public int compareTo(integers def)
{
	int avalue = def.c;
	return this.c-avalue;
}

public static Comparator<integers> integeracompare = new Comparator<integers>(){
	public int compare(integers i1,integers i2)
	{
		return i1.a -i2.a;
	}
};


}


public class Comparableclassexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		integers ints[] = new integers[3];
		ints[0] = new integers();
		ints[0].a = 444;
		ints[0].b = 8;
		ints[0].c = 2;
		
		ints[1] = new integers();
		ints[1].a = 9;
		ints[1].b = 1;
		ints[1].c = 0;
		
		ints[2] = new integers();
		ints[2].a = 44;
		ints[2].b = 88;
		ints[2].c = 32;
		
		Arrays.sort(ints);
		
		
		for(integers temp:ints)
		{
			System.out.println(temp.a);
		}

	}

}
