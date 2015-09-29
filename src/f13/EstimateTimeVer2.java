package f13;
import java.util.Random;
import javax.swing.JOptionPane;

public class EstimateTimeVer2 {
    private long getRandomTime() {
        Random rand = new Random();
        return (rand.nextInt(4) + 2) * 1000;
    }
    
    private long estimation(long time) {
        Stopwatch watch = new Stopwatch();
        String txt = "Du ska uppskatta "+(time/1000)+" sekunder.\n\n"+
                "Tryck på OK för att starta tidtagningen.";
        
        JOptionPane.showMessageDialog( null, txt );
        watch.start();
        JOptionPane.showMessageDialog( null, "Tryck på OK för att stoppa tidtagningen" );
        watch.stop();
        
        return watch.getMilliSeconds();
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
        EstimateTimeVer2 prog = new EstimateTimeVer2();
        prog.action();
    }
}

