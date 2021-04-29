package week5;

public class App {
//9. Create a class named App that has a main method.

//10. In this class instantiate an instance of each of your logger classes 
// that implement the Logger interface.

//11. Test both methods on both instances, passing in Strings of your choice.
	
	public static void main(String[] args) {
		Logger aLogger = new AsteriskLogger(); 
		Logger sLogger = new SpacedLogger(); 
		
		String abc = "Led Zeppelin";
		String def = "Black Sabbath";
		String xyz = "Prince";
		String zyx = "Queen";
		
		aLogger.log(abc);
		aLogger.error(def);
		
		sLogger.log(xyz);
		sLogger.error(zyx);
	}

}
