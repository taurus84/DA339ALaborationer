package laboration16;

import java.awt.*;

import javax.swing.*;

public class ImageViewer extends JPanel {
	
	private JLabel lblTitle = new JLabel();
	private JLabel lblImage = new JLabel();
	
	
	
	
	
	public ImageViewer() {
		
		setPreferredSize(new Dimension(600,400));			//storleken på fönstret som kommer visa bilden
		this.setLayout(new BorderLayout());
		
		add(lblTitle, BorderLayout.NORTH);
		add(lblImage, BorderLayout.CENTER);
		
		
		
	}
	/*
	 * motoden tar bort bilden och visar INGEN BILD VALD
	 */
	public void noImage() {
		lblImage.setIcon( null ); // ta bort bild 
		lblImage.setText( "INGEN BILD VALD" );
		lblTitle.setText( "" );
	}
	/*
	 * metoden tar bort text som visas och visar en bild på sökvägen. lblTitle visar namnet på filen (i toppen)
	 */
	public void showImage(String filename) {
		lblImage.setText( "" ); // ta bort text som visas 
		lblImage.setIcon( new ImageIcon( filename ) );
		lblTitle.setText( "filename" );
	}
	
	public static void main(String args[]) {
		ImageViewer viewer = new ImageViewer();
		viewer.showImage("M:/bilder/filmlogga.jpg"); 
//		viewer.noImage();
		JOptionPane.showMessageDialog(null, viewer);
		}
}
