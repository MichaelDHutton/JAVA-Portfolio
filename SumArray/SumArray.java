/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class SumArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {87, 89, 1232, 515, 161, 64, 465};
		int total = 0;
		
		for (int counter = 0; counter < array.length; counter++) 
		{
			total += array[counter];
		}
		System.out.printf("Total of array elements: %d%n", total);
	}

}
