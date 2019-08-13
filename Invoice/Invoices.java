
public class Invoices implements Payable
	{
		private final String partNumber;
		private final String partDescription;
		private final int quantity;
		private final double pricePerItem;
		
	public Invoices(String partNumber, String partDescription, int quantity, double pricePerItem) 
	{
		if (quantity < 0 ) 
		{
			throw new IllegalArgumentException("Quantity can not be negitive or zero");
		}
		 if (pricePerItem < 0.0) 
		 {
			 throw new IllegalArgumentException("Price can not be negitive or zero");
		 }
		 
		 this.quantity = quantity;
		 this.partNumber = partNumber;
		 this.partDescription = partDescription;
		 this.pricePerItem = pricePerItem;		
	}

	public String getPartNumber() 
	{
		return partNumber;
	}
	
	public String getPartDescription()
	{
		return partDescription;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public double getPricePerItem() 
	{
		return pricePerItem;
	}
	
	@Override
	public String toString() 
	{
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",  "Invoice", "Part Number", getPartNumber(), getPartDescription(), "Quantity", getQuantity(), "Price per Item", getPricePerItem());
	}
	
	@Override 	
	public double getPaymentAmount() 
	{
		return getQuantity() * getPricePerItem();
	}
}

