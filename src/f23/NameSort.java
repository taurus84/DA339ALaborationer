package f23;
import java.util.Comparator;
import java.util.Locale;
import java.text.Collator;

public class NameSort implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Person p1 = (Person) obj1;
        Person p2 = (Person) obj2;
        Collator col = Collator.getInstance( new Locale("sv","SE"));
        int res = col.compare(p1.getName(), p2.getName());
        return res; // return col.compare(name, p.getName());
    }
}
