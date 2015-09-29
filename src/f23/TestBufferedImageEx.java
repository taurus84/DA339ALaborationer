package f23;  
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Rolf
 */
public class TestBufferedImageEx implements ActionListener {
    private JFrame frame = new JFrame();
    private JLabel lblImage = new JLabel();
    private JButton btnLine = new JButton("Ny linje");
    private JButton btnErase = new JButton("Rensa");
    private BufferedImageEx buf = new BufferedImageEx(600,400,Color.PINK);
    private Random random = new Random();

    public TestBufferedImageEx() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblImage.setIcon(buf);
        btnLine.addActionListener(this);
        btnErase.addActionListener(this);
        frame.add(btnLine,BorderLayout.NORTH);
        frame.add(btnErase,BorderLayout.SOUTH);
        frame.add(lblImage,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TestBufferedImageEx();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int x1, y1, x2, y2;
        Color color;
        if(e.getSource()==btnErase) {
            buf.erase();
            lblImage.repaint();
        } else if(e.getSource()==btnLine) {
            x1 = random.nextInt(buf.getIconWidth());
            y1 = random.nextInt(buf.getIconHeight());
            x2 = random.nextInt(buf.getIconWidth());
            y2 = random.nextInt(buf.getIconHeight());
            color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
            buf.line(x1, y1, x2, y2, color);
            lblImage.repaint();
        }
    }
}
