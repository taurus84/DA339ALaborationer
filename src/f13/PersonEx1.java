package f13;

public class PersonEx1 {
    public static void main(String[] args) {
        Address ad1 = new Address("Nygatan 11",22224,"Lund");
        Person p1 = new Person("Sven Gren", "850316-3333", ad1);
        int age = p1.getAge();
        System.out.println(p1.getName() + " fyller " + age + " år detta år");
        
//        Address ad2;
//        p1.setAddress( new Address("Nygatan 9",22224,"Lund"));
//        ad2 = p1.getAddress();
//        System.out.println(ad2.getStreet());
    }
}
