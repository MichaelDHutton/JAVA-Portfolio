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
			int[][] gradesArray = {{87, 98, 52},
								   {89, 65, 2},
								   {78, 87, 45},
								   {66, 98, 58},
								   {56, 98, 100},
								   {89, 98, 78},
								   {89, 69, 89},
								   {69, 89, 98},
								   {97, 99, 86},
								   {100, 98, 78}};
			
			
			GradeBook myGradeBook = new GradeBook(
					"Java Programming 101", gradesArray);
			System.out.printf("Welcome to the grade book for%n%s%n%n", 
					myGradeBook.getCourseName());
			myGradeBook.processGrades();
	}

}
