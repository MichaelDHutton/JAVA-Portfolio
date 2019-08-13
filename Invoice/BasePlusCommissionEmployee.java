/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{	
	private double baseSalary;
	
		
	
	public BasePlusCommissionEmployee(String firstName, 
			String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate, double baseSalary) 
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
	
	
		if (baseSalary < 0.0) 
		{
			throw new IllegalArgumentException("Base salary must be greater or equal to 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
		 public void setBaseSalary(double baseSalary) 
		 {
			 if (baseSalary < 0.0) 
			 {
				 throw new IllegalArgumentException("Base salary must be greater" 
			 + "than or equal to 0.0 ");
			 }
			 this.baseSalary = baseSalary;
		 }
		 
		 public double getBaseSalary() 
		 {
			 return baseSalary;
		 }	
	
	@Override  //overrides the superclass method
	public double earnings() 
	{
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	 
	public String toString() 
	{ 
		return String.format
				("%s %s; %s: $%,.2f", "Base Salaried", super.toString(), "Base Salary", getBaseSalary());
	}
}
