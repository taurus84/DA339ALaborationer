package f8;

import java.util.Random;
import javax.swing.JOptionPane;

public class For1 {

    public void testMethod() {
        int number;
        Random rand = new Random();
        String resTrue = "true: ", resFalse = "false: ";

        for (int i = 1; i <= 100; i++) {
            number = rand.nextInt(51);
            if (true) {
                resTrue += number + " ";
            } else {
                resFalse += number + " ";
            }
        }
        JOptionPane.showMessageDialog(null, resTrue + "\n" + resFalse);
    }

    public static void main(String[] args) {
        For1 prog = new For1();
        prog.testMethod();
    }
}
