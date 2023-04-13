package oop.inheritance.interfce;

public class DrawDemo {
	public static void main(String []args) {
		Drawable d1 = new Rectangle(12,10);
		Drawable d2 = new Circle(2);
		
		System.out.println(d1.calArea());
		System.out.println(d2.calArea());
	}

}
