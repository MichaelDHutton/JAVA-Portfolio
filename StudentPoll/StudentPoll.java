/**
 * 
 */

/**
 * @author Michael Hutton
 *08/08/2019
 */
public class StudentPoll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] responses = {1, 2, 5, 1, 2, 4, 3, 5, 2, 5, 2, 5, 4, 2, 2, 4, 3, 5, 24};// array counter 1-5 ignoring 0
		int[] frequency = new int[6];
		// for each answer, select responses element and use the value
		// as frequency index to determine elements to increment 
		for (int answer = 0; answer < responses.length; answer++) {
		try {
			++frequency[responses[answer]];
			}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
			System.out.printf("    responses[%d] = %d%n%n", 
					answer, responses[answer]);
		}
	}

	System.out.printf("%s%10s%n", "Rating", "Frequency");
	
	for (int rating =1; rating < frequency.length; rating++) 
		{
			System.out.printf("%6d%10d%n", rating, frequency[rating]);	
		}
	}
}