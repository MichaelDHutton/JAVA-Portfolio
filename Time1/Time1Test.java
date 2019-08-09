/**
 * 
 */

/**
 * @author Michael Hutton
 *08/09/19
 */
public class Time1Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time1 time = new Time1();
		
		displayTime("After time object is created", time);
		System.out.println();
		
		time.setTime(13,  27,  6);
		displayTime("After calling setTime", time);
		System.out.println();
		
		try 
		{
			time.setTime(99, 99, 99);
		}
		catch (IllegalArgumentException e) 
		{
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		displayTime("After calling setTime with invalid Values", time);
		}
		
		private static void displayTime(String header, Time1 t) 
		{
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());	
		}
}
