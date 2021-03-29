package java_week5;

import java.util.Date;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		//Adding date because I like to have date in logs.
		Date date = new Date();
		System.out.println(date.toString() + " : " + "***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		// Adding the lines above and below of to create box
		System.out.println("******************");
		System.out.println("***" + error + "***");
		System.out.println("******************");
		
	}

}
