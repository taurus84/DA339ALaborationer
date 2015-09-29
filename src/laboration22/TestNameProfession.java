package laboration22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestNameProfession extends JPanel implements ActionListener {
	private JButton update = new JButton("Uppdatera textytan");
	private JTextArea textarea = new JTextArea();
	private NameProfession nameProfession = new NameProfession();

	public TestNameProfession() {
		setLayout(new BorderLayout());
		textarea.setPreferredSize(new Dimension(400, 400));
		textarea.setEditable(false);
		update.addActionListener(this);
		add(nameProfession, BorderLayout.NORTH);
		add(textarea, BorderLayout.CENTER);
		add(update, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == update) {
			textarea.setText("Namn: " + nameProfession.getName() + "\nYrke: " + nameProfession.getProfession());
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new TestNameProfession());
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
