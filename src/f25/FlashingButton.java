package f25;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FlashingButton extends JButton {
    private Color[] colors;
    private int delay;
    private javax.swing.Timer activity;
    private ChangeColor cc = new ChangeColor();
    private int index = 0;

    public FlashingButton(String txt) {
    	this(txt,null);
    }
    
    public FlashingButton(String txt, Color[] colors) {
        this(txt, colors, 500);
    }

    public FlashingButton(String txt, Color[] colors, int delay) {
    	super(txt);
    	setColors(colors);
        setBackground(this.colors[index]);
        this.delay = delay;
        activity = new javax.swing.Timer(delay, cc);
        activity.start();
    }

    public void setColors(Color[] colors) {
    	if(colors==null || colors.length==0)
    		this.colors = new Color[]{Color.LIGHT_GRAY,Color.GRAY};
    	else
    		this.colors = colors.clone();
    }

    private class ChangeColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	index = (index+1)%colors.length;
        	FlashingButton.this.setBackground(colors[index]);
        }
    }
}
