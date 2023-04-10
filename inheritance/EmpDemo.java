package oop.inheritance;

public class EmpDemo {
	
	public static void main(String []args) {
		
//		Emp e = new Emp("sam",1999,31,10000000);
//		
//		Person p = new Emp();
//		
//		e.display();
//		p.display();
		
		Emp e1 = new SalesManager("swo",1942,1,1000,50,2000);
		Emp e2 = new Programmer("ana",1945,2,2000,6,245);
		Emp e3 = new Admin("sam",1999,3,3000,300);
		
		e1.calSalary();
		e2.calSalary();
		e3.calSalary();
		
		System.out.println(e1.salary);
		
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
		
		
		
		
	}

}
