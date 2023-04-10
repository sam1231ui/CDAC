package oop.inheritance;

public class SalesManager extends Emp {
		// data members
		int target;
		double incentive;
		
		// constructor
		public SalesManager() {
			target = 0;
			incentive = 0;
		}
		public SalesManager(String name, int bdate,int id_emp, double salary, int target, double incentive) {
			super(name,bdate,id_emp,salary);
			
			this.target = target;
			this.incentive = incentive;
		}
		public void calSalary() {
			System.out.println("Salary of Emp having "+this.id_emp+"\t"+(this.salary+this.incentive));
		}
		
		@Override
		public String toString() {
			return "SalesManager\nTarget: "+this.target+ "\nIncentive: "+incentive+ "\n"+ super.toString();
		}
		
}
