package week5assignment;

public class App {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Logger wordSpace = new SpacedLogger();
		Logger wordAsterisk = new AsteriskLogger();
		
		wordSpace.log("Hello");
		wordSpace.error("Hello");
		
		//wordAsterisk.log("Hello");
		//wordAsterisk.error("Hello");
		
	}

}
