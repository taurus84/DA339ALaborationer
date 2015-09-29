package f23;

import java.text.Collator;
import java.util.Locale;

public class Person implements Comparable {
    private String name;
    
    public Person(){
        this("okänt namn");
    }
    
    public Person(String name){
        this.name=name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "Namn = "+name;
    }
    
    public int compareTo(Object obj) {
        Person p = (Person)obj;
        int res = name.compareTo(p.getName());
        return res;  // return name.compareTo(p.getName());
    }
}
