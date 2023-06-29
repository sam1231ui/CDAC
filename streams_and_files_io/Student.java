package streams_and_files_io;

public class Student {
	//data members
	int roll;
	String name;
	double marks;
	
	//constructor
	public Student() {
		roll = 0;
		name = "empty";
		marks = 0;
	}
	public Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	// getters setters
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	//METHODS
	public String getGrade() {
		if(marks > 90)
			return "A";
		else if(marks > 80)
			return "B";
		else if(marks >70)
			return "C";
		else
			return "D";
		
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
