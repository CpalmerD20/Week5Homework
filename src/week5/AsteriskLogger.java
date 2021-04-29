package week5;

public class AsteriskLogger implements Logger {

//4. The log method on the AsteriskLogger should print out the String it  
//	receives between 3 asterisks on either side of the String (e.g. if the 
//	String passed in is “Hello”, then it should print ***Hello*** to console.
	
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}
	
//5. The error method on the AsteriskLogger should print the String it receives 
//  inside a box of asterisks, with the String preceded by the word “ERROR:”. 
//  For example, if “Hello” is the argument, the following should be printed:
//	****************
//	***Error: Hello***
//	****************	
	
	@Override
	public void error(String error) {
		StringBuilder border = new StringBuilder();
		String misc = "Error: ";
		for (int i = 0; i < error.length() + misc.length(); i++) {
			border.append("*");
		}
		System.out.println("***" + border + "***");
		System.out.println("***" + misc + error + "***");
		System.out.println("***" + border + "***");
	}

}
