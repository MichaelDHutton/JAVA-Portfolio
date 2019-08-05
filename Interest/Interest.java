/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 1000.00; // initial amount before interest 
		 double rate = 0.05; // interest rate
		
		 
		 System.out.printf("%s%20s%n", " Year", "Amount on depostit");
		 	
		 for (int year = 1; year <= 10; ++year) 
		 {
			 //calculate new amount on deposit for specified year
		double amount = principal * Math.pow(1.0 + rate,  year);
		 System.out.printf("%4d%,20.2f%n", year , amount);
		 }
	}

}
