package oop.inheritance.interfce;

public class NameCompare {
	
	public int compare(Object o1, Object o2) {
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		 
		return ((s1.getName()).compareTo(s2.getName()));
	}
}
