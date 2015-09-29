package f16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInput extends JPanel implements ActionListener {
    private JPanel operationPanel = new JPanel(null);
    private JPanel operandPanel = new JPanel(null);
    private JButton btnCalculate = new JButton("Beräkna");
    private JLabel lblTitle = new JLabel("Inmatning av matematiska uttryck");
    private JLabel lblOp1 = new JLabel("Operand 1:");
    private JLabel lblOp2 = new JLabel("Operand 2:");
    private JTextField tfNbr1 = new JTextField();
    private JTextField tfNbr2 = new JTextField();
    private JRadioButton rbAdd = new JRadioButton("+");
    private JRadioButton rbSub = new JRadioButton("-");
    private JRadioButton rbMul = new JRadioButton("*");
    private JRadioButton rbDiv = new JRadioButton("/");
    private ButtonGroup group = new ButtonGroup();
    private Controller controller;

    /** Creates new form UserInput */
    public UserInput(Controller controller) {
        this.controller = controller;

        setPreferredSize( new Dimension(290, 147) );
        setLayout( null );
        lblTitle.setBounds(10, 8, 300, 20);
        lblTitle.setFont(new Font("SansSerif", Font.BOLD, 14));

        operandPanel();
        operationPanel();

        btnCalculate.setBounds(10, 110, 100, 25);
        btnCalculate.setBackground(new Color(204, 204, 255));
        btnCalculate.addActionListener(this);

        add(lblTitle);
        add(operandPanel);
        add(operationPanel);
        add(btnCalculate);
    }
    
    private void operandPanel() {
        operandPanel.setBounds(10, 35, 190, 68);
        operandPanel.setBorder(BorderFactory.createTitledBorder("Operander"));
        lblOp1.setBounds(10, 20, 70, 20);
        lblOp1.setText("Operand 1:");
        lblOp2.setBounds(10, 40, 70, 20);
        lblOp2.setText("Operand 2:");
        tfNbr1.setBounds(90, 20, 79, 20);
        tfNbr1.setHorizontalAlignment(JTextField.RIGHT);
        tfNbr1.setText("0");
        tfNbr2.setBounds(90, 40, 79, 20);
        tfNbr2.setHorizontalAlignment(JTextField.RIGHT);
        tfNbr2.setText("0");
        operandPanel.add(lblOp1);
        operandPanel.add(lblOp2);
        operandPanel.add(tfNbr1);
        operandPanel.add(tfNbr2);
    }
    
    private void operationPanel() {
        operationPanel.setBounds(210, 35, 70, 100);
        operationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Räknesätt"));
        rbAdd.setBounds(10, 20, 55, 15);
        rbAdd.setSelected(true);
        rbSub.setBounds(10, 40, 55, 15);
        rbMul.setBounds(10, 60, 55, 15);
        rbDiv.setBounds(10, 80, 55, 15);
        group.add(rbAdd);
        group.add(rbSub);
        group.add(rbMul);
        group.add(rbDiv);
        operationPanel.add(rbAdd);
        operationPanel.add(rbSub);
        operationPanel.add(rbMul);
        operationPanel.add(rbDiv);
    }

    public void actionPerformed(ActionEvent e) {
        String operation;
        if (rbAdd.isSelected()) {
            operation = "+";
        } else if (rbSub.isSelected()) {
            operation = "-";
        } else if (rbMul.isSelected()) {
            operation = "*";
        } else {
            operation = "/";
        }
        controller.newCalculation(tfNbr1.getText(), tfNbr2.getText(), operation);
    }

    public static void main(String[] args) {
    	UserInput ui = new UserInput(null);
    	ui.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    	JOptionPane.showMessageDialog( null, ui );
    }
}
