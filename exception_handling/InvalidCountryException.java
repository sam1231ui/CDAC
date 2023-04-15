package exception_handling;

public class InvalidCountryException extends Exception{
	// data member
	String message;
	
	// constructor
	public InvalidCountryException() {
		message = "User Outside India";
	}
	
	// in-build override METHODS
	public String getMessage() {
		return message;
	}
}
