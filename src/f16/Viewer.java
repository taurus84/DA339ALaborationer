package f16;
import javax.swing.*;
import java.awt.*;

public class Viewer extends JPanel {
    private JLabel lblCounter = new JLabel("Antal beräkningar: 0");
    private JLabel lblResult = new JLabel();
    private JLabel lblResultTitle = new JLabel("Resultat av senaste beräkningen:");
    private Font plainSS14 = new Font("SansSerif", Font.PLAIN, 14);
    private int counter = 0;

    public Viewer() {
        setLayout(null);
        setPreferredSize( new Dimension(268, 135) );

        lblCounter.setBounds(10, 10, 210, 17);
        lblCounter.setFont(plainSS14);

        lblResultTitle.setBounds(10, 50, 240, 17);
        lblResultTitle.setFont(new Font("SansSerif", Font.BOLD, 14));

        lblResult.setFont(plainSS14);
        lblResult.setBounds(10, 80, 240, 14);
        add(lblCounter);
        add(lblResultTitle);
        add(lblResult);
    }

    public void showResult(double nbr1, double nbr2, char operation, double res) {
        String result = "";

        this.counter++;
        lblCounter.setText("Antal beräkningar: " + counter);

        result = String.format("%1.2f " + operation + " %1.2f = %1.2f", nbr1, nbr2, res);
        lblResult.setText(result);
    }

    public static void main(String[] args) {
    	Viewer viewer = new Viewer();
    	viewer.setBorder( BorderFactory.createLineBorder(Color.BLACK));
    	viewer.showResult(3.5, 4.0, '*', 14);
    	JOptionPane.showMessageDialog(null, viewer);
    	viewer.showResult(2.5, 1.5, '+', 4);
    	JOptionPane.showMessageDialog(null, viewer);
    }
}
