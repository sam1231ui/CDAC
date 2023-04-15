package exception_handling;

public class Point {
	//data member
	int x;
	int y;
	
	//constructor
	public Point() {
		x = 0;
		y =0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
