package laboration15;

import java.awt.Dimension;

import javax.swing.JPanel;

public class AllPanels extends JPanel{
	
	public AllPanels(){
		
		setPreferredSize( new Dimension( 600,500 ));
		add(new CalcPanel());
		add(new FCConverterPanel());
		add(new ColorPanel());
		add(new TransportPanel());
		
		
		
	}

}
