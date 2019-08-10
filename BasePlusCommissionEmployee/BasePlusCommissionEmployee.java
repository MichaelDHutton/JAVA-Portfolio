/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class BasePlusCommissionEmployee 
{	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
		
	
	public BasePlusCommissionEmployee(String firstName, 
			String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate, double baseSalary) 
	{
		if (grossSales < 0.0) 
		{
			throw new IllegalArgumentException("Gross sales must"
					+ " be greater or equail to zero");
		}
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) 
		{
			throw new IllegalArgumentException("Commision rate must be "
					+ "greater than 0.0 and less than 1.0");
		}
		if (baseSalary < 0.0) 
		{
			throw new IllegalArgumentException("Base salary must be greater or equail to 0.0");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public String getSocialSecurityNumber() 
	{
		return socialSecurityNumber;
	}
	
	public void setGrossSales(double grossSales) 
	{
		if (grossSales < 0.0) 
		{
			throw new IllegalArgumentException("Gross sales must be greater than "
					+ "or equail to 0.0");			
		}
		this.grossSales = grossSales;
	}
	 public double getGrossSales() 
	 {
		 return grossSales;
	 }
	
	 public void setCommissionRate(double commissionRate) 
		{
			if (commissionRate <= 0.0 || commissionRate >= 1.0) 
			{
				throw new IllegalArgumentException("Commission rate must be greater"
						+ "than 0.0 and less that 1.0");			
			}
			this.commissionRate = commissionRate;
		}
		 public double getCommisssionRate() 
		 {
			 return commissionRate;
		 }
		 
		 public void setBaseSalary(double baseSalary) 
		 {
			 if (baseSalary < 0.0) 
			 {
				 throw new IllegalArgumentException("Base salary must be greater" 
			 + "than or equail to 0.0 ");
			 }
			 this.baseSalary = baseSalary;
		 }
		 
		 public double getBaseSalary() 
		 {
			 return baseSalary;
		 }	
	public double earnings() 
	{
		return baseSalary + commissionRate * grossSales;
	}
	
	@Override  //overrides the superclass method
	 public String toString() 
	{ 
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
				"Base-Salaried Commission Employee", firstName , lastName, 
				"Social Security Number",
				socialSecurityNumber,
				"Gross Sales", grossSales, "Commission Rate", commissionRate, "Base Salary", baseSalary);
	}
}
