package f20;
import java.util.*;

public class PersonSort {

    public static void main(String[] args) {
        Object[] persons = {new Person("Sven"), new Person("Torbjörn"),
                            new Person("Gunilla"), new Person("Eva"),
                            new Person("Erik")};

        System.out.println();
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        Arrays.sort(persons);
        System.out.println();
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}

