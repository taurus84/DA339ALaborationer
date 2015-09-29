package f16;
import javax.swing.*;
import java.awt.*;

public class GridLayoutPanel extends JPanel {
    private JLabel lblTxt1 = new JLabel("Detta är text 1");
    private JLabel lblTxt2 = new JLabel("Text 2");
    private JButton btnExit = new JButton("Avsluta");
    private JButton button = new JButton("Knapp");
    private JTextArea textarea = new JTextArea("En JTextArea med en hel del text inuti. Eftersom det är så mycket text syns inte all text");
    private Font font = new Font("SansSerif", Font.PLAIN, 18);

    public GridLayoutPanel() {
        setPreferredSize( new Dimension( 400, 300 ) );
        setLayout(new GridLayout(3, 2, 10, 5));

        lblTxt1.setFont(font);                           
        lblTxt1.setBorder(BorderFactory.createLineBorder(Color.black));  
        lblTxt1.setPreferredSize(new Dimension(50, 50)); 
        lblTxt2.setBackground(Color.red);                
        lblTxt2.setOpaque(true);
        button.setFont(font);                            
        btnExit.setBackground(Color.MAGENTA);
        textarea.setBackground(Color.blue);
        textarea.setForeground(Color.white);
        textarea.setBorder(BorderFactory.createLineBorder(Color.black));  
        textarea.setFont(font);
//        textarea.setLineWrap(true);
//        textarea.setWrapStyleWord(true);

        add(btnExit);
        add(button);
        add(textarea);
//        add(new JScrollPane(textarea));  // ersätt ovanstående rad med denna rad
        add(lblTxt1);
        add(lblTxt2);
        add(new JTextField());
    }
}
