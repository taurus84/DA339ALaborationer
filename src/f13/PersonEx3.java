package f13;

public class PersonEx3 {
    public static void main(String[] args) {
        Person p1 = new Person("Sven Gren", "850316-3333", "Nygatan 11",22224,"Lund");
        System.out.println(p1.getName());
        System.out.println(p1.getStreet());
        System.out.println(p1.getPostalCode() + " " + p1.getTown());
    }
}
