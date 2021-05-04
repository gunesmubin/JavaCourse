package inheritance;

public class CustomerManager {
	public void add(Customer customer)
	{
		System.out.println("M��teri Eklendi" + customer.customerNumber);
		
	}
	
	public void addMultiple(Customer[] customers)
	{
		for (Customer customer2 : customers) {
			System.out.println("M��teri Eklendi : " + customer2.customerNumber);
		}
		
		
	}

}
