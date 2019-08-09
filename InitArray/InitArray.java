/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class InitArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] array1 = {{32, 45, 56},{788, 46, 4654}};
			int[][] array2 = {{2, 45, 56},{46, 4654}, {89, 1, 25}};
			
			System.out.println("Values in array1 by row are");
			outputArray(array1);
			
			System.out.printf("Values in array1 by row are%n");
			outputArray(array2);
			}
		public static void outputArray(int [][] array) 
		{
		for (int row = 0; row < array.length; row++)
		{ 
		for (int column = 0; column < array[row].length; column++)
			{
				System.out.printf("%d  ", array[row][column]);
				
			}
			System.out.println();
			}
		}
	}
