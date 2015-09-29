package laboration10;
import javax.swing.ImageIcon;

public class MovingImage1Test {
    public void action1() {
        ImageIcon image = new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p1/gubbe.jpg");
        MovingImage1 mi = new MovingImage1();
        mi.init(image,100,200);
        PaintWindow.pause(300);
        mi.setLocation(120, 220);
        PaintWindow.pause(300);
        mi.setLocation(140, 200);
        PaintWindow.pause(300);
        mi.setLocation(160, 220);
        PaintWindow.pause(300);
        mi.setLocation(180, 200);
        PaintWindow.pause(300);
        mi.setLocation(200, 220);
        PaintWindow.pause(300);
        mi.setLocation(220, 200);
        PaintWindow.pause(300);
        mi.setLocation(240, 220);
        PaintWindow.pause(1000);
        mi.hide();
        PaintWindow.pause(2000);
        mi.show();
    }

    public static void main(String[] args) {
        MovingImage1Test tmi = new MovingImage1Test();
        tmi.action1();
    }
}
