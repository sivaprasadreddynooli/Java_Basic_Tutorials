package FirstPackage;


//we can't use super and this in static context
class lll
{

	void calc()
	{
		System.out.println("this is from lll class");
	}
	
}

class nnn extends lll
{
	int i;
	static void calcc()
	{
		//super.calc();
		//this.i  =9;
	}

	
}


public class ThisAndSuperInStaticContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
