package streams_and_files_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentUserInputDemo {

	public static void main(String[] args) throws Exception{

		// buffer reader object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		// user input
		int roll;
		String name;
		double marks;
		
		System.out.println("Enter roll, name and marks one by one ");
		
		roll = Integer.parseInt(br.readLine());
		name = br.readLine();
		marks = Double.parseDouble(br.readLine());
		
		// object of Student with above user input
		Student s1 = new Student(roll,name,marks);
		
		System.out.println(s1.getGrade());
		
		br.close();
		
	}

}
