package laboration10;

import javax.swing.JOptionPane;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public void setDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void showDate(){
		String message = this.day + "/" + this.month + "-" + this.year; 
		JOptionPane.showMessageDialog(null, message);
	}
}
