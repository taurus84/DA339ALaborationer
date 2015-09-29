package p2;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;

public class Race {

	private PaintWindow window;
	private Car car1;
	private Car car2;
	
	public Race (PaintWindow window, Car car1, Car car2){
		this.window = window;
		this.car1 = car1;
		this.car2 = car2;
		
	}
	
		
	public void action() {
		int x1 = 450;
		int y1 = 210;
		int x2 = 450;
		int y2 = 270;
		Random rand = new Random();
		
		int finishLineX = 100;
		
		window.fillRect(10, 200, 550, 50, Color.YELLOW);		//rektangel. Börjar på x=10, y=200. 550 bred och 50 hög
		window.fillRect(10, 260, 550, 50, Color.GRAY);
		window.fillRect(finishLineX, 170, 5, 170, Color.BLACK);			//finishLine. Börjar på x=100 y=170. 5 bred. 170 hög
//		window.setBackground(Color.BLACK);
//		ImageIcon background = new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p2/sky.jpg");
//		window.setBackground(background);
		ImageIcon blueCar = car1.getImage();
		window.showImage(blueCar, x1, y1);
		ImageIcon redCar = car2.getImage();
		window.showImage(redCar, x2, y2);
				
		while (x1 > finishLineX && x2 > finishLineX){
		
			car1.moveTo(x1, y1);
			car2.moveTo(x2, y2);
			PaintWindow.pause(100);
			window.showImage(blueCar, x1, y1);
			window.showImage(redCar, x2, y2);
	
			
			x1 -= rand.nextInt(15);
			x2 -= rand.nextInt(15);
		
		}
		window.showImage(blueCar, x1, y1);
		window.showImage(redCar, x2, y2);
		
		
		
		
	}
}
