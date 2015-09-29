package f16;
import javax.swing.JFrame;

public class GridLayoutApp {
    public void start() {
        JFrame frame = new JFrame( "GridLayoutApp" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new GridLayoutPanel() );
        frame.pack();
        frame.setVisible( true );
    }
    public static void main(String[] args) {
        GridLayoutApp app = new GridLayoutApp();
        app.start();
    }
}
