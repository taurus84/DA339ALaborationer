package f15;

import javax.swing.*;

public class Application0 {
    public void start() {
        JFrame frame = new JFrame( "Ett program :-)" );         // skapa ett fönster
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // stängbart
        frame.setVisible( true );                               // synligt
    }
    
    public static void main(String[] args) {
        Application0 app = new Application0();
        app.start();
    }
}
