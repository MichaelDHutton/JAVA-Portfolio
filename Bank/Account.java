
public class Account 
{
	private String name; //instance variable name
	private double balance; // instance variable balance 
	
	//constructor initializes name with parameter name
	public Account(String name, double balance)// constructor name is class name 
	{
		this.name = name;
		
		// validate that the balance is greater than 0.0; if it's not,
		//instance variable balance keeps its default initial variable balance
		if (balance > 0.0) 
		{
			this.balance = balance;
			}
	}
	
	public void deposit(double depositAmount) 
	{
		if (depositAmount > 0.0) 
		{
			balance = balance + depositAmount;
			}
		}
public double getBalance() 
{
return balance;	
}
	
	
	//method to set the name 
	public void setName(String name) 
	{
				
		this.name = name;
	}
	
	//method to retrieve the name
	public String getName() 
	{
		return name;
	}

}
