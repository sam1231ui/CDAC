package oop.inheritance.interfce;


public class StudentDemo {

	public static void main(String[] args) {
		
		Student [] arr = new Student[4];
		
		 arr[0] = new Student(1,90,"sam");
		 arr[1] = new Student(2,92,"swo");
		 arr[2] = new Student(3,98,"himya");
		 arr[3] = new Student(4,80,"rushi");
		 
		 Comparer c = new RollCompare();
		 
		 for(int i=0; i<4; i++) {
			 
			 for(int j=0; j <4; j++) {
				 
				 if(c.compare(arr[i], arr[j]) < 0) {
					 Student temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		 for(int i=0; i<4; i++) {
			 System.out.println(arr[i]);
		 }
		 
	}

}
