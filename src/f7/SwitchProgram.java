package f7;
import javax.swing.*;

public class SwitchProgram {
    public void switchEx() {
        int choice;
        String menu = "Tänkbara val:\n" +
                "1  Gå på föreläsning\n" +
                "2  Gå hem och läsa kurslitteratur\n" +
                "3  Gå till datorsal och jobba\n\n"+
                "Ange ditt alternativ";
        String message;
        choice = Integer.parseInt( JOptionPane.showInputDialog( menu ) );
        switch(choice) {
            case 1: message = "Ett utmärkt val!";
                    break;
            case 2: message = "Underbart att läsa!";
                    break;
            case 3: message = "Fredagsfavoriten!";
                    break;
            default: message = "Du råkade trycka på en felaktig tangent!";
        }
        JOptionPane.showMessageDialog( null, message );
    }
}
