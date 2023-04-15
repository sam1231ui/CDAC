package exception_handling;

public class PasswordTooShortException extends Exception{
	//data members
	String message;
	
	//constructor
	public PasswordTooShortException() {
		message = "Password too short need to be over 8 char !!";
	}
	
	//in-build override METHODS
	public String getMessage() {
		return message;
	}

}
