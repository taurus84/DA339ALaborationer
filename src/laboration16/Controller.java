package laboration16;

import javax.swing.JOptionPane;

public class Controller {

	private ImageViewer viewer;
	
	
	public Controller (ImageViewer inViewer) {
		this.viewer = inViewer;
	}
	
	/*
	 * metoden tar emot en sträng på filnamnet och kollar om det är en bildfil, genom att kolla suffixet är jpg,gif eller png
	 */
	public void newImage( String filename ) { 
		int lastDot = filename.lastIndexOf( '.' ); 
		String suffix = filename.substring( lastDot+1 ); 
		suffix = suffix.toLowerCase(); // alla tecken små bokstäver 
		if( suffix.equals("jpg") || suffix.equals("gif") || suffix.equals("png") ) { 
			viewer.showImage( filename ); 
			System.out.print(filename);
			} 
		else { 
			JOptionPane.showMessageDialog( null, "Felaktig filtyp: " + suffix ); } 
	}
	/*
	 * metoden ska anropa metoden noImage i ImageViewer-objektet
	 */
	public void eraseImage() { 
		viewer.noImage(); 
	
	}
	
	public static void main(String[] args) {
		ImageViewer viewer = new ImageViewer(); 
		Controller cont = new Controller( viewer ); 
		cont.newImage( "M:/bilder/filmlogga.jpg" ); 
//		 cont.newImage( "M:/bilder/karta.bmp" ); 	// ej tillåten filtyp 
//		  cont.eraseImage();
		}
	
}

