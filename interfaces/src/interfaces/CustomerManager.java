package interfaces;

public class CustomerManager {
	
	private Logger logger;
	
	private Logger[] loggers;
	
	
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}


	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi :" + customer.getFirstName());
		if (this.logger!=null) {
			Utils.runlogger(logger, customer.getFirstName());
		}
		
		else if (this.loggers!=null) {
			Utils.runloggers(loggers, customer.getFirstName());
			}
	}
		
	
public void delete(Customer customer) {
	System.out.println("Müþteri Silindi :" + customer.getFirstName());
	if (this.logger!=null) {
		Utils.runlogger(logger, customer.getFirstName());
	}
	
	else if (this.loggers!=null) {
		Utils.runloggers(loggers, customer.getFirstName());
		}
	}
}

