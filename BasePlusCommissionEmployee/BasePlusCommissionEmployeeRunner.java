/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class BasePlusCommissionEmployeeRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub, 
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "222-22-2222", 10000, .06, 300);
		
		System.out.printf("Employee information obtained using get method:%n");
		System.out.printf("%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommisssionRate());
		System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
		
		employee.setGrossSales(5000);
		employee.setCommissionRate(.1);
		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
	}
}
