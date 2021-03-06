package laboration22;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

/**
 * I ett fönster av typen PaintWindow kan man visa bilder och rita linjer, ellipser 
 * och rektanglar. När fönstret skapas kan man ange en bild som ska vara bakgrundsbild.
 * @author Rolf Axelsson
 */
public class PaintWindow {
	private JFrame frame = new JFrame("Paint Window");
    private PaintPanel panel = new PaintPanel();
    private BufferedImage bImage;
    private Graphics2D bg;
    private ImageIcon background;
    private LinkedList<IconXY> icons = new LinkedList<IconXY>();
    private LinkedList<DPShape> buffer = new LinkedList<DPShape>();
    private LinkedList<DPShape> updateBuffer = new LinkedList<DPShape>();
    private boolean update = true;

    /**
     * Ett fönster med vit bakgrund skapas. Bakgrunden blir 600x400 pixlar stor.
     */
    public PaintWindow() {
        this(null);
    }

    /**
     * Ett fönster med bakgrundsbilden <code>background</code> skapas. Bakgrunden får bildens storlek. Maximal
     * storlek på bakgrunden är 800x800 pixlar.
     * @param background bilden som ska visas i bakgrunden. Om <code>background</code> är <i>null</i> så skapas
     */
    public PaintWindow(ImageIcon background) {
//        super("Paint Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        this.background = background;
        if (background != null) {
            panel.setPreferredSize(new Dimension( Math.min(background.getIconWidth(),800), 
                                                  Math.min(background.getIconHeight(),800)));
        } else {
            panel.setPreferredSize(new Dimension(600, 400));
        }
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Ändrar bakgrunden till bilden <code>icon</code>. Bakgrundens storlek ändras ej.
     * @param icon fönstrets nya bakgrundsbild
     */
    public void setBackground(ImageIcon icon) {
        this.background = icon;
        update = true;
    } 

    /**
     * Visar bilden <code>icon</code> i PaintWindow på positionen <code>x,y</code>.
     * @param icon bilden som visas
     * @param x x-position för bilden (övre vänstra hörnet)
     * @param y y-position för bilden (övre vänstra hörnet)
     */
    public void showImage(Icon icon, int x, int y) {
        int index;
        if (icon == null) {
            return;
        }
        IconXY newIcon = new IconXY(icon, x, y);
        index = icons.indexOf(newIcon);
        if (index == -1) {
            icons.add(new IconXY(icon, x, y));
        } else {
            icons.get(index).setX(x);
            icons.get(index).setY(y);
        }
        panel.repaint();
    }
    
    /**
     * Gömmer en bild som visas i PaintWindow
     * @param icon
     */
    public void hideImage(Icon icon) {
        int index;
        if (icon == null) {
            return;
        }
        IconXY newIcon = new IconXY(icon, 0, 0);
        index = icons.indexOf(newIcon);
        if (index != -1) {
            icons.remove(index);
            panel.repaint();
        } 
    }
    
    /**
     * Tar bort ritkommandon från PaintWindow. Efter anropet syns bakgrund och synliga bilder. 
     */
    public void clear() {
//        if (background != null) {
//            bg.drawImage(background.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
//        } else {
//            bg.setPaint(Color.WHITE);
//            bg.fillRect(0, 0, this.getWidth(), this.getHeight());
//        }
        updateBuffer.clear();
        update = true;
        panel.repaint();
    }
    
    /**
     * Rensar PaintWindow från bakgrund, bilder och ritkommandon
     */
    public void clearAll() {
        background = null;
        buffer.clear(); 
        updateBuffer.clear();
        icons.clear();
        update = true;
        panel.repaint();
    }
    
    /**
     * Returnerar ritytans bredd
     * @return ritytans bredd
     */
    public int getBackgroundWidth() {
        return panel.getWidth();
    }
    
    /**
     * Returnerar ritytans höjd
     * @return ritytans höjd
     */
    public int getBackgroundHeight() {
        return panel.getHeight();
    }

    /**
     * Ritar en linje i PaintWindow
     * @param x1 x-koordinat i linjens startpunkt
     * @param y1 y-koordinat i linjens startpunkt
     * @param x2 x-koordinat i linjens slutpunkt
     * @param y2 y-koordinat i linjens slutpunkt
     * @param color linjens färg
     * @param lineWidth linjens bredd
     */
    public void line(int x1, int y1, int x2, int y2, Color color, int lineWidth) {
        buffer.add(new Line(x1, y1, x2, y2, color, lineWidth));
        panel.repaint();
    }

    /**
     * Ritar en rektangel i PaintWindow
     * @param x x-koordinat i rektangelns övre vänstra hörn
     * @param y y-koordinat i rektangelns övre vänstra hörn
     * @param width rektangelns bredd
     * @param height rektangelns höjd
     * @param color kantens färg
     * @param lineWidth kantens bredd
     */
    public void drawRect(int x, int y, int width, int height, Color color, int lineWidth) {
        buffer.add(new DrawRect(x, y, width, height, color, lineWidth));
        panel.repaint();
    }

    /**
     * Ritar en fylld rektangel i PaintWindow
     * @param x x-koordinat i rektangelns övre vänstra hörn
     * @param y y-koordinat i rektangelns övre vänstra hörn
     * @param width rektangelns bredd
     * @param height rektangelns höjd
     * @param color rektangelns färg
     */
    public void fillRect(int x, int y, int width, int height, Color color) {
        buffer.add(new FillRect(x, y, width, height, color));
        panel.repaint();
    }

    /**
     * Ritar en ellips i PaintWindow. Ellipsen är inskriven i en rektangel
     * @param x x-koordinat i rektangelns övre vänstra hörn
     * @param y y-koordinat i rektangelns övre vänstra hörn
     * @param width rektangelns bredd
     * @param height rektangelns höjd
     * @param color kantens färg
     * @param lineWidth kantens bredd
     */
    public void drawOval(int x, int y, int width, int height, Color color, int lineWidth) {
        buffer.add(new DrawOval(x, y, width, height, color, lineWidth));
        panel.repaint();
    }

    /**
     * Ritar en fylld ellips i PaintWindow. Ellipsen är inskriven i en rektangel
     * @param x x-koordinat i rektangelns övre vänstra hörn
     * @param y y-koordinat i rektangelns övre vänstra hörn
     * @param width rektangelns bredd
     * @param height rektangelns höjd
     * @param color ellipsens färg
     */
    public void fillOval(int x, int y, int width, int height, Color color) {
        buffer.add(new FillOval(x, y, width, height, color));
        panel.repaint();
    }

    /**
     * Tråden som anropar metoden avbruts under <code>ms</code> millisekunder.
     * @param ms pausens längd i millisekunder
     */
    public static void pause(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
    
    private class PaintPanel extends JPanel {

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Point point;
            if (update) {
            	update = false;
            	if(bImage == null) {
                    bImage = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
                    bg = bImage.createGraphics();
            	}
                if (background != null) {
                    bg.drawImage(background.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
                } else {
                    bg.setPaint(Color.WHITE);
                    bg.fillRect(0, 0, this.getWidth(), this.getHeight());
                }
                for(DPShape shape : updateBuffer)
                	shape.draw(bg);
            } else {
				while (buffer.size() > 0) {
					buffer.get(0).draw(bg);
					updateBuffer.add(buffer.remove(0));
				}
            }
            g.drawImage(bImage, 0, 0, null);
            for (int i = 0; i < icons.size(); i++) {
                icons.get(i).paintIcon(g);
            }
        }
    }

    private class IconXY {

        private Icon icon;
        private int x;
        private int y;

        public IconXY(Icon icon, int x, int y) {
            this.icon = icon;
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void paintIcon(Graphics g) {
            icon.paintIcon(PaintWindow.this.panel, g, this.x, this.y);
        }
        
        public boolean equals(Object obj) {
            IconXY iconXY = (IconXY)obj;
            return this.icon.equals(iconXY.icon);
        }
    }

    private abstract class DPShape {
        public abstract void draw(Graphics2D g);
    }

    private class Line extends DPShape {
        private int x1,  y1,  x2,  y2,  lineWidth;
        private Color color;

        public Line(int x1, int y1, int x2, int y2, Color color, int lineWidth) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = color;
            this.lineWidth = lineWidth;
        }

        public void draw(Graphics2D g) {
            g.setStroke(new BasicStroke(lineWidth));
            g.setPaint(color);
            g.draw(new Line2D.Double(x1, y1, x2, y2));
        }
    }

    private class DrawRect extends DPShape {

        private int x,  y,  width,  height,  lineWidth;
        private Color color;

        public DrawRect(int x, int y, int width, int height, Color color, int lineWidth) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
            this.lineWidth = lineWidth;
        }

        public void draw(Graphics2D g) {
            g.setStroke(new BasicStroke(lineWidth));
            g.setPaint(color);
            g.draw(new Rectangle2D.Double(x, y, width, height));
        }
    }

    private class FillRect extends DPShape {

        private int x,  y,  width,  height;
        private Color color;

        public FillRect(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public void draw(Graphics2D g) {
            g.setPaint(color);
            g.fill(new Rectangle2D.Double(x, y, width, height));
        }
    }

    private class DrawOval extends DPShape {

        private int x,  y,  width,  height,  lineWidth;
        private Color color;

        public DrawOval(int x, int y, int width, int height, Color color, int lineWidth) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
            this.lineWidth = lineWidth;
        }

        public void draw(Graphics2D g) {
            g.setStroke(new BasicStroke(lineWidth));
            g.setPaint(color);
            g.draw(new Ellipse2D.Double(x, y, width, height));
        }
    }

    private class FillOval extends DPShape {

        private int x,  y,  width,  height;
        private Color color;

        public FillOval(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public void draw(Graphics2D g) {
            g.setPaint(color);
            g.fill(new Ellipse2D.Double(x, y, width, height));
        }
    }
}
