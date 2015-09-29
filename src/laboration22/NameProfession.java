package laboration22; 
import java.awt.*; 
import javax.swing.*; 

public class NameProfession extends JPanel { 
	
	private JPanel panelWest = new JPanel(new GridLayout(2,1));
	private JPanel panelCenter = new JPanel(new GridLayout(2,1));
	private JLabel lblName = new JLabel("Namn");
	private JLabel lblPro = new JLabel("Yrke");
	private JTextField tfName = new JTextField();
	private JTextField tfPro = new JTextField();
	
	public NameProfession () {
		setPreferredSize(new Dimension(200,50));
		setLayout( new BorderLayout());
		panelWest.setPreferredSize(new Dimension(75,50));
		panelCenter.setPreferredSize(new Dimension(125,50));
			
		panelWest.add(lblName);
		panelWest.add(lblPro);
		
		panelCenter.add(tfName);
		panelCenter.add(tfPro);
		
		add(panelWest, BorderLayout.WEST);
		add(panelCenter, BorderLayout.CENTER);
		
	}
	
	public String getName() { 
		return tfName.getText();		
	 }

	public String getProfession() { 
		return tfPro.getText();		
	} 
			
}
	

	
	
	

