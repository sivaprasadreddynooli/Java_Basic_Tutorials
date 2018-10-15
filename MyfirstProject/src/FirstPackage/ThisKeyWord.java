package FirstPackage;

//various uses of this keyword

//1. this can be used to refer current class instance variable.
//2. this can be used to invoke current class method (implicitly)
//3. this() can be used to invoke current class constructor.



class mmm
{
	
mmm getmmm()
{	
	return this; // this keyword can be used to return current class instance
}

void msg()
{
System.out.println("this is the message");	
}

}

class ddd
{
	  void m(ddd obj){  
		  System.out.println("method is invoked");  
		  } 
	  
	  void p(){  
		  	m(this);   // to pass as an argument in the method
		  } 
}


class bbbb{  
	  A4 obj;  
	  bbbb(A4 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}  


class A4{  
	  int data=10;  
	  A4(){  
	   bbbb b=new bbbb(this);  //to pass as argument in the constructor call
	   b.display();  
	  }  
	  public static void main(String args[]){  
	   A4 a=new A4();  
	  }  
	}



class sss
{
	int  i ;
	String name;
	int id;
	sss(int idd)
	{
	this.id = idd;
	System.out.println("this is constructor with parameteres");
	}
	sss()
	{
		this(5); // to invoke current class constructor
		//Call to this() must be the first statement in constructor.
		System.out.println("this is constructor without parameteres");
	}
	void set(int i,String name)
	{
		this.i = i;//to refer current class instance variable
		this.name = name;
	}
	
	void display()
	{
		System.out.println("the values are " + i + "  " + name);
	}
	void seconddisplay()
	{
		this.display(); //to invoke current class method
		display(); // this is same as this.display()
		System.out.println("this is seconddisplay");
	}

}

public class ThisKeyWord {
	
	public static void main(String[] args) {
		sss s1 = new sss(5);
		sss s2 = new sss();
		s1.display();
		s1.seconddisplay();

		ddd d1 = new ddd();
		d1.p(); 
		
		
		new mmm().getmmm().msg(); // this keyword can be used to return current class instance
		
	}

}
