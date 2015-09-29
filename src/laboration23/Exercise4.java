package laboration23;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.Icon;

/**
 * Klassen ritar slumpade linjer i ett fönster. Antalet linjer bestäms vid instansiering. 
 * @author David
 *
 */
public class Exercise4 implements Icon {
	// Instansvariabler som används i programmet
	int lines;
	Random rand = new Random();
	
	public Exercise4 (int lines) {
		this.lines = lines;
	}
	
	public int randomNumber(int low, int high) {
		return rand.nextInt( (high-low) ) + low +1 ;
	}
	
	public int getLines() {
		return this.lines;
	}
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g;
		g.setColor(Color.RED);
		g.fillRect(0, 0, 900, 600);
		for (int i = 0; i < lines; i++) {
			
			int x1 = randomNumber(20, (getIconWidth()- 20));
			int x2 = randomNumber(20, (getIconWidth() - 20));
			int y1 = randomNumber(20, (getIconHeight() - 20));
			int y2 = randomNumber(20, (getIconHeight() - 20));
			int red = randomNumber(0,255);
			int green = randomNumber(0,255);
			int blue = randomNumber(0,255);
			int width = randomNumber(5,20);
			g2.setPaint( new Color( red, green, blue ) ); // ritfärg 
			g2.setStroke( new BasicStroke( width ) ); // bredd 
			g2.draw( new Line2D.Double(x1, y1, x2, y2) ); // från - till
		}
	}

	public int getIconWidth() {
		return 900; 
	}

	public int getIconHeight() {
		return 600; 
	}

	public static void main(String[] args) {
		IconWindow.showIcon(new Exercise4(20));	
	}
}