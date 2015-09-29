package f13;
import java.util.Random;
import javax.swing.JOptionPane;

public class EstimateTime {
    private Random rand = new Random();
    private Stopwatch watch = new Stopwatch();
    
    private long getRandomTime() {
        return (this.rand.nextInt(4) + 2) * 1000;
    }
    
    private long estimation(long time) {
        String txt = "Du ska uppskatta "+(time/1000)+" sekunder.\n\n"+
                "Tryck på OK för att starta tidtagningen.";
        
        JOptionPane.showMessageDialog( null, txt );
        this.watch.start();
        JOptionPane.showMessageDialog( null, "Tryck på OK för att stoppa tidtagningen" );
        this.watch.stop();
        
        return this.watch.getMilliSeconds();
    }
    
    private void result(long rndTime, long estimatedTime) {
        String res = "Uppskattning: " + estimatedTime + "\nFel: " + (estimatedTime - rndTime) + " ms";
        JOptionPane.showMessageDialog( null, res );
    }
    
    public void action() {
        long rndTime, estimatedTime;
        rndTime = getRandomTime();
        estimatedTime = estimation( rndTime );
        result( rndTime, estimatedTime );
    }
    
    public static void main(String[] args) {
        EstimateTime prog = new EstimateTime();
        prog.action();
    }
}

