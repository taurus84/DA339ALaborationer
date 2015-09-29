package laboration16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.*;

import javax.swing.*;

public class ImageChooser extends JPanel  {
	
	private JPanel pnlRadioButtons = new JPanel();
	private JRadioButton london = new JRadioButton("London");
	private JRadioButton movieLogo = new JRadioButton("FilmLogga");
	private JRadioButton lugi = new JRadioButton("Lugi");
	private JRadioButton tandem = new JRadioButton("Tandem");
	private JRadioButton thisProg = new JRadioButton("Detta program");
	private JButton removePic = new JButton("Ta bort bild");
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	private Controller controller;						//referens till ett controller-objekt
	
	
	public ImageChooser(Controller controller) {
		
		setPreferredSize(new Dimension(300,200));			//storleken på fönstret som kommer visa val-rutan
		setLayout(new BorderLayout());
		this.controller = controller;
		
		pnlRadioButtons.setLayout(new GridLayout(5,1));
		pnlRadioButtons.add(london);
		pnlRadioButtons.add(movieLogo);
		pnlRadioButtons.add(lugi);
		pnlRadioButtons.add(tandem);
		pnlRadioButtons.add(thisProg);
		buttonGroup.add(london);
		buttonGroup.add(movieLogo);
		buttonGroup.add(lugi);
		buttonGroup.add(tandem);
		buttonGroup.add(thisProg);
		
		add(pnlRadioButtons, BorderLayout.CENTER);
		add(removePic, BorderLayout.SOUTH);
		
		addListeners();
					
	}
	public void addListeners() {
		ImageListener listener = new ImageListener();
		london.addActionListener( listener );
		movieLogo.addActionListener( listener );
		lugi.addActionListener( listener );
		tandem.addActionListener( listener );
		thisProg.addActionListener( listener );
		removePic.addActionListener( new EraseListener() );
	}
	
	private class EraseListener implements ActionListener { 
		public void actionPerformed( ActionEvent e ) { 
			controller.eraseImage(); } 
	}

	private class ImageListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if( london.isSelected() )
				controller.newImage("M:/bilder/london06.jpg");
			else if( movieLogo.isSelected() )
				controller.newImage("M:/bilder/filmlogga.jpg");
			else if( lugi.isSelected() )
				controller.newImage("M:/bilder/lugi.gif");
			else if( tandem.isSelected() )
			controller.newImage("M:/bilder/tandem1.jpg");
			else if( thisProg.isSelected() ) 
				controller.newImage("M:/bilder/program.bmp");
		}
	
	}
}
	






