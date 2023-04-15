package exception_handling;


public class ExceptionDemo {

	public static void main(String[] args) {
	//try block
	try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int temp = n1/n2;
			
			System.out.println(temp);
		}
	// catch conditions
	catch (ArithmeticException e) {
		System.out.println("Enter valid input pls");
	}
	catch(Exception e){
			System.out.println("Enter valid input pls");
		}
	}

}
