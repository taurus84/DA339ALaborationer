package p2;
import javax.swing.ImageIcon;

/**
 * Klassen startar programmet Race
 * @author TSROAX
 */
public class StartRace {
    public static void main(String[] args) {
        PaintWindow window = new PaintWindow();
        Car c1 = new Car(new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p2/CarBlue.GIF"));
        Car c2 = new Car(new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p2/CarRed.GIF"));
//        Car c1 = new Car(new ImageIcon("M:/Bilder/CarBlue.GIF"));
//        Car c2 = new Car(new ImageIcon("M:/Bilder/CarRed.GIF"));
        Race race = new Race(window,c1,c2);
        race.action();
        if(args.length>0) {
            PaintWindow.pause(2000);
            window.dispose();
        }
    }
}
