package oop.inheritance.interfce;

public class Circle implements Drawable{
	// data members
	int radius;
	
	//constructor
	public Circle() {
		this.radius = 0;
	}
	public Circle(int radius) {
		this.radius = radius;
		 
	}
	
	//METHODS and override
	public void drawShape() {
		System.out.println("its a Circle");
	}
	public double calArea() {
		float temp = 2*Pi;
		return temp*(radius*radius);
	}

}
