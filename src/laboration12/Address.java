package laboration12;

public class Address {
	
	private String street;
	private String town;
	private int postalCode;
	
	public Address(String inStreet, int inPostalCode, String inTown){
		this.street = inStreet;
		this.postalCode = inPostalCode;
		this.town = inTown;
	}
//	public String getStreet(){
//		return this.street;
//	}
//	public int getPostalCode(){
//		return this.postalCode;
//	}
//	public String getTown(){
//		return this.town;
//	}
	public String toString(){
		String res = this.street + "\n" + this.postalCode + " " + this.town;
		return res;
	}

}
