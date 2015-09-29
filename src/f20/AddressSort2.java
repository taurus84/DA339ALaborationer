package f20;
import java.util.*;

public class AddressSort2 {
    public void action() {
        Address[] addr = {
            new Address("Agatan 3",20434,"Astad22"),
            new Address("Bgatan 3",36434,"Bstad2"),
            new Address("Cgatan 3",11434,"Cstad333"),
            new Address("Dgatan 3",23434,"Dstad")};
        
        System.out.println();
        for(int i=0; i<addr.length; i++)
            System.out.println(addr[i]);
        Arrays.sort(addr, new PostalCodeDescending());
        System.out.println();
        for(int i=0; i<addr.length; i++)
            System.out.println(addr[i]);
        Arrays.sort(addr, new TownAscending());
        System.out.println();
        for(int i=0; i<addr.length; i++)
            System.out.println(addr[i]);
        Arrays.sort(addr, new ShortNamesFirst());
        System.out.println();
        for(int i=0; i<addr.length; i++)
            System.out.println(addr[i]);
    }
    
    public static void main(String[] args) {
        AddressSort2 prog = new AddressSort2();
        prog.action();
    }
}
