package f23;
import java.util.*;

public class PersonSort2 {

    public static void main(String[] args) {
        Person[] persons = new Person[6];
        
        persons[0]=new Person("Anna Olsson");
        persons[1]=new Person("Örjan Svensson");
        persons[2]=new Employee("Olof Andersson","Eriksson",40000);
        persons[3]=new Employee();
        persons[3].setName("åsa persson");
        persons[4]=new StudentInProgram("Lisa Eriksson","MAH","Programvaruteknik",2004);
        persons[5]=new Student();
        for (int i=0;i<persons.length;i++){
            System.out.println(persons[i]);
        }
        System.out.println("-------------------------------");
        Arrays.sort(persons, new NameSort());
        for (int i=0;i<persons.length;i++){
            System.out.println(persons[i]);
        }
    }
}

