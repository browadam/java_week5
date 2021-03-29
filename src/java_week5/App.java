package java_week5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.error("this is an error");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		logger2.error("Help");
		
		

		
	}

}
