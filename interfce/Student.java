package oop.inheritance.interfce;

public class Student {
	private int roll;
	private double merit;
	private String name;
	
	public Student() {
		roll =0;
		merit = 0;
		name = "empty";
	}
	public Student(int roll, double merit, String name) {
		this.roll = roll;
		this.merit = merit;
		this.name = name;
	}
	
	// getters methods
	public int getRoll() {
		return this.roll;
	}
	public double getMerit() {
		return merit;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", merit=" + merit + ", name=" + name + "]";
	}
	
	
	
	 
	

}
