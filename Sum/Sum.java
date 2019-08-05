/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int number = 2; number <= 20; number += 2) 
		{
			total += number;
		}
		System.out.printf("Sum is %d%n", total);
	}
}
