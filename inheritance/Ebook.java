package oop.inheritance;

public class Ebook extends Book{
	//data members
	double discount;
	
	//constructors
	public Ebook() {
		super();
		this.discount = 0;
	}
	public Ebook(int bookid, String name, double price) {
		super(bookid,name, price);
		
		if(price <= 500) {
			this.discount = price*0.02;
			
		}else if(price <= 1000) {
			this.discount = price*0.05;
			
		}else {
			this.discount = price*0.07;
		}
			
		
	}
	
	//METHODS
	public double calCost() {
		System.out.println("EBook final cost: ");
		return this.price - this.discount;
	}
	
		
		
}
