package greetingsUtil;

public class GreetingsUtil {

	 String currentState = "hi";
	
	public static String HelloWorld(String input) {
		if(input.equals("Hello")) {
			return "World";
		}
		else {
			return "I don't understand";
		}
	}
	
	public void UpdateState() {
		if(currentState.equals("hi")){
			currentState = "bye";
		}
		else {
			currentState = "hi";
		}
	}
	
	public void SayGoodBye() {
		currentState = "bye";
	}
}
