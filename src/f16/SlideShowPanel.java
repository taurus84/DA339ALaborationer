package f16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // ActionListener, MouseListener
import java.net.*;       // URL, MalformedURLException
import java.applet.*;    // AudioClip

public class SlideShowPanel extends JPanel implements ActionListener, MouseListener {
    private JButton btnIm1 = new JButton();
    private JButton btnIm2 = new JButton();
    private JLabel lblIm3 = new JLabel();
    private JLabel lblIm4 = new JLabel();
    private JLabel lblImage = new JLabel();
    private AudioClip clip;
    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;
    private ImageIcon image4;

    public SlideShowPanel() {
        setPreferredSize(new Dimension(510, 450));
        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1));
        readImages();
        try {
            clip = JApplet.newAudioClip(new URL("file:/M:/sound/gong.au"));
        } catch (MalformedURLException e) {}
        lblImage.setIcon(image1);
        lblImage.setHorizontalAlignment(JLabel.CENTER);
        btnIm1.setPreferredSize(new Dimension(80, 80));
        lblIm3.setHorizontalAlignment(JLabel.CENTER);
        lblIm4.setHorizontalAlignment(JLabel.CENTER);
        btnIm1.addActionListener(this);
        btnIm2.addActionListener(this);
        lblIm3.addMouseListener(this);
        lblIm4.addMouseListener(this);
        buttonPanel.add(btnIm1);
        buttonPanel.add(btnIm2);
        buttonPanel.add(lblIm3);
        buttonPanel.add(lblIm4);
        add(new JScrollPane(lblImage), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.WEST);
    }

    private void readImages() {
        btnIm1.setIcon(new ImageIcon("M:/bilder/Rhodos1_80.JPG"));
        btnIm2.setIcon(new ImageIcon("M:/bilder/Rhodos2_80.JPG"));
        lblIm3.setIcon(new ImageIcon("M:/bilder/Rhodos3_80.JPG"));
        lblIm4.setIcon(new ImageIcon("M:/bilder/Rhodos4_80.JPG"));
        image1 = new ImageIcon("M:/bilder/Rhodos1_640.jpg");
        image2 = new ImageIcon("M:/bilder/Rhodos2_640.JPG");
        image3 = new ImageIcon("M:/bilder/Rhodos3_640.JPG");
        image4 = new ImageIcon("M:/bilder/Rhodos4_640.JPG");
    }

    public void actionPerformed(ActionEvent e) {
        clip.play();
        if (e.getSource() == btnIm1) {
            lblImage.setIcon(image1);
        } else if (e.getSource() == btnIm2) {
            lblImage.setIcon(image2);
        }
    }

    public void mouseEntered(MouseEvent e) {
        clip.play();
        if (e.getSource() == lblIm3) {
            lblImage.setIcon(image3);
        } else if (e.getSource() == lblIm4) {
            lblImage.setIcon(image4);
        }
    }

    public void mouseClicked(MouseEvent arg0) {}
    public void mouseExited(MouseEvent arg0) {}
    public void mousePressed(MouseEvent arg0) {}
    public void mouseReleased(MouseEvent arg0) {}

    public static void main(String[] args) {
    	JOptionPane.showMessageDialog( null, new SlideShowPanel() );
    }
} 
