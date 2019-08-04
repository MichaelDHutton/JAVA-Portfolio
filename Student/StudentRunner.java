
public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student account1 = new Student ("Jane Green", 93.4);
		Student account2 = new Student ("Joe Blue", 73.4);
		
		System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());
	
	}
}
