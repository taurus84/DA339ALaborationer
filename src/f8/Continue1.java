package f8;

public class Continue1 {
    public void example() {
        for( int i = 1 ; i < 10 ; i++ ) {
            if( i == 4 )
                continue;
            System.out.print( i + " " );
        }
    }

    public static void main( String[] args ) {
        Continue1 ce = new Continue1();
        ce.example();
    }
}
