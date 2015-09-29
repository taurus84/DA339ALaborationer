package f23;

import java.util.Iterator;

public class ArrayWithIterator implements Iterator {
	private Object[] objects;
	private int index = 0;
	
	public ArrayWithIterator(Object[] array) {
		objects = array;
	}

	public boolean hasNext() {
		return index<objects.length;
	}

	@Override
	public Object next() {
		return objects[index++];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
		Person[] persons = {new Person("Pelle"), new Person("Lisa"), new Person("Emmie")};
		ArrayWithIterator iter = new ArrayWithIterator(persons);
		System.out.println("PERSONER");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

