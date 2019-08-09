/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class GradeBookRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] gradesArray = {87, 98, 52, 89, 65, 2, 78, 87, 45, 66};
			
			GradeBook myGradeBook = new GradeBook("Java Programming 101", gradesArray);
			System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
			myGradeBook.processGrades();
	}

}
