/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class ContinueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int count = 1; count <= 10; count++) 
		{
			if (count == 5) 
			{
				continue;
			}
			System.out.printf("%d ", count);
			}
		System.out.printf("%nUsed continue to skip printing 5%n");
	}
}
