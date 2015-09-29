package f13;
import java.util.Calendar;

public class Person {
    private String name;
    private String id;  // Swedish personal number
    private Address address;
    
    public Person(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public Person(String name, String id, String street, int postalCode, String town) {
        this.name = name;
        this.id = id;
        this.address = new Address(street, postalCode, town);
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Address getAddress() {
        return this.address;
    }
    
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }
    
    public String getStreet() {
        return this.address.getStreet();
    }

    public int getPostalCode() {
        return this.address.getPostalCode();
    }

    public String getTown() {
        return this.address.getTown();
    }

    public int getAge() {
        int year, yearOfBirth, age;
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR) % 100;
        yearOfBirth = Integer.parseInt(id.substring(0,2));
        age = year - yearOfBirth;
        if( age<0) {
            age += 100;
        }
        return age;
    }
    
    public String toString() {
    	return name + "\n" + id + "\n" + address.toString();
    }
}
