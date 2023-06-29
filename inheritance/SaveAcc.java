package oop.inheritance;

public class SaveAcc extends Account{
	
	public SaveAcc() {
		super();
	}
	public SaveAcc(int accno, String name, double price) {
		super(accno, name, price);
	}
	
	
	//METHODS
	public void withdraw(double amt) {
		double d = this.balance;
		
		if(d > 2000) {
			d = d- amt;
			System.out.println("The withdraw amount = "+amt+"\n New balance: "+d);
		}else {
			System.out.println("Your balance is lower than 2000");
		}
	}
}
