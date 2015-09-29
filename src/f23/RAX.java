package f23;
import javax.swing.*;
import java.awt.*;

public class RAX implements Icon {
    private final int WIDTH = 29, HEIGHT = 19;
    private Font font1 = new Font( "Monospaced", Font.BOLD, 24 );
    private Font font2 = new Font( "Monospaced", Font.BOLD, 10 );
    
    // Returns the icon's height.
    public int getIconHeight() {
        return HEIGHT;
    }
    // Returns the icon's width.
    public int getIconWidth() {
        return WIDTH;
    }
    
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Color foreground = g.getColor();
        Font font = g.getFont();
        
//        g.setColor( Color.red );
//        g.drawRect( x, y, WIDTH, HEIGHT );
        
        g.setFont( font1 );
        g.setColor( Color.green );
        g.drawString("R", x + 5, y + 17 );
        
        g.setFont( font2 );
        g.setColor( Color.blue );
        g.drawString("A", x + 20, y + 9 );
        g.setColor( Color.red );
        g.drawString("X", x + 20, y + 17 );
        
        g.setFont( font );
        g.setColor( foreground );
    }
    
}
