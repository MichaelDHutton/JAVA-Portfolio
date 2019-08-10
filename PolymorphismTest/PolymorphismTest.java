/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class PolymorphismTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, 0.6);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Jones", "333-33-3333", 5000, .04, 300);
		System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", commissionEmployee.toString());
		
		System.out.printf("%s %s:%n%n%s%n%n", "Call basePlusCommissionEmployee's toString with subclass reference ", "to subclass object", basePlusCommissionEmployee.toString());
	
		CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
		
		System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with superclass reference ", "to subclass object", commissionEmployee2.toString());
	}

}
