package inheritance2;

public class CustomerManager {
	
public void add(Logger logger) {
	System.out.println("M��teri Eklendi - Log �al��t�");	
	logger.log();
	}

public void add(Logger[] loggers) {
	System.out.println("M��teri Eklendi - Multi Log �al��t�");	
	for (Logger logger : loggers) {
		logger.log();
	}
	}
}
 