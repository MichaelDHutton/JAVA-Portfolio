/**This Program will roll two dice and track the pairs of the results  
 * and determine the pairs as if craps game
 */

/**
 * @author Michael Hutton
 * Date 08/07/19
 */
import java.security.SecureRandom;

public class RollDice {
	public static void main(String[] args)  throws java.lang.Exception { 
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		
		
		int SnakeEyes = 0;
		int Three = 0;
		int Four = 0;
		int Five = 0;
		int Six = 0;
		int Seven = 0;
		int Eight = 0;
		int Nine = 0;
		int Ten = 0;
		int Eleven = 0;
		int BoxCars = 0;
		System.out.println("Let's roll the dice");
		for (int i = 1; i <= 100000000; i++) 
		{
			int face1 = 1 + randomNumbers.nextInt(6);
			int face2 = 1 + randomNumbers.nextInt(6);
			switch (face1 + face2) 
			{
			case 2: 
				++SnakeEyes;
				break;
			case 3:
				++Three;
				break;
			case 4: 
				++Four;
				break;
			case 5:
				++Five;
				break;
			case 6:
				++Six;
				break;
			case 7:
				++Seven;
				break;
			case 8:
				++Eight;
				break;
			case 9:
				++Nine;
				break;
			case 10:
				++Ten;
				break;
			case 11:
				++Eleven;
				break;
			case 12:
				++BoxCars;
				break;
			}
		} 
		System.out.println("Numbers\t\tRolled");
		System.out.printf("SnakeEyes\t%d%nThree\t\t%d%nFour\t\t%d%nFive\t\t%d%nSix\t\t%d%n"
				+ "Seven\t\t%d%nEight\t\t%d%nNine\t\t%d%nTen\t\t%d%nEleven\t\t%d%nBoxCars\t\t%d%n",
				SnakeEyes, Three, Four,Five, Six, Seven, Eight, Nine, Ten, Eleven, BoxCars);
		
	}
}
