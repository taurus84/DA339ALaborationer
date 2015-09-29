package laboration16;

import java.awt.Color;

public class Controller2 {
	
	private LabelPanel lblPanel;
	
	public Controller2 (LabelPanel lblPanel) {
		this.lblPanel = lblPanel;
			
	}

	public void setBg(Color color) {
		lblPanel.setColor(color);
		
	}
}
