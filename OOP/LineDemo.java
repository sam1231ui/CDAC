public class LineDemo{
	public static void main(String []args){
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(10,20);
		
		Line l1 = new Line(p1, p2);
		
		l1.display();
	}
}