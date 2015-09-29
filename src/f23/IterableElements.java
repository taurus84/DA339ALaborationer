package f23;

import java.util.Iterator;

public class IterableElements implements Iterable {
	private Object[] elements;
	
	public IterableElements(Object[] elements) {
		this.elements = elements;
	}

	public Iterator iterator() {
		return new ArrayWithIterator(elements);
	}
	
	public static void main(String[] args) {
		Person[] persons = {new Person("Pelle"), new Person("Lisa"), new Person("Emmie")};
		IterableElements elements = new IterableElements(persons);

		System.out.println("PERSONER");
		Iterator iter1 = elements.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		System.out.println("PERSONER");
		for(Object element : elements) {
			System.out.println(element);
		}
		
//		System.out.println("PERSONER");
//		Object element;
//		for(Iterator iter = elements.iterator(); iter.hasNext();) {
//		    element =  iter.next();
//			System.out.println(element);
//		}
	}
}

