/**
 * 
 */

/**
 * @author Michael Hutton
 * 8/8/2019
 */
public class BarChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Grade Distribution:");
		
		for (int counter = 0; counter < array.length; counter++) 
		{
			if (counter == 10) 
			{
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			}
			for (int stars = 0; stars < array[counter]; stars++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
