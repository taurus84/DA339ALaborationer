package f8;
import javax.swing.*;

public class For2 {
    public void example1() {
        System.out.print( "Talen 5-12: " );
        for( int i = 5 ; i <= 12 ; i++ ) {
            System.out.print( i + " " );
        }
        System.out.println();
    }
    
    public void example2() {
        int min, max;    
        min = Integer.parseInt( JOptionPane.showInputDialog( "Ange min") );
        max = Integer.parseInt( JOptionPane.showInputDialog( "Ange max") );
        System.out.print( "Talen " + min + "-" + max + ": " );
        for( int i = min ; i <= max ; i++ ) {
            System.out.print( i + " " );
        }
        System.out.println();
    }
    
    public void example3() {
        System.out.print( "Talen 10-1: " );
        for( int i = 10 ; i >= 1 ; i-- ) {
            System.out.print( i + " " );
        }
        System.out.println();
    }
    
    public void example4() {
    	int min = Integer.parseInt(JOptionPane.showInputDialog("Mata in det minsta värdet"));
    	int max = Integer.parseInt(JOptionPane.showInputDialog("Mata in det största värdet"));
    	
        System.out.print("Talen " + max + "-" + min + ": ");
        for( int i = max ; i >= min ; i-- ) {
            System.out.print( i + " " );
        }
        System.out.println();
    }
    
    public void example5() {
    	int start = Integer.parseInt(JOptionPane.showInputDialog("Ange startvärde"));
    	int n = Integer.parseInt(JOptionPane.showInputDialog("Ange antal värde"));
    	
        System.out.print( "Vart femte tal: " );
        for( int i = 1 ; i <= n ; i++ ) {
            if( i < n ) {
                System.out.print( start + ", " );
            } else {
                System.out.print( start );
            }
            start += 5;
        }
        System.out.println();
    }

    public void action() {
        for(int choice=1; choice<=5; choice++) {
            switch(choice) {
                case 1 : example1(); break;
                case 2 : example2(); break;
                case 3 : example3(); break;
                case 4 : example4(); break;
                case 5 : example5(); break;
            }
        }
    }
    public static void main( String[] args ) {
        For2 fe = new For2();
        fe.action();
    }
}
