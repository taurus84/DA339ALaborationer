package f15;
import javax.swing.*;

public class Application1 {
    public void start() {
        JFrame frame = new JFrame(); 
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new Application1Panel() ); 
        frame.pack();
        frame.setVisible( true );
    }

    public static void main(String[] args) {
        Application1 app = new Application1();
        app.start();
    }   
}
