package oop.inheritance.interfce;

public class Rectangle implements Drawable{
	// data members
	int length;
	int breadth;
	
	//constructor
	public Rectangle() {
		this.breadth = 0;
		this.length = 0;
	}
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	//METHODS and override
	public void drawShape() {
		System.out.println("its a Rectangle");
	}
	public double calArea() {
		return length*breadth;
	}

}
