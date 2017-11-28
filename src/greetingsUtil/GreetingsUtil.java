package greetingsUtil;

/*
 * Simple util class meant to track if you are currently coming or going
 */
public class GreetingsUtil {

	String currentState = "coming";
	
	public void ChangeState() {
		if(currentState.equals("coming")){
			currentState = "going";
		}
		else {
			currentState = "coming";
		}
	}
	
	public String Hello() {
		if(currentState.equals("coming")) {
			return "You already said that";
		}
		else {
			currentState = "coming";
			return "Hi!";
		}
	}
	
	public String GoodBye() {
		if(currentState.equals("going")) {
			return "You already said that";
		}
		else {
			currentState = "going";
			return "bye";
		}
	}
}
