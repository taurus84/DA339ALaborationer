package laboration8;
import javax.swing.ImageIcon;
import laboration7.PaintWindow;
/**
 * Flytta bild i ett PaintWindow-fönster
 * @author tsroax
 */
public class Exercise8e {
    
    public void leftRight() {
    	PaintWindow window = new PaintWindow();
        ImageIcon man = new ImageIcon("M:/Bilder/Gubbe.jpg");
        for(int x=0; x<=500; x+=5) {
            window.showImage(man, x, 150);
            PaintWindow.pause(50);
        }
    }
    
    public void rightLeft() {
    }
        
    public void upDown() {
    }
        
    public void downUp() {
    }
    
    public static void main(String[] args) {
        Exercise8e e8e = new Exercise8e();
        e8e.leftRight();
    }
}
