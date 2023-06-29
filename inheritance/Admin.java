package oop.inheritance;

public class Admin extends Emp {
		// data members
		double bonus;
		
		// constructor
		public Admin() {
			bonus = 0;
		}
		public Admin(String name, int bdate,int id_emp, double salary,double bonus) {
			super(name,bdate,id_emp,salary);
			
			this.bonus = bonus;
		}
		
		
		//METHODS
		public void calSalary() {
			System.out.println("Salary of Emp having "+this.id_emp+"\t"+(this.salary+bonus));
		}
		
		@Override
		public String toString() {
			return "Admin\nBonus: "+this.bonus+ "\n"+ super.toString();
		}
		
}
