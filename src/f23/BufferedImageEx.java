package f23;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

/**
 *
 * @author Rolf
 */
public class BufferedImageEx implements Icon {
    private BufferedImage bi;
    private Graphics g;
    private Color background;
    private Component c;
    
    public BufferedImageEx(int width, int height, Color background) {
        this.background = background;
        bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        g = bi.getGraphics(); // createGraphics returns Graphic2D-objekt
        g.setColor(background);
        g.fillRect(0, 0, width, height);
    }

    public void erase() {
        g.setColor(background);
        g.fillRect(0, 0, getIconWidth(), getIconHeight());
    }

    public void line(int x1, int y1, int x2, int y2, Color color) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawImage(bi, x, y, null);
    }

    public int getIconWidth() {
        return bi.getWidth();
    }

    public int getIconHeight() {
        return bi.getHeight();
    }

}
