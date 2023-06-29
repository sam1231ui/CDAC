package oop.inheritance.interfce;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringCalls s1 = new StringCalls("SAM");
		StringCalls s2 = new StringCalls("sam");
		
		s2.toUpperCase();
		s1.toLowerrCase();
		
		
		
		System.out.println(s2.append(s1, s2));
	}


}
