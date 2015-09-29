	package DAHOSCP2;

import java.util.Calendar;
import java.util.Date;
/**
 * Klassen inehåller metoder som ger oss tid i timmar, minuter, sekunder och kan uppdatera dem.
 * 
 * @author Oscar
 *
 */
public class Time {
	
	// Instansvariabler
	private int hour;
	private int minute;
	private int second;
	
	Calendar cal = Calendar.getInstance(); // Ett calender objekt så at vi kan hämta tiden.
	
	
	public Time(){
	}
	
	public int getHour(){ // metod som ger oss vilken timme et är.
		return hour = cal.get(Calendar.HOUR_OF_DAY);
	}
	
	public int getMinute(){ // metod som ger oss vilken minut et är.
		return minute = cal.get(Calendar.MINUTE);
		}
	
	public int getSecond(){ // metod som ger oss vilken sekund det är.
		return second = cal.get(Calendar.SECOND);
		
	}
	
	public String toString(){ // En sträng som ger oss iden skriven som tt:mm:ss.
		return hour + ":" + minute + ":" + second;
	}
	
	
	public void update(){ // Metod som updaterar tiden.
		cal.setTime(new Date()); // updaterar tiden.
		getHour(); // anropar metod timmar
		getMinute();//---- minuter
		getSecond();//---- sekunder
	}
}
