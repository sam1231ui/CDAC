package exception_handling;

public class InvalidInputExeption extends Exception{
	//data members
	String message;
	
	//constructor
	public InvalidInputExeption() {
		message = "Invald input";
	}
	
	// in-build override METHODS
	public String getMessage() {
		return message;
	}
}
