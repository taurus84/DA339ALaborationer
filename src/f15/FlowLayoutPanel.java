package f15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutPanel extends JPanel implements ActionListener {
    private JLabel lblTxt1 = new JLabel("Detta är text 1");
    private JLabel lblTxt2 = new JLabel("Text 2");
    private JButton btnExit = new JButton("Avsluta");
    private JButton button = new JButton("Knapp");
    private Font font = new Font("SansSerif", Font.BOLD, 14);

    public FlowLayoutPanel() {
        setPreferredSize( new Dimension(200, 300) );       // bredd = 300, höjd = 300
//        setBackground(Color.BLUE);                        // vit bakgrundsfärg

        lblTxt1.setFont(font);                             // typsnitt för texten i 'text1'
        lblTxt1.setBorder(BorderFactory.createLineBorder(Color.black));  // kantlinje
        lblTxt2.setBackground(Color.red);                  // bakgrundsfärg
        lblTxt2.setOpaque(true);
        lblTxt2.setBorder(BorderFactory.createLineBorder(Color.black));  // kantlinje
        lblTxt2.setPreferredSize(new Dimension(100, 50));  // bredd=100, höjd=50
        button.setFont(font);                              // typsnitt i 'button'
        button.setPreferredSize(new Dimension(100, 100));  // storlek på 'button'
        btnExit.setBackground(Color.MAGENTA);              // bakgrundsfärg
        btnExit.setPreferredSize(new Dimension(180,25));
        
        button.addActionListener(this);
        btnExit.addActionListener(this);
        
        add(btnExit);                                      // placera 'btnExit' i fönstret
        add(button);                                       // placera 'button' i fönstret
        add(lblTxt1);                                      // placera 'lblTxt1' i fönstret
        add(lblTxt2);                                      // placera 'lblTxt2' i fönstret
    }
    
    public static void main(String[] args) {
        FlowLayoutPanel panel = new FlowLayoutPanel();
        panel.setBorder( BorderFactory.createLineBorder(Color.GREEN) );
        JOptionPane.showMessageDialog(null, panel);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button ) {
            lblTxt1.setText("Rolf Axelsson klickade på knappen");   
        } else if(e.getSource()==btnExit) {
            System.exit(0);
        }
    }
}
