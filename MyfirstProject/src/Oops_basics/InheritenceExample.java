package Oops_basics;
class animal{
	void eat()
	{
		System.out.println("eating");
	}
}

class dog extends animal{
	void bark()
	{
		System.out.println("barking");
	}
}

class babydog extends dog{
	void weep()
	{
		System.out.println("weeping");
	}
}

public class InheritenceExample {
	public static void main(String[] args) {
		babydog b1 = new babydog();
		b1.weep();
		b1.bark();
		b1.eat();
	}
}
