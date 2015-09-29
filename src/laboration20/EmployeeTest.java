/*
 * EmployeeTest.java
 * Den 3/10 - 2013
 */
package laboration20;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class EmployeeTest {
    public static void main( String[] args ) {
//        Employee emp = new Employee( "Ergil Tuveberg", "Renlighet AB", 27000 );
//        
//        System.out.println( "Namn: " + emp.getName() );
//        System.out.println( "Arbetar hos: " + emp.getEmployer() );
//        System.out.println( "Lön: " + emp.getWage() );
//        System.out.println( emp.toString() );
    	
    	Employee[] manpower = new Employee[ 4 ];
    	String res = "";
    	manpower[ 0 ] = new Employee( "Grön, Bengt", "SEB", 26700 ); 
    	manpower[ 1 ] = new Employee( "Al, Eva", "Hamnkontoret", 22400 ); 
    	manpower[ 2 ] = new Employee( "Ek, Blanca", "Hemköp", 28200 ); 
    	manpower[ 3 ] = new Employee( "Svensson, Ove", "Stadium", 25500 ); 
    	Arrays.sort( manpower );
    	for( int i = 0; i < manpower.length; i++ ) {
    		res += manpower[ i ].toString() + "\n";
    	}
    	JOptionPane.showMessageDialog( null, res );
    }
}
