package f20;
import java.util.Comparator;

public class ShortNamesFirst implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String town1 = ((Address)obj1).getTown();
        String town2 = ((Address)obj2).getTown();
        return town1.length()-town2.length();
    }
}
