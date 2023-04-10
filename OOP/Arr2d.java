import java.util.Scanner;
public class Arr2d{
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		int [][] arr = new int[3][3];
		int []rowsum = new int[3];
		int []colsum = new int[3];
		
		// input loop
		System.out.println("Enter the vaules to be in Arrays");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				arr[i][j] = input.nextInt();
			}
		}
		// sum of rows
		for(int i=0; i<3; i++){
			int temp = 0;
			for(int j=0; j<3; j++){
				temp += arr[i][j];
			}
			rowsum[i] = temp;
		}
		// sum of cols
		for(int i=0; i<3; i++){
			int temp = 0;
			for(int j=0; j<3; j++){
				temp += arr[i][j];
			}
			colsum[i] = temp;
		}		

		// sum print
		for(int i=0; i<3; i++)
			System.out.println("The sum of row is: "+ rowsum[i]);

		for(int i=0; i<3; i++)
			System.out.println("The sum of col is: "+ colsum[i]);
	}
}


