package f13;
import java.util.Random;
import javax.swing.JOptionPane;

public class EstimateTimeVer1 {
    public void action() {
        Stopwatch watch = new Stopwatch();
        Random rand = new Random();
        long estimation, rndTime = (rand.nextInt(4) + 2) * 1000;
        String res, txt = "Du ska uppskatta "+(rndTime/1000)+" sekunder.\n\n"+
                "Tryck på OK för att starta tidtagningen.";
        
        JOptionPane.showMessageDialog( null, txt );
        watch.start();
        JOptionPane.showMessageDialog( null, "Tryck på OK för att stoppa tidtagningen" );
        watch.stop();
        
        estimation = watch.getMilliSeconds();
        res = "Uppskattning: " + estimation + "\nFel: " + (estimation - rndTime) + " ms";
        JOptionPane.showMessageDialog( null, res );
    }
    
    public static void main(String[] args) {
        EstimateTimeVer1 prog = new EstimateTimeVer1();
        prog.action();
    }
}

