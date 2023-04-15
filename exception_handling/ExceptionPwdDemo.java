package exception_handling;
import java.util.*;

public class ExceptionPwdDemo {
	public static void main(String []agrs) {
	// try block
	try {
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String\n");
		String str = sc.next();
		sc.close();
		
		// exceptions throw
		if(str.length() > 12)
			throw new PasswordTooLongException();
		else
			throw new PasswordTooShortException();
		
		}
	// catch conditions
	catch(PasswordTooLongException e) {
		System.out.println(e.getMessage());
		}
	catch(PasswordTooShortException e) {
		System.out.println(e.getMessage());
		}
		
	}

}
