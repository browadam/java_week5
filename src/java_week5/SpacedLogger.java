package java_week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// Add a space between each character of the string passed to it
		StringBuilder logging = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			logging.append(log.charAt(i)).append(" ");
		}
		System.out.println(logging.toString());
		
	}

	@Override
	public void error(String error) {
		// Indicate there is an error by placing ERROR: in front of the string passed
		StringBuilder errorString = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			errorString.append(error.charAt(i)).append(" ");	
		}
		System.out.println("ERROR: " + errorString.toString());
		
	}

}
