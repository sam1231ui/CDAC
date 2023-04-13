package oop.inheritance.interfce;

public class MeritCompare implements Comparer{
	
	public int compare(Object o1, Object o2) {
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		 
		if(s1.getMerit() > s2.getMerit())
			return 1;
		
		return 0;
	}
}
