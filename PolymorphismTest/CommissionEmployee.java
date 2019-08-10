/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */
public class CommissionEmployee 
{	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
		
	
	public CommissionEmployee(String firstName, 
			String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate) 
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
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate =commissionRate;
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
