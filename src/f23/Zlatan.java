package f23; 
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;

public class Zlatan implements Icon {
    private Color brown = new Color(128,64,0);
    private Color lightGreen = new Color(164,255,164);
    private Font font = new Font("SansSerif",Font.BOLD,16);
//    private ImageIcon icon = new ImageIcon("C:/Bilder/Zlatan.gif");

    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(lightGreen);
        g.fillRect(x, y, 200, 300);
//        g.drawImage(icon.getImage(), x+120, y+20, 40, 60, null);
        g.setColor(Color.BLACK);
        g.drawOval(x+120, y+20, 40, 60);
        g.drawLine(x+140, y+80, x+140, y+200);
        g.drawLine(x+80, y+70, x+140, y+90);
        g.drawLine(x+190, y+160, x+140, y+90);
        g.drawLine(x+140, y+200, x+150, y+270);
        g.drawLine(x+140, y+200, x+80, y+250);
        g.setColor(brown);
        g.fillOval(x+40,y+150,50,50);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString("Zlatan", x+10, y+30);
    }

    public int getIconWidth() {
        return 200;
    }

    public int getIconHeight() {
        return 300;
    }

    public static void main(String[] args) {
        IconWindow.showIcon(new Zlatan());
    }
}
