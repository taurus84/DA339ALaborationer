package p2;

import java.util.Calendar;
import java.util.Date;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	private Calendar cal;
	
	
	public Time() {
		cal = Calendar.getInstance();
		this.hour = cal.get(Calendar.HOUR);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
		
		
		
	}
	
	public int getHour() {
//		this.hour = cal.get(Calendar.HOUR);
		return this.hour;
	}
	public int getMinute() {
//		this.minute = cal.get(Calendar.MINUTE);
		return this.minute;
	}
	public int getSecond() {
//		this.second = cal.get(Calendar.SECOND);
		return this.second;
	}
	public String toString() {
		String res = hour + ":" + minute + ":" + second; 
		return res;
	}
	public void update() {
		cal.setTime( new Date() );
		this.hour = cal.get(Calendar.HOUR);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
		
	}

}
