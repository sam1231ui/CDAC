package oop.inheritance.interfce;

public class StringCalls {
	//data members
	String str; 
	
	//constructors
	public StringCalls() {
		System.out.print("String is empty");
		str = "";
	}
	public StringCalls(String str) {
		this.str = str;
	}
	
	//METHODS overrides
	public void reverse() {
		String temp = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			temp += str.charAt(i);
		}
		System.out.print(temp);
	}
	public void toUpperCase() {
		
		String temp = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				temp += (char)((str.codePointAt(i) - 32));
			}
		}
		System.out.println(temp);
	}
	public void toLowerrCase() {
		
		String temp = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				temp += (char)((str.codePointAt(i) + 32));
			}
		}
		System.out.println(temp);
	}
	public int length() {
		return this.length();
	}
	public String append(StringCalls s1, StringCalls s2) {
		String temp1 = s1.str;
		String temp2 = s2.str;
		
		return temp1+temp2;
	}
	
}
