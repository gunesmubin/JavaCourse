package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1,"M�bin","G�ne�");
		Customer customer2 = new Customer(2,"Ali","G�ne�");
		
		Logger[]loggers= {new DatabaseLogger(),new FileLogger()};
		
		CustomerManager customerManager=new CustomerManager(loggers);
		customerManager.add(customer);
		
		CustomerManager customerManager2=new CustomerManager(new DatabaseLogger());
		customerManager2.add(customer2);

	}

}
