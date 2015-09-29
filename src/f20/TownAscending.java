package f20;
import java.util.*;

/**
 * Klassen sorterar Adress-objekt växande avseende town
 **/
public class TownAscending implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String town1 = ((Address)obj1).getTown();
        String town2 = ((Address)obj2).getTown(); 
        return town1.compareTo(town2);  // Använder compareTo i String
    }
}
