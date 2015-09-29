package f25; 
import javax.swing.JOptionPane;

public class Exception2 {

    public Exception2() {
        int op1 = 100, op2 = 100, quotient = 100;
        String str;

        str = JOptionPane.showInputDialog("Ange op2");
        try {
            op2 = Integer.parseInt(str);
            quotient = op1 / op2;
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (ArithmeticException e2) { // Avmarkera denna
            System.out.println(e2);
        } finally {
            System.out.println("Hit kommer man alltid");
        }
        System.out.println(op1 + "/" + op2 + " = " + quotient);
    }

    public static void main(String[] args) {
        new Exception2();
    }
}
