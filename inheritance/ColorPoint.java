package oop.inheritance;

public class ColorPoint {
	
	// data members 
	String str;
	static String []arr;
	
	// static block
	static {
		 arr = new String []{"black", "blue", "voilet"};
	}
	
	//constructor
	public ColorPoint() {
		str  = "empty";
	}
	
}

