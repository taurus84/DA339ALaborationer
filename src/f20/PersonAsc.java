package f20;
import java.util.*;

/**
 * Klassen sorterar Person-objekt växande
 **/
public class PersonAsc implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Person person1 = (Person)obj1;
        Person person2 = (Person)obj2;
        String name1 = person1.getName();
        String name2 = person2.getName();
        return name1.compareTo(name2); // Klassen String implementerar Comparable
    }
}
