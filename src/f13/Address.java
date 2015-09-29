package f13;

public class Address {
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
    	return street + "\n" + postalCode + " " + town;
    }
}
