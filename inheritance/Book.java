package oop.inheritance;

public abstract class Book {
	//data members
	int bookid;
	String title;
	protected double price;
	
	// constructors
	public Book() {
		this.bookid = 0;
		this.price =0;
		this.title = "empty";
	}
	public Book(int booid, String title, double price) {
		this.bookid = booid;
		this.title = title;
		this.price = price;
	}
	
	// abstract METHODS
	public abstract double calCost();
	

}
