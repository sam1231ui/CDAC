package oop.inheritance;

public abstract class Emp extends Person {
		// data members
		int id_emp;
		protected double salary;
		
		// constructor
		public Emp() {
			super();
			id_emp = 0;
			salary = 0;
		}
		public Emp(String name, int bdate,int id_emp, double salary) {
			super(name,bdate);
			this.id_emp = id_emp;
			this.salary = salary;
		}
		
		// abstract methods
		public abstract void calSalary();
		
		
		//methods
		public void display() {
			super.display();
			System.out.println("Id: "+id_emp+" salary: "+salary);
		}

		@Override
		public String toString() {
			return "Emp [id_emp=" + id_emp + ", salary=" + salary + "]\n"+super.toString();
		}
		 	
}
