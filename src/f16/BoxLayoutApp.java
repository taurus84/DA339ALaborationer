package f16;

import javax.swing.JFrame;

public class BoxLayoutApp {
    public void start() {
        JFrame frame = new JFrame( "BoxLayoutApp" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new BoxLayoutPanel() );
        frame.pack();
        frame.setVisible( true );
    }
    public static void main(String[] args) {
        BoxLayoutApp app = new BoxLayoutApp();
        app.start();
    }
}
