package FirstPackage;


class jjj
{
int i;
String name;
	jjj(int a,String h)
	{
		i = a;
		name = h;
	}
}


public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		jjj j1 = new jjj(4,"siva");
		//jjj j2 = new jjj();
		//the above statement will give error, as the constructor has to take the values
	
	}

}
