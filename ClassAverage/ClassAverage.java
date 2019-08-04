/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */

import java.util.Scanner;


public class ClassAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			
			int total = 0;
			int gradeCounter = 1;
			
			while (gradeCounter  <= 10) 
			{
				System.out.print("Enter grade: ");
				int grade = input.nextInt();
				total = total + grade;
				gradeCounter = gradeCounter + 1;
			}
			
			int average = total / 10;
			
			System.out.printf("%nTotal of all 10 grades is %d%n", total);
			System.out.printf("%nClass average is %d%n", average);
	}

}
