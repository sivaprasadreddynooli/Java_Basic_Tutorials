package FirstPackage;
public class ArrayExamples {
	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println(a);
		char ch[]= new char[6];
		ch[0] = 's';
		ch[1] = 'i';
		ch[2] = 'v';
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(ch);
	}
}
