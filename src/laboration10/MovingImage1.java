package laboration10;

import javax.swing.ImageIcon;

public class MovingImage1 {
	 private ImageIcon image;
	 private int x;
	 private int y;
	 private PaintWindow window = new PaintWindow();
	 
	 public void init(ImageIcon image, int x, int y){
		 	this.image = image;
		 	this.x = x;
		 	this.y = y;
		 	show();
	 }
	 public void setLocation(int x, int y){
		 this.x = x;
		 this.y = y;
		 show();
		 
	 }
	 public void show() {
		    window.showImage(image,x,y);
	 }
	 
	 public void hide(){
		 window.hideImage(image);
	 }
	 
}
