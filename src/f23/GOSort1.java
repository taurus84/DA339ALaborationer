package f23; 

import java.util.Arrays;

public class GOSort1 {
	public static void main(String[] args) {
		GeometricObject[] gos = { new Rect(10, 2), new Rect(20, 3),
				                  new Circle(2, 200, 300), new Circle(3, 250, 250) };
		for (GeometricObject go : gos) {
			System.out.println(go + ", area=" + go.area());
		}		
		Arrays.sort(gos);
		System.out.println("-------------------------------");
		for (GeometricObject go : gos) {
			System.out.println(go + ", area=" + go.area());
		}		
	}
}
