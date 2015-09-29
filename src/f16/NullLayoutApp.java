package f16;
import javax.swing.*;
import java.awt.*;

public class NullLayoutApp {
    public void start() {
        JFrame frame = new JFrame( "Ett program" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // programmet avslutas vid klick på stäng-knappen

        frame.add( new NullLayoutPanel() );  
        frame.pack();               // fönstret anpassar sig till panelens önskade storlek
        frame.setVisible(true);     // fönstret görs synligt
        frame.setResizable(false);
    }
    
    public static void main(String[] args) {
        NullLayoutApp app = new NullLayoutApp();
        app.start();
    }
}

