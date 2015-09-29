package f20;
import java.util.*;
import java.text.*;
 
/**
 * Klassen sorterar String-objekt avtagande
 **/
public class StringDesc implements Comparator {
    private Collator collator = Collator.getInstance(new Locale("sv","SE"));;
    
    public int compare(Object obj1, Object obj2) {
        return -collator.compare(obj1,obj2);
    }
}
