package inheritance2;

public class CustomerManager {
	
public void add(Logger logger) {
	System.out.println("Müþteri Eklendi - Log Çalýþtý");	
	logger.log();
	}

public void add(Logger[] loggers) {
	System.out.println("Müþteri Eklendi - Multi Log Çalýþtý");	
	for (Logger logger : loggers) {
		logger.log();
	}
	}
}
 