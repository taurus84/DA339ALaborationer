package f20;
import java.util.*;

/**
 * Klassen sorterar Address-objekt avtagande avseende postalCode.
 * Den naturliga ordningen sorterar Address-objekten växande avseende postalCode.
 **/
public class PostalCodeDescending implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Address addr = (Address)obj1; 
        return addr.compareTo(obj2)*-1;
    }
}
