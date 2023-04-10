package oop.inheritance;

public class Programmer extends Emp {
		// data members
		double hrs;
		double charges;
		
		// constructor
		public Programmer() {
			hrs = 0;
			charges = 0;
		}
		public Programmer(String name, int bdate,int id_emp, double salary, double hrs, double charges) {
			super(name,bdate,id_emp,salary);
			
			this.hrs = hrs;
			this.charges = charges;
		}
		
		
		// METHODS
		public void calSalary(){
			System.out.println("Salary of Emp having "+this.id_emp+"\t"+(this.salary+(hrs*charges)));
		}
		@Override
		public String toString() {
			return "Programmer\n extraHours: "+this.hrs+ "\nCharges-per/hr: "+this.charges+ "\n"+ super.toString();
		}
		
}
