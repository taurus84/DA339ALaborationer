package f23;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import javax.swing.Icon;

public class Shapes2D implements Icon {

    private void gradientFill(Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Paint redToBlue = new GradientPaint(10, 10, Color.red, 100, 10, Color.blue);
        Paint redToBlueCyclic = new GradientPaint(10, 10, Color.red, 100, 10, Color.blue, true);
        Paint greenToYellow = new GradientPaint(10, 10, Color.green, 30, 30, Color.yellow, true);

        g2.setPaint(redToBlue);
        g2.fill(new Rectangle2D.Double(10, 20, 270, 70));


        g2.setPaint(redToBlueCyclic);
        g2.fill(new Ellipse2D.Double(10, 100, 270, 70));


        g2.setPaint(greenToYellow);
        g2.fill(new RoundRectangle2D.Double(10, 180, 270, 70, 20, 10));
    }

    private void texturePaint(Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;  // Rita i fönstret
        BufferedImage bi = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
        Graphics2D bg2 = (Graphics2D) bi.getGraphics(); // Graphics för att rita i bufferten

        bg2.setPaint(new GradientPaint(0, 0, Color.blue, 10, 10, Color.white, true));
        bg2.fill(new Rectangle2D.Double(0, 0, 25, 25));
        bg2.fill(new Rectangle2D.Double(25, 25, 25, 25));
        bg2.setPaint(new GradientPaint(0, 10, Color.white, 10, 0, Color.red, true));
        bg2.fill(new Rectangle2D.Double(0, 25, 25, 25));
        bg2.fill(new Rectangle2D.Double(25, 0, 25, 25));

        Paint texture = new TexturePaint(bi, new Rectangle(50, 50));
        g2.setPaint(texture);
        g2.fill(new Ellipse2D.Double(10, 260, 270, 170));
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        gradientFill(g, x, y);
        texturePaint(g, x, y);
    }

    public int getIconWidth() {
        return 290;
    }

    public int getIconHeight() {
        return 450;
    }

    public static void main(String[] args) {
        IconWindow.showIcon(new Shapes2D());
    }
}
