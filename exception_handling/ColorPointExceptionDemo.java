package exception_handling;

public class ColorPointExceptionDemo {
	public static void main(String []args) {
	// try block
	try {
		ColorPoint c = new ColorPoint(1,2,"green");
		
		System.out.println(c.toString());
		
		c.checkColor("n");
		
		}
	// catch conditions
	catch(InvalidInputExeption e) {
			System.out.print(e.getMessage());
		}
	}
}
