package f25; 
import javax.swing.JOptionPane;

public class Exception1 {

    public Exception1() {
        int op1 = 100, op2, quotient;
        String str;

        str = JOptionPane.showInputDialog("Ange op2");
        op2 = Integer.parseInt(str);
        quotient = op1 / op2;
        System.out.println(op1 + "/" + op2 + " = " + quotient);
    }

    public static void main(String[] args) {
        new Exception1();
    }
}
