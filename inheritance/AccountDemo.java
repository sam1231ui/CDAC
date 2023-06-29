package oop.inheritance;

public class AccountDemo {
	public static void main() {
		
		Account a1 = new SaveAcc(1,"sam",10000);
		
		a1.withdraw(2000);
	}

}
