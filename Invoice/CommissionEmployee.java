/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class CommissionEmployee extends Employee
{	
	private double grossSales;
	private double commissionRate;
		
	
	public CommissionEmployee(String firstName, 
			String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate) 
	{
		super(firstName, lastName, socialSecurityNumber);
	
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) 
		{
			throw new IllegalArgumentException("Commission rate must be "
					+ "greater than 0.0 and less than 1.0");
		}
		
		if (grossSales < 0.0) 
		{
			throw new IllegalArgumentException("Gross sales must"
					+ " be greater or equal to zero");
		}
		
		this.grossSales = grossSales;
		this.commissionRate =commissionRate;
	}
	
	public void setGrossSales(double grossSales) 
	{
		if (grossSales < 0.0) 
		{
			throw new IllegalArgumentException("Gross sales must be greater than "
					+ "or equal to 0.0");			
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
		 public double getCommissionRate() 
		 {
			 return commissionRate;
		 }
	
	public double earnings() 
	{
		return getCommissionRate() * getGrossSales();
	}
	
	@Override  //overrides the superclass method
	 public String toString() 
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"Commission Employee", getFirstName() , getLastName(), "Social Security Number",
				getSocialSecurityNumber(),
				"Gross Sales", getGrossSales(), "Commission Rate", getCommissionRate());
	}
}
