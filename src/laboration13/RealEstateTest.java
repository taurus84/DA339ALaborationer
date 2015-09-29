package laboration13;

public class RealEstateTest {
	
	public void action(){
	
		Building building = new Building(5, 1350);
		Address address = new Address("Nygatan 4", 12345,"Ystad");
		RealEstate re = new RealEstate("Kvarnen 4", building, address); 
		System.out.println(re.getName()); System.out.println(re.getBuilding().toString()); // toString i Building- klassen
		System.out.println(re.getAddress().toString()); // toString i Address- klassen
		System.out.println("---------------------------"); System.out.println(re.toString());
		
		System.out.println("---------------------------"); 
		re.setName("Skorpionen 17");
		re.setBuilding( new Building(6, 1470) );
		re.setAddress( new Address("Nygatan 4", 55555, "Ystad") ); 
		System.out.println(re.toString());

//		re.setBuilding( new Building(7, 12324));
//		System.out.println(re.toString());
		
		
		
	}

	public static void main (String [] args){
		RealEstateTest prog = new RealEstateTest();
		prog.action();
	}
}
