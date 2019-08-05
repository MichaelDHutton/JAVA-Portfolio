/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
import java.util.Scanner;

public class LetterGrade {

	/**
	 * LetterGrade uses the switch statement to 
	 * count letter grades.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;// sum of grades
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
		Scanner input = new Scanner (System.in);
		
		System.out.printf("%s%n%s%n    %s%n   %s%n",
				"Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/MacOS type <Ctrl> d the press Enter",
				"Om Windows type <Ctrl> z then press Enter");
		while (input.hasNext()) 
		{
		int grade = (input.nextInt());//reads grade	
		total += grade;
		++gradeCounter;
		
		switch (grade /10) 
		{
		case 9:
		case 10:
			++aCount;
			break;
		case 8:
			++bCount;
			break;
		case 7:
			++cCount;
			break;
		case 6:
			++dCount;
			break;
		default:
			++fCount;
			break;
		}
	}
		System.out.printf("%nGrade Report%n");
		
		if (gradeCounter !=0) 
		{
			double average = (double) total / gradeCounter;
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					"Number of students who received each grade: ", 
					"A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount, "F: ", fCount);
		}
		else 
		{
			System.out.println("No grades were entered");
		}
	}
}
