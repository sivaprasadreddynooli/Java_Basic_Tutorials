package FirstPackage;

enum season{Winter,Fll,Spring}

class iii
{
season s;
void display()
{

	System.out.println("the values are " + s);
}

}


public class EnumExample {

	public static void main(String[] args) {
		iii i1 = new iii();
		i1.s = season.Winter;
		i1.display();

	}

}
