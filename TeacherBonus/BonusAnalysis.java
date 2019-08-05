/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */

import java.util.Scanner;

public class BonusAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while (studentCounter <= 10) 
		{
			System.out.print("Enter results (1= pass, 2 = fail): ");
			int result = input.nextInt();
			
			if (result == 1) 
			{
				passes += 1;
			}
			else 
			{ 
				failures += 1;
			}
			studentCounter += 1;
		}
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		if (passes > 8 ) 
		{
			System.out.println("Bonus to instructor!");
			}
		}
	}


