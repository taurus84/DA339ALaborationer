package laboration23;
import java.awt.*;
 import java.awt.geom.*;
 import javax.swing.*;
 import java.awt.image.*;

 
public class Exercise3 implements Icon {
    // Instansvariabler som används i programmet
	// Metoder som används i programmet
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// Graphics2D g2 = (Graphics2D)g; // Uppgift 4, 5 och 5 // Ritkommandon, metodanrop mm här
		g.drawLine(0, 0, 60, 60);
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 300, 250);
		g.fillRect(400, 0, 500, 250);
		g.fillRect(0, 350, 300, 250);
		g.fillRect(400, 350, 500, 250);
		g.setColor(Color.YELLOW);
		g.fillRect(0, 250, 900, 100);
		g.fillRect(300, 0, 100, 600);
	}
	
    public int getIconWidth() {
        return 900; 
    }
    public int getIconHeight() {
        return 600; 
    }
    public static void main(String[] args)  {
        IconWindow.showIcon( new Exercise3() );
    }
}