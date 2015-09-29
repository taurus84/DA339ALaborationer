package p3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SSPUserInput extends JPanel{
	
	private SSPController controller;
	
	
	private JPanel panel = new JPanel();
	private JPanel valPanel = new JPanel();
	private Font font2 = new Font( "SansSerif", Font.BOLD, 20 );
	private JButton rock = new JButton("STEN");
	private JButton sax = new JButton("SAX");
	private JButton bag = new JButton("PÅSE");
	private JButton newG = new JButton("NYTT SPEL");
	private JButton exit= new JButton("AVSLUTA");
		
	
	public SSPUserInput(SSPController controller) {
		
		this.controller = controller;
		this.controller.setUserInput( this );
		
		setPreferredSize( new Dimension(400,300) );
		setLayout(new GridLayout(3,1, 0, 10));
		valPanel.setLayout(new GridLayout(1,3,10,0));
		valPanel.setBackground(Color.MAGENTA);
		setBackground(Color.MAGENTA);
				
		rock.setFont(font2);
		sax.setFont(font2);
		bag.setFont(font2);
		newG.setFont(font2);
		exit.setFont(font2);
				 
		valPanel.add(rock);
		valPanel.add(sax);
		valPanel.add(bag);
		 
		add(valPanel);
		add(newG);
		add(exit);
		 
		Listener listener = new Listener();
		rock.addActionListener(listener);
		sax.addActionListener(listener);
		bag.addActionListener(listener);
		newG.addActionListener(listener);
		exit.addActionListener(listener);
		 		 	
	}
	private class Listener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
	            if (e.getSource() == rock) {
	            	controller.newChoice(0);
	            } else if (e.getSource() == sax) {
	            	controller.newChoice(1);
	            } else if (e.getSource() == bag) {
	            	controller.newChoice(2);
	            } else if (e.getSource() == newG) {
	            	controller.newGame();
	            } else if (e.getSource() == exit) {
	            	System.exit(0);
	            }
		 }
	}
	   
	public void enableButtons() {
		rock.setEnabled( true );
		sax.setEnabled( true );
		bag.setEnabled( true );
	}
	public void disableButtons() {
		rock.setEnabled( false );
		sax.setEnabled( false );
		bag.setEnabled( false );
	}
		
}	
		
//		public void mouseClicked(MouseEvent e) {
//			if (rock.isSelected()) {
//				controller.newChoice(0);
//				}
//			
//		}
//
//		
//		public void mousePressed(MouseEvent e) {
//			if (rock.isSelected()) {
//			controller.newChoice(0);
//			}
//		}
//
//		
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
		
	
//	public static void main(String[] args) {
//			 JFrame frame = new JFrame( "Panel" );
//			 frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//			 frame.add( new SSPUserInput() );
//			 frame.pack();
//			 frame.setVisible( true );
//			 
//	}
	
	
	


