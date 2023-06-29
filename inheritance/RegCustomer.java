package oop.inheritance;

public class RegCustomer extends Customer{
	// data member
	int reg_id;
	
	// constructor
	public RegCustomer() {
		super();
		reg_id = 0;
	}
	public RegCustomer(String name, String id, int reg_id) {
		super.id = id;
		super.name = name;
		this.reg_id = reg_id;
	}
	
	// methods & override 
	public double giveDiscount(double price) {
		double d = (price*0.05);
		return price - d;
	}
	
	public String toString() {
		return reg_id + super.toString();
	}
	
	 
}

