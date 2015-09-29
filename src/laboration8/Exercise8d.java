package laboration8;

/**
 * 3 metoder med samma mening
 * @author Rolf Axelsson
 */
public class Exercise8d {
    public void forloop() {
    	int min = 10, max = 25, increase = 3;
        for(int i = min ; i <= max; i += increase ) {
            System.out.print( i + " " );
        }
        System.out.println();
    }
    
    public void whileloop() {
    	int min = 10, max = 25, increase = 3;
    }

    public void doloop() {
    	int min = 10, max = 25, increase = 3;
    }

    public static void main(String[] args) {
        Exercise8d e8d = new Exercise8d();
        e8d.forloop();
        e8d.whileloop();
        e8d.doloop();
    }
}
