package f8;
import javax.swing.*;

public class Do3 {
    public void example() {
        int nbr;
        do {
            nbr = Integer.parseInt( JOptionPane.showInputDialog( "Mata in ett positivt heltal" ) );
        } while( nbr <= 0 );
        System.out.println( nbr );
    }

    public static void main( String[] args ) {
        Do3 d3 = new Do3();
        d3.example();
    }
}
