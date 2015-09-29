package f8;
import java.util.Random;
import javax.swing.JOptionPane;

public class While1 {
    public void testMethod() {
        int number, i=0;
        Random rand = new Random();
        String resTrue = "true: ", resFalse = "false: ";

        while(i<100) {
            number = rand.nextInt(51);
            if (true) {
                resTrue += number + " ";
            } else {
                resFalse += number + " ";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, resTrue + "\n" + resFalse);
    }

    public static void main(String[] args) {
        While1 w1 = new While1();
        w1.testMethod();
    }
}
