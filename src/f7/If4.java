package f7;
import javax.swing.*;

public class If4 {
    public void grade() {
        String grade;
        int points;

        points = Integer.parseInt(JOptionPane.showInputDialog("Ange poäng"));
        if(points>=20)
            grade = "VG";
        else if(points>=10)
            grade = "G";
        else
            grade = "IG";
        JOptionPane.showMessageDialog( null, "Betyg: "+grade );
    }
}
