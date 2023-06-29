package oop.inheritance;

public class Customer {
	// data members
	String name;
	String id;
	
	// constructor
	public Customer() {
		name = "empty";
		id = "empty";
	}
	public Customer(String name, String id) {
		this.id = id;
		this.name = name;
		
	}
	
	// methods
	public double giveDiscount(double price) {
		return price;
	}
	public String toString() {
		return "[ Name: "+name+","+"ID: "+id+"]";
	}
	
}
