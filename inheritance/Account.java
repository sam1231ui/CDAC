package oop.inheritance;

public abstract class Account {
	
	// data members
	int accno;
	String name;
	protected double balance;
	
	//constructor
	public Account() {
		this.accno = 0;
		this.balance = 0;
		this.name = "empty";
	}
	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.balance = balance;
		this.name = name;
	}
	
	// METHODS
	public abstract void withdraw(double amt);
	
}
