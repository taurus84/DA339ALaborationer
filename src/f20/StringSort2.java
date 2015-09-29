package f20;
import java.text.Collator;
import java.util.*;

public class StringSort2 {    
    public static void main(String[] args) {
        String[] words = {"orm","ödla","salamander","ägg","Rolf","ost","Bertil",
                "Anna","örn","bok","Bengt","åsna","Öst","Åska","apa","Ätran"};
        Arrays.sort(words,new StringDesc());
        for(int i=0; i<words.length; i++) {
            System.out.println(words[i]+" ");
        }
    }
}

