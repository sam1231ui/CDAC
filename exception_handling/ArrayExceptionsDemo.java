package exception_handling;
import java.util.*;

public class ArrayExceptionsDemo {

	public static void main(String[] args) {
		
	try {
		// cmd input
		int n = Integer.parseInt(args[0]);
		
		// user input
		Scanner input = new Scanner(System.in);
		int [] arr = new int[n];
		System.out.println("Array elements: "+ args[0]);
	
		for(int i=0; i<n; i++) {
			int temp = input.nextInt();
			arr[i] = temp;
		}
		
		//index input 
		System.out.println("Enter index to display !!");
		int index = input.nextInt();
		System.out.println(arr[index]);
		
		input.close();

		}
	// catch conditions
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Enter valid index");
		}
	catch (Exception e) {
		e.printStackTrace();
		}
	
	}

}
