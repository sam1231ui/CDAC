package exception_handling;

public class CapitalException {
	//data member
	String message;
	
	// constructor
	public CapitalException() {
		message = "Pls enter start letter as Capital ";
	}
	
	public String getMessage() {
		return message;
	}
	
}
