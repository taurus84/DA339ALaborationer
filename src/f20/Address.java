package f20;

public class Address implements Comparable {
    private String street;
    private int postalCode;
    private String town;
    
    public Address(String street, int postalCode, String town) {
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
    
    public String toString() {
        return street+", "+postalCode+" "+town;
    }
    
    // Sorterar objekten växande avseende postalCode
    public int compareTo(Object address) {
        Address addr = (Address)address;  // address måste vara av typen Address (eller subklass)
        return postalCode - addr.postalCode;
    }
}
