public class CustomerDemo{
	public static void main(String []args){
		
		Address a1 = new Address();
		Address a2 = new Address("baner", "Pune", "411043");
		
		Customer c1 = new Customer("sam@gmail.com", a2);
		Customer c2 = new Customer();
		
		//a1.display();
		//a2.display();
		c1.display();
		c2.display();

	}
}