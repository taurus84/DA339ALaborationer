package f8;
import java.util.Random;
import javax.swing.JOptionPane;

public class Do1 {
    public void testMethod() {
        int number, i=0;
        Random rand = new Random();
        String resTrue = "true: ", resFalse = "false: ";

        do {
            number = rand.nextInt(51);
            if (true) {
                resTrue += number + " ";
            } else {
                resFalse += number + " ";
            }
            i++;
        }while(i<100);
        JOptionPane.showMessageDialog(null, resTrue + "\n" + resFalse);
    }

    public static void main(String[] args) {
        Do1 prog = new Do1();
        prog.testMethod();
    }
}
