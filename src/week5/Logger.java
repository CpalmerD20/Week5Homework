package week5;

public interface Logger {
//1. Create an interface named Logger.
	
//2. Add two void methods to the Logger interface, 
//	each should take a String as an argument
//	a.	Log
//	b.	Error
	
	public void log(String log);
	public void error(String error);
	
//3. Create two classes that implement the Logger interface
//	a.	AsteriskLogger
//	b.	SpacedLogger
		
}
