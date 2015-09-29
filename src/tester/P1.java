package tester;

import java.util.Random;

import javax.swing.ImageIcon;

import p1.PaintWindow;

public class P1 {
	public void exercise1e() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p1/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -5;
		int dy = 1;
		int x = 250;
		int y = rand.nextInt(height-100);  // Bildens höjd är 100
		
		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;
			y += dy;
			if(x<0) {
				dx = -dx;
			}
			if(x>(width-100)) {
				dx = -dx;
			}
		}
	}
	
	public static void main(String[] args) {
		P1 prog = new P1();
		prog.exercise1e();
		
	}
}
	
