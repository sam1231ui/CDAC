public class PersonDemo{
	public static void main(String []args){
		
		Person p1 = new Person();
		Person p2 = new Person("sam", 31, 12, 1999);
		
		p1.display();
		p2.display();
	}
}