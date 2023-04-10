package oop.inheritance;

public class Pbook extends Book{
	//data members
	double d_charges;
	
	//constructors
	public Pbook() {
		super();
		this.d_charges = 0;
	}
	public Pbook(int bookid, String name, double price) {
		super(bookid,name, price);
		
		if(price <= 500) {
			this.d_charges = price*0.07;
			
		}else if(price <= 1000) {
			this.d_charges = price*0.05;
			
		}else {
			this.d_charges = price*0.02;
		}
			
		
	}
	
	//METHODS
	public double calCost() {
		System.out.println("PaperBook final cost: ");
		return this.price + this.d_charges;
	}
	
		
		
}
