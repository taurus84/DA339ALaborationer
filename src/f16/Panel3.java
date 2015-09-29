package f16;
import java.awt.*;       // Color, Dimension
import javax.swing.*;    // JFrame, JPanel, JLabel, JButton, BorderFactory
import java.awt.event.*; // ActionListener, MouseListener
import java.util.*;      // Random

public class Panel3 extends JPanel {
    private JPanel panel = new JPanel(new BorderLayout()); // Panel med GridLayout
    private JLabel label = new JLabel("Mitt namn är Rolf");
    private JButton btnCyan = new JButton("Ljusblå");
    private JButton btnMagenta = new JButton("Lila");
    private JButton btnExit = new JButton("Avsluta");

    public Panel3() {
        setLayout(new GridLayout(2, 2)); // Huvudpanel med BorderLayout
        setPreferredSize(new Dimension(400, 300));

        label.setBorder(BorderFactory.createLineBorder(Color.red));
        btnCyan.setBackground(Color.CYAN);
        btnMagenta.setBackground(Color.MAGENTA);

        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        panel.add(btnMagenta, BorderLayout.NORTH);
        panel.add(btnExit, BorderLayout.WEST);
        panel.add(btnCyan, BorderLayout.SOUTH);
        panel.add(label, BorderLayout.CENTER);

        Listener listener = new Listener();
        label.addMouseListener(listener);
        btnCyan.addActionListener(listener);
        btnMagenta.addActionListener(listener);
        btnExit.addActionListener(listener);

        add(new JButton("1"));
        add(panel);
        add(new JButton("3"));
        add(new JButton("4"));
    }

    // Inre klass som sköter händelsehanteringen
    private class Listener implements ActionListener, MouseListener {
        Random rand = new Random();
        
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnCyan) {
                label.setForeground(Color.CYAN);
            } else if (e.getSource() == btnMagenta) {
                label.setForeground(Color.MAGENTA);
            } else if (e.getSource() == btnExit) {
                System.exit(0);
            }
        }

        public void mouseClicked(MouseEvent arg0) {}

        public void mouseEntered(MouseEvent arg0) {
            int rndColor = rand.nextInt(5);
            int rndButton = rand.nextInt(3);
            Color color = null;
            switch (rndColor) {
            case 0:
                color = Color.RED;
                break;
            case 1:
                color = Color.BLUE;
                break;
            case 2:
                color = Color.GREEN;
                break;
            case 3:
                color = Color.YELLOW;
                break;
            case 4:
                color = Color.PINK;
                break;
            }
            label.setForeground(color);
        }

        public void mouseExited(MouseEvent arg0) {
            label.setText("Mitt namn är Rolf");
            label.setForeground(Color.BLACK);
        }

        public void mousePressed(MouseEvent arg0) {
            label.setText("Du pressar mig");
        }

        public void mouseReleased(MouseEvent arg0) {
            label.setText("Jag är fri!!!");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Panel3" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new Panel3() );
        frame.pack();
        frame.setVisible( true );
    }
}
