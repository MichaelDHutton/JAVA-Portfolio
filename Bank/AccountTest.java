import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Account myAccount= new Account(null);
		
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());
		
		System.out.println("Please enter the name: ");
		String theName = input.nextLine();
		myAccount.setName(theName);
		
		System.out.println();
		
		System.out.printf("Name in object MyAccount is : %n%s%n", myAccount.getName());
	}

}
