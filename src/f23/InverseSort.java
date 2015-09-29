package f23;

import java.util.Comparator;

public class InverseSort implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Comparable comp = (Comparable)obj2;
		return comp.compareTo(obj1);
	}
}

