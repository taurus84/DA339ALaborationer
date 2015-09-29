package f13;

public class PersonEx4 {
    public static void main(String[] args) {
        Address ad1 = new Address("Nygatan 11",22224,"Lund");
        Person p1 = new Person("Sven Gren", "850316-3333", ad1);
        Person p2 = new Person("Anette Bild", "560405-2222", ad1);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("---------- Sven flyttar -----------");
        p1.setAddress(new Address("Storgatan 12", 12345, "Malmö"));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
