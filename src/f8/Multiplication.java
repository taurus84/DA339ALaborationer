package f8;
import javax.swing.*;

public class Multiplication {
    
    public void printTable() {
        for( int factor = 1 ; factor <= 10 ; factor++ ) {
            for( int table = 1 ; table <= 12 ; table++ ) {
                System.out.print( String.format( "%4d", factor * table ) );
            }
            System.out.println();
        }
    }
    
    public static void main( String[] args ) {
        Multiplication mult = new Multiplication();
        mult.printTable();
    }
}
