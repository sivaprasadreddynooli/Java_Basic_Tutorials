package FirstPackage;
class jj
{
int i=0;
int j=5;
void funcj()
{
	i = i+1;
	j = j+1;
	System.out.println("funcj");
}
}

class gg
{
	static int x = 6;
	static jj j1 = new jj() ;
}

public class StaticClassVariable {
	public static void main(String[] args) {
		System.out.println(gg.x);
		System.out.println(gg.j1.i);
		System.out.println(gg.j1.j);
		gg.j1.funcj();
		System.out.println(gg.j1.i);
		System.out.println(gg.j1.j);
	}

}
