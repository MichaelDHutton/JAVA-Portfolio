/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class Increment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 5;
		
		System.out.printf("c before postincredment: %d%n", c); //prints 5
		System.out.printf("    postincredment c: %d%n", c++); //prints 5
		System.out.printf("c after postincredment: %d%n", c); //prints 5
		
		System.out.println();//skip line
		
		c = 5;
		
		System.out.printf("c before preincredment: %d%n", c); //prints 5
		System.out.printf("    preincredment c: %d%n", ++c); //prints 5
		System.out.printf("c after preincredment: %d%n", c); //prints 5
	}

}
