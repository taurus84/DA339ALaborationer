package f20;
import java.util.*;

public class AddressSort {
    public static void main(String[] args) {
        Address[] addr = {new Address("Agatan 3", 20434, "Astad"),
            new Address("Bgatan 3", 36434, "Bstad"),
            new Address("Cgatan 3", 11434, "Cstad"),
            new Address("Dgatan 3", 23434, "Dstad")
        };

        System.out.println();
        for (int i = 0; i < addr.length; i++) {
            System.out.println(addr[i]);
        }
        Arrays.sort(addr);
        System.out.println();
        for (int i = 0; i < addr.length; i++) {
            System.out.println(addr[i]);
        }
    }
}