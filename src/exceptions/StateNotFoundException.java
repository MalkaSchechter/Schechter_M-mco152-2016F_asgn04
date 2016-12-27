package exceptions;

public class StateNotFoundException extends Exception {
public StateNotFoundException(){
	super("This state is not part of our dataset.");
}
}
