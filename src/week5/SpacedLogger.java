package week5;

public class SpacedLogger implements Logger {
//6. The SpacedLogger should add spaces between each character of the String 
//   argument passed into its methods.
	
//7. If the log method received “Hello” as an argument, 
//   it should print H e l l o
	
	@Override
	public void log(String log) {
		StringBuilder spaces = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			spaces.append(log.charAt(i) + " ");
		}
		System.out.println(spaces);
		
	}	
//8. The error method should do the same, but with “ERROR:” preceding the 
//   spaced out input (i.e. ERROR: H e l l o)

	@Override
	public void error(String error) {
		StringBuilder spaces = new StringBuilder();
		String space ="ERROR: ";
		for (int i = 0; i < error.length(); i++) {
			spaces.append(error.charAt(i) + " ");
		}
		System.out.println(space + spaces);
		
	}	
		
}
