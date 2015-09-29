package laboration3;

public class Program3f {

    public void club() {
        System.out.println("Klubbens namn är Landskrona BOIS.");
    }

    public void supporter() {
        System.out.println("BOIS är bäst.");
    }

    public void league() {
        System.out.println("Klubben ligger i Superettan");
    }

    public void coach() {
        System.out.println("Tränare är Jörgen Pettersson");
    }

    public void expert() {
        System.out.println("Det blir nog inte Allsvenskan nästa år");
    }

    public static void main(String[] args) {
        Program3f p3f = new Program3f();
        p3f.coach();
        p3f.expert();
        p3f.supporter();
        p3f.club();
        p3f.league(); 
    }
}
