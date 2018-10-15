package Oops_basics;



class OverloadingCalculation3{  
	  void sum1(int a,int b){System.out.println("int arg method invoked");}  
	  void sum1(long a,long b){System.out.println("long arg method invoked");}  
	  void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  	   
	} 

public class MethodOverloadingAmbiguity {

	public static void main(String[] args) {
		OverloadingCalculation3 obj=new OverloadingCalculation3();  
		obj.sum1(20, 20);
		 //obj.sum(20,20);//now ambiguity  

	}

}
