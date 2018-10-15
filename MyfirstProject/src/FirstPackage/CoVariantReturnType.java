package FirstPackage;

class dddd
{
	dddd get()
	{
		return this;
	}	
}


class gggg extends dddd
{	
	gggg get()
	{
		return this;
	}
	void msg()
	{
		System.out.println("welcome to covariant return type");
	}	
}

public class CoVariantReturnType {

	public static void main(String[] args) {
		new gggg().get().msg();

	}

}
