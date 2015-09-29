package f13;

public class PersonEx2 {
    public static void main(String[] args) {
        Address ad1 = new Address("Nygatan 11",22224,"Lund");
        Person p1 = new Person("Sven Gren", "850316-3333", ad1);
        System.out.println(p1.getName());
        System.out.println(p1.getStreet());
        System.out.println(p1.getPostalCode() + " " + p1.getTown());
    }
}
