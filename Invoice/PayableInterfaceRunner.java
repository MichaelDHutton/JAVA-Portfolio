public class PayableInterfaceRunner {
	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[] 
				{
						new Invoices ("01234", "Seat", 2, 375.00),
						new Invoices ("56789", "Tire", 4, 79.95),
						new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
						new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)
				};
		
			System.out.println("Invoice and Employee procedded polymorphically:");
			
			for (Payable currentPayable : payableObjects) 
			{
				System.out.printf("%n%s %nPayment due: $%,.2f%n", currentPayable.toString(), currentPayable.getPaymentAmount());
			} 
	}
}
