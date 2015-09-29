package f23;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;

public class Lines2D implements Icon {

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        float[] dash1 = {10, 5};
        float[] dash2 = {5};
        Stroke thinLine = new BasicStroke(1);
        Stroke thickLine = new BasicStroke(5);
        Stroke dashedLine1 = new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10.0f, dash1, 0.0f);
        Stroke dashedLine2 = new BasicStroke(20.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10.0f, dash2, 0.0f);

        // ljus grå bakgrund
        g2.setPaint(new Color(224, 224, 224));
        g2.fillRect(x, y, getIconWidth(), getIconHeight());

        // tunn svart line - tjockleken är 1
        g2.setPaint(Color.BLACK);
        g2.setStroke(thinLine);
        g2.draw(new Line2D.Double(10, 10, 290, 10));

        // tjock röd linje - tjockleken är 5
        g2.setStroke(thickLine);
        g2.setPaint(Color.RED);
        g2.draw(new Line2D.Double(10, 30, 290, 30));

        // streckad blå linje - tjockleken är 2, strecken är 10 långa, mellanrummen 5 långa
        g2.setStroke(dashedLine1);
        g2.setPaint(Color.BLUE);
        g2.draw(new Line2D.Double(10, 50, 290, 50));
//        g2.setPaint(Color.GREEN);
//        g2.draw(new Rectangle2D.Double(30,10,100,45));

        // streckad magenta linje. samma längd på streck och mellanrum
        g2.setStroke(dashedLine2);
        g2.setPaint(Color.MAGENTA);
        g2.draw(new Line2D.Double(10, 70, 290, 70));
    }

    public int getIconWidth() {
        return 300;
    }

    public int getIconHeight() {
        return 100;
    }

    public static void main(String[] args) {
        IconWindow.showIcon(new Lines2D());
    }
}
