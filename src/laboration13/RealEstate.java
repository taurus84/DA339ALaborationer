package laboration13;

public class RealEstate {
	private String name;
	private Building building;
	private Address address;
	
	public RealEstate(String name, Building building, Address address){
		this.name = name;
		this.building = building;
		this.address = address;
	}
	public String getName(){
		return this.name;
	}
	public Building getBuilding(){
		return this.building;
	}
	public Address getAddress(){
		return this.address;
	}
	public String toString(){
		String res = "Fastighet: " + this.name + "\n" + this.building.toString() + "\n" + this.address.toString(); 
		return res;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setBuilding(Building building){
		this.building = building;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	
	
	
	
	
	
	
}
