package laboration13;

public class CircleRadius {

	public void action() {
		
		Point p1, p2;
		p1 = new Point(10, 12);
		
		Circle c1 = new Circle(3.5, p1);
		System.out.println("p1 = " + p1.toString());
		System.out.println("c1 = " + c1.toString());
		System.out.println("------------------------");
		p2 = c1.getPosition();
		p2.setX(333); // x-värdet i p2 ändras till 333 
		System.out.println("p1 = " + p1.toString() ); 
		System.out.println("c1 = " + c1.toString() ); 
		System.out.println("p2 = " + p2.toString() );

	}

	public static void main(String[] args) {
		CircleRadius prog = new CircleRadius();
		prog.action();
	}

}
