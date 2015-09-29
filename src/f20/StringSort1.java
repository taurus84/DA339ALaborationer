package f20;
import java.util.Arrays;

public class StringSort1 {
    public static void main(String[] args) {
        String[] words = {"orm","ödla","salamander","ägg","Rolf","ost","Bertil",
                "Anna","örn","bok","Bengt","åsna","Öst","Åska","apa","Ätran"};
        Arrays.sort(words);
        for(int i=0; i<words.length; i++) {
            System.out.println(words[i]+" ");
        }
    }
}
