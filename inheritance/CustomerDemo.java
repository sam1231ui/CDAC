package oop.inheritance;

public class CustomerDemo {
	public static void main(String []args) {
		
		Customer c1 = new Customer();
		RegCustomer c2 = new RegCustomer();
		
		System.out.println(c1.giveDiscount(10000));
		System.out.println(c2.giveDiscount(10000));
	}
}
