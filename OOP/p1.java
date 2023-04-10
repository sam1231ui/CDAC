
public class p1{
	public static void main(String []args){
		
		int [] arr = {1,2,3,4,5};
		
		int max = arr[0];
		int min = arr[0];
		double avg = 0;
		
		for(int i=0; i<arr.length; i++){

			if(arr[i] >= max)
				max = arr[i];

			if(arr[i] <= min)
				min = arr[i];

			avg += arr[i];
		}
		avg = avg/5;
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		System.out.println("Avg = " + avg);
	}
}
			
			