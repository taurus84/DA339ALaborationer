package f8;

public class Break1 {
    public void example() {
//        for( int rows = 1 ; rows <= 2 ; rows++ ) {
            for( int i = 1 ; i < 10 ; i++ ) {
                if( i == 4 )
                    break;
                System.out.print( i + " " );
            }
//            System.out.println();
//        }
    }

    public static void main( String[] args ) {
        Break1 prog = new Break1();
        prog.example();
    }
}
