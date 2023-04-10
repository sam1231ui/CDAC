package oop.inheritance;

public class Doctor extends Person{
	// data members
	String degree;
	int reg_no;
	double salary;
	
	// constructors
	public Doctor() {
		this.degree = "empty";
		this.salary = 0;
		this.reg_no = 0;
	}
	public Doctor(String degree, int reg_no, double salary) {
		this.degree = degree;
		this.salary = salary;
		this.reg_no = reg_no;
	}
	
	// methods & over ride 
	public void display() {
		super.display();
		System.out.println("Degree: "+degree+"Salary: "+salary+"Numer: "+reg_no);
	}
	public String toString() {
		super.toString();
		return "Doctor [degree=" + degree + ", reg_no=" + reg_no + ", salary=" + salary + "]";
	}
	
	
}
