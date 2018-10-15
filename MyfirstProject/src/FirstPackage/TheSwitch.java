package FirstPackage;

public class TheSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 89;
		
		/*
		 * If you don't put break statement in side the case statement all the 
		 * case statements below of it will be executed
		 */
		switch(score)
		{
		
		case 100:
		case 98:
		case 90:
			System.out.println("Hello score is 90");
			break;
		case 89:
			System.out.println("your score is 89");
			//break;
		case 70:
			System.out.println("your score is 70");
			//break; try to execute now it will execute the
			//default statement as well
		default:
			System.out.println("this is default score");
			break;
		}

	}

}
