package inheritance;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.id=1;
		corporateCustomer.customerNumber="123";
		corporateCustomer.companyNumber="1905";
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.id=2;
		individualCustomer.customerNumber="123456";
		individualCustomer.firstName="Mübin";
		
		Customer[] customers= {corporateCustomer,individualCustomer};
		customerManager.addMultiple(customers);

	}

}
