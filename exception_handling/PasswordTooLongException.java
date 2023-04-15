package exception_handling;

public class PasswordTooLongException extends RuntimeException{
	//data members
	String message;
	
	//constructor
	public PasswordTooLongException() {
		message = "Password too long need to be under 12 char !!";
	}
	
	//in-build override METHODS
	public String getMessage() {
		return message;
	}

}
