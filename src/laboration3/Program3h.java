package laboration3;

public class Program3h{

    public void country() {
        System.out.println("Land: Sverige");
    }

    public void residents() {
        System.out.println("Ca 9 miljoner invånare");
    }

    public void bigCities() {
        System.out.println("Tre stora städer:");
        System.out.println("Stockholm");
        System.out.println("Göteborg");
        System.out.println("Malmö");
        
    }
    
    public void message() {
    	Program3h todo = new Program3h();
    	todo.country();
    	todo.residents();
    	todo.bigCities();
    	
    }
    
    public static void main( String[] args ) {
    	Program3h prog3h = new Program3h();
    	prog3h.message();
    	
    }
}
