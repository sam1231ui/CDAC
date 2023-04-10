package oop.inheritance;

public class Person {
	// data member 
	String name;
	int bdate;
	
	// methods
	public Person() {
		name = "";
		bdate = 0;
	}
	public Person(String name, int id) {
		this.name = name;
		this.bdate = id;
	}
	
	// methods & over ride
	public void display() {
			System.out.println("Name: "+name);
			System.out.println("Bdate: "+bdate);
	}
	
	public String toString() {
		return "Person [name=" + name + ", bdate=" + bdate + "]";
	}
}
