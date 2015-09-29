package f8;
import javax.swing.*;

public class Do2 {
    
    public void example1() {
        int i=5;
        System.out.print( "Talen 5-12: " );
        do {
            System.out.print( i + " " );
            i++;
        } while( i <= 12 );
        System.out.println();
    }

    public void example2() {
        int min, max;
        min = Integer.parseInt( JOptionPane.showInputDialog( "Ange min") );
        max = Integer.parseInt( JOptionPane.showInputDialog( "Ange max") );
        System.out.print( "Talen " + min + "-" + max + ": " );
        do {
            System.out.print( min + " " );
            min++;
        } while( min <= max );
        System.out.println();
    }

    public void example3() {
        int i=10;
        System.out.print( "Talen 10-1: " );
        do {
            System.out.print( i + " " );
            i--;
        } while( i >= 1 );
        System.out.println();
    }

    public void example4() {
    	int min = Integer.parseInt(JOptionPane.showInputDialog("Mata in det minsta värdet"));
    	int max = Integer.parseInt(JOptionPane.showInputDialog("Mata in det största värdet"));
    	
        System.out.print( "Talen " + max + "-" + min + ": " );
        do {
            System.out.print( max + " " );
            max--;
        } while( max >= min );
        System.out.println();
    }

    public void example5() {
    	int start = Integer.parseInt(JOptionPane.showInputDialog("Ange startvärde"));
    	int n = Integer.parseInt(JOptionPane.showInputDialog("Ange antal värde"));
        int i = 1;
    	
        System.out.print( "Vart femte tal: " );
        do {
            if( i < n )
                System.out.print( start + ", " );
            else
                System.out.print( start );
            start += 5;
            i++;
        } while( i <= n );        
        System.out.println();
    }
    
    public void action() {
        String txt = "1. Talen 5-12\n2. Min -> Max\n3. 10 -> 1\n4. Max -> Min\n5. Vart 5:e tal\n0. Avsluta";
        int choice = -1;
        do {
            switch(choice) {
                case 1 : example1(); break;
                case 2 : example2(); break;
                case 3 : example3(); break;
                case 4 : example4(); break;
                case 5 : example5(); break;
            }
            choice = Integer.parseInt(JOptionPane.showInputDialog(txt));
        }while(choice!=0);
    }

    public static void main(String[] args) {
        Do2 d2 = new Do2();
        d2.action();
    }
}
