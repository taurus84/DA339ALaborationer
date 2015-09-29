package f15;
 
import javax.swing.JFrame;

public class FlowLayoutApp {
    public void start() {
        JFrame frame = new JFrame( "FlowLayoutApp" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new FlowLayoutPanel() );
        frame.pack();
        frame.setVisible( true );
    }
    public static void main(String[] args) {
        FlowLayoutApp app = new FlowLayoutApp();
        app.start();
    }
}
