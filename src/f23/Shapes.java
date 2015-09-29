package f23;
import java.awt.*;
import java.util.Random;
import javax.swing.Icon;

public class Shapes implements Icon {
    private Random random = new Random();

    public void paintIcon(Component c, Graphics g, int x, int y) {
        int red = random.nextInt(256), green = random.nextInt(256),
            blue = random.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        g.setColor(Color.GRAY);
        g.fillRect(x + 10, y + 10, 50, 50); // 50 x 50
        g.setColor(Color.BLACK);
        g.drawRect(x + 70, y + 10, 60, 70); // 60 x 70
        g.setColor(randomColor);
        g.fillOval(x + 10, y + 90, 50, 50); // 50 x 50
        g.setColor(Color.RED);
        g.drawOval(x + 70, y + 90, 70, 70); // 70 x 70
        g.setColor(Color.MAGENTA);
        g.fillOval(x + 10, y + 170, 100, 50); // 100 x 50
        g.setColor(Color.GREEN);
        g.drawOval(x + 120, y + 170, 100, 70); // 100 x 70
        g.drawOval(x + 122, y + 172, 96, 66); // 96 x 76
        g.setColor(Color.DARK_GRAY);
        g.drawLine(x + 10, y + 85, x + 240, y + 85);
        g.drawLine(x + 10, y + 165, x + 240, y + 165);
    }

    public int getIconWidth() {
        return 250;
    }

    public int getIconHeight() {
        return 250;
    }

    public static void main(String[] args) {
        IconWindow.showIcon(new Shapes());
    }
}
