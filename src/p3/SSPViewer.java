package p3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;




public class SSPViewer extends JPanel {

	private JPanel huvudpanel = new JPanel();
	private JPanel grid = new JPanel();
	private JLabel topp = new JLabel();
	private JLabel human = new JLabel();
	private JLabel computer = new JLabel();
	private JLabel hPoints = new JLabel();
	private JLabel cPoints = new JLabel();
	private JLabel hChoice = new JLabel();
	private JLabel cChoice = new JLabel();
	private Font font = new Font( "SansSerif", Font.BOLD, 30 );
	private Font font2 = new Font( "SansSerif", Font.BOLD, 20 );
	
	
	public SSPViewer() {
		setPreferredSize(new Dimension(400,300));
		setLayout(new BorderLayout());
		setBackground(Color.RED);
		topp.setPreferredSize(new Dimension (400,70));
		
		topp.setText("Först till 3 vinner!");
		human.setText("");
		computer.setText("");
		hPoints.setText("0");
		cPoints.setText("0");
		hChoice.setText("Inget val");
		cChoice.setText("Inget val");
				
		topp.setFont(font);
		human.setFont(font2);
		computer.setFont(font2);
		hPoints.setFont(font2);
		cPoints.setFont(font2);
		hChoice.setFont(font2);
		cChoice.setFont(font2);
		
		topp.setHorizontalAlignment(SwingConstants.CENTER);
		human.setHorizontalAlignment(SwingConstants.CENTER);
		computer.setHorizontalAlignment(SwingConstants.CENTER);
		hPoints.setHorizontalAlignment(SwingConstants.CENTER);
		cPoints.setHorizontalAlignment(SwingConstants.CENTER);
		hChoice.setHorizontalAlignment(SwingConstants.CENTER);
		cChoice.setHorizontalAlignment(SwingConstants.CENTER);
		topp.setVerticalAlignment(SwingConstants.CENTER);
		
		human.setBackground(Color.WHITE);
		human.setOpaque(true);
		computer.setBackground(Color.WHITE);
		computer.setOpaque(true);
		human.setBackground(Color.WHITE);
		human.setOpaque(true);
		human.setBackground(Color.WHITE);
		human.setOpaque(true);

		human.setIcon(new ImageIcon("src/p3/turtle.jpg"));
		computer.setIcon(new ImageIcon("src/p3/smiley.gif"));
		grid.setLayout(new GridLayout (3,2));
		grid.add(human);
		grid.add(computer);
		grid.add(hPoints);
		grid.add(cPoints);
		grid.add(hChoice);
		grid.add(cChoice);
		grid.setOpaque(true);
		add(topp, BorderLayout.NORTH);
		add(grid, BorderLayout.CENTER);
		
	}
	public void setToppText(String res) {
		topp.setText(res);
	}
		
	public void setHPoints(int hp) {
		if (hp == 0) {
			hPoints.setText("0");
		} else if (hp == 1) {
			hPoints.setText("1");
		} else if (hp == 2) {
			hPoints.setText("2");
		} else if (hp == 3) {
			hPoints.setText("3");
		}
	}
	public void setCPoints(int cp) {
		if (cp == 0) {
			cPoints.setText("0");
		} else if (cp == 1) {
			cPoints.setText("1");
		} else if (cp == 2) {
			cPoints.setText("2");
		} else if (cp == 3) {
			cPoints.setText("3");
		}
	}
	public void setHChoice(int hc) {
		if (hc == 0) {
			hChoice.setText("STEN");
		} else if (hc == 1) {
			hChoice.setText("SAX");
		} else if (hc == 2) {
			hChoice.setText("Påse");
		}
	}
	public void setCChoice(int cc) {
		if (cc == 0) {
			cChoice.setText("STEN");
		} else if (cc == 1) {
			cChoice.setText("SAX");
		} else if (cc == 2) {
			cChoice.setText("Påse");
		}
	}
	public void setWinner(int i) {
		if (i == 0) {
			human.setIcon(new ImageIcon("src/p3/turtleWin.gif"));
			computer.setIcon(new ImageIcon("src/p3/smileyLoose.png"));
		} else if (i == 1) {
			human.setIcon(new ImageIcon("src/p3/turtleLoose.gif"));
			computer.setIcon(new ImageIcon("src/p3/smileyWin.gif"));
		}
	}
	public void startPics() {
		human.setIcon(new ImageIcon("src/p3/turtle.jpg"));
		computer.setIcon(new ImageIcon("src/p3/smiley.gif"));
	}
	
		
	  public static void main(String[] args) {
		 JFrame frame = new JFrame( "Panel" );
		 frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 frame.add( new SSPViewer() );
		 frame.pack();
		 frame.setVisible( true );
		 
		    }
		  
}

