package interfaces;

public class Utils {
	public static void runloggers(Logger[] loggers,String messages) {
		for (Logger logger : loggers) 
			logger.log(messages);
	}
	
	public static void runlogger(Logger logger,String messages) {
			logger.log(messages);
	}

}
