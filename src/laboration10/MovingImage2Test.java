package laboration10;
import javax.swing.ImageIcon;

public class MovingImage2Test {
    public void action1() {
        PaintWindow window = new PaintWindow();
        ImageIcon image1 = new ImageIcon("M:/bilder/Gubbe.jpg");
        ImageIcon image2 = new ImageIcon("M:/bilder/BilH.gif");
        ImageIcon image3 = new ImageIcon("M:/bilder/LiggandeGubbe.jpg");
        MovingImage2 mi1 = new MovingImage2();
        MovingImage2 mi2 = new MovingImage2();
        MovingImage2 mi3 = new MovingImage2();
        mi1.init(image1,300,200,window);
        mi2.init(image2,70,240,window);

        PaintWindow.pause(2000);
        mi2.setLocation(90, 240);
        PaintWindow.pause(300);
        mi2.setLocation(110, 240);
        PaintWindow.pause(300);
        mi2.setLocation(130, 240);
        PaintWindow.pause(300);
        mi2.setLocation(150, 240);
        PaintWindow.pause(300);
        mi2.setLocation(170, 240);
        PaintWindow.pause(300);
        mi2.setLocation(190, 240);
        PaintWindow.pause(300);
        mi2.setLocation(210, 240);
        mi3.init(image3,320,170,window);
        mi1.hide();
        PaintWindow.pause(300);
        mi3.setLocation(340,150);
        PaintWindow.pause(300);
        mi3.setLocation(360,140);
        PaintWindow.pause(300);
        mi3.setLocation(380,150);
        PaintWindow.pause(300);
        mi3.setLocation(400,170);
        PaintWindow.pause(300);
        mi3.init(image3,420,200,window);
        PaintWindow.pause(300);
        mi3.init(image3,440,220,window);
    }

    public static void main(String[] args) {
        MovingImage2Test tmi = new MovingImage2Test();
        tmi.action1();
    }
}
