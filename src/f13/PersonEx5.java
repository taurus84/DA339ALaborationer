package f13;

import java.util.Calendar;

public class PersonEx5 {
    public static void main(String[] args) {
        Address2 ad1 = new Address2("Nygatan 11",22224,"Lund");
        Person2 p1 = new Person2("Sven Gren", "850316-3333", ad1);
        Person2 p2 = new Person2("Anette Bild", "560405-2222", ad1);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("---------- Sven flyttar -----------");
        Address2 newAdr = p1.getAddress();
        newAdr.setStreet("Storgatan 12");
        newAdr.setPostalCode(12345);
        newAdr.setTown("Malmö");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}

class Person2 {
    private String name;
    private String id;  // Swedish personal number
    private Address2 address;
    
    public Person2(String name, String id, Address2 address) {
        this.name = name;
        this.id = id;
        this.address = address;
//        this.address = new Address2(address.getStreet(),address.getPostalCode(),address.getTown()); // Address2 - not constant
    }

    public Person2(String name, String id, String street, int postalCode, String town) {
        this.name = name;
        this.id = id;
        this.address = new Address2(street, postalCode, town);
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }
    
    public Address2 getAddress() {
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

// Address class with setters
class Address2 {
    private String street;
    private int postalCode;
    private String town;
    
    public Address2(String street, int postalCode, String town) {
        this.street = street;
        this.postalCode = postalCode;
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getTown() {
        return town;
    }
    
    public void setStreet(String street) {
		this.street = street;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String toString() {
    	return street + "\n" + postalCode + " " + town;
    }
}