package f15;
import javax.swing.*;
import java.awt.*;

public class Application2 {
    public void start() {
        JFrame frame = new JFrame( "Ett program" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // programmet avslutas vid klick på stäng-knappen

        frame.add( new Application2Panel() );  
        frame.pack();               // fönstret anpassar sig till panelens önskade storlek
        frame.setVisible(true);     // fönstret görs synligt
    }
    
    public static void main(String[] args) {
        Application2 app = new Application2();
        app.start();
    }
}

