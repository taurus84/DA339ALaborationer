package f23; 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
/**
 * 
 * @author Rolf Axelsson
 */
public class IconEx {
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "IconTest" );
        Icon rax = new RAX();
//        frame.setIconImage(iconToImage(rax));

        JLabel label = new JLabel( "RAX = Rolf Axelsson" );
        label.setIcon( rax );
        label.setBorder( BorderFactory.createLineBorder( Color.magenta ) );
        frame.add( label, BorderLayout.CENTER );

        JButton button = new JButton( "Avsluta" );
        button.setIcon( rax );
        button.setHorizontalTextPosition(SwingConstants.LEFT);
        frame.add( button, BorderLayout.SOUTH );

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }
    
//    public static Image iconToImage(Icon icon) {
//    	BufferedImage bi = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);
//    	icon.paintIcon(null, bi.createGraphics(), 0, 0);
//    	return bi;
//    }
}
