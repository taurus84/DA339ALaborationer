package laboration20;

public class Exercise20a {
	public void program() {
		// läs in information från befolkning.txt och lagra informationen
		// i en array av typen Population[].
//		Population[] countries = Populations.readPopulations("M:/java/befolkning.txt");
		Population[] countries = Populations.readPopulations("src/laboration20/befolkning.txt");
		
		
		// Lösning till deluppgift 0, avmarkera efter testkörning
//		for (int i = 0; i < countries.length; i++) {
//			System.out.println(countries[i].getCountry() + ", "
//					+ countries[i].getPopulation());
//		}

//deluppgift 1
		
//		for (int i = 0; i < countries.length; i++) {
//			System.out.println(countries[i].getCountry());
//		}
		
//deluppgift2
		
//		for (int i = 0; i < countries.length; i++) {
//			long inhabitants = countries[i].getPopulation();
//			if ( inhabitants > 100000000) {
//				System.out.println(countries[i].getCountry() + ", \t" 
//						+ countries[i].getPopulation());
//			}
//		}
		
//deluppgift3
//		for (int i = 0; i < countries.length; i++) {
//			String country = countries[i].getCountry();
//			char firstChar = country.charAt(0);
//			
//			if (firstChar == 'M') {
//				System.out.println(countries[i].getCountry());
//			}
//		}
		
//deluppgift4
//		for (int i = 0; i < countries.length; i++) {
//			long inhabitants = countries[i].getPopulation();
//			if (inhabitants >= 8000000 && inhabitants <= 10000000) {
//				System.out.println(countries[i].getCountry() + ", \t" 
//						+ countries[i].getPopulation());
//			}
//		}

//deluppgift5
		
//		int tot = 0;
//		for (int i = 0; i < countries.length; i++) {
//			if (countries[i].getPopulation() < 1000000) {
//				tot++;
//			}
//		}
//		System.out.print(tot + " länder har mindre än 1 miljon invånare");
		
//deluppgift6
//		int totK = 0;
//		for (int i = 0; i < countries.length; i++) {
//			
//			String country = countries[i].getCountry();
//			char firstChar = country.charAt(0);
//			
//			if (firstChar == 'K') {
//				totK++;
//			}
//		}
//		System.out.print(totK + " länder börjar på bokstaven 'K'");
	
//deluppgift7
		
//		int counter = 0, index = 0;
//		long inhabitants;
//		//räkna ut hur många länder som har mellan 10M och 12M invånare för att få rätt storlek på den nya arrayen
//		for (int i = 0; i < countries.length; i++) {							
//			inhabitants = countries[i].getPopulation();
//			if ( ( inhabitants >= 10000000 ) && ( inhabitants <= 12000000 )) {
//				counter++;
//			}
//		}
//		//skapa en ny array med rätt storlek counter
//		Population[] newArray = new Population[ counter ];
//		
//		//kolla igenom alla igen. Om inv mellan 10-12M så lagras samma populationObjekt i den nya arreyen
//		for( int i = 0; i < countries.length; i++ ) { 
//			inhabitants = countries[ i ].getPopulation();
//			if( ( inhabitants >= 10000000 ) && ( inhabitants <= 12000000 ) ) { 
//				newArray[ index ] = countries[ i ]; 
//				index++; 
//			} 
//		}
//		//skriver ut nya arrayen
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.println( newArray[i] );
//		}
//		
//deluppgift8
		
//		int totK = 0, index = 0;
//		String country;
//		char firstChar;
//		
//		//räkna hur många som börjar på K för att skapa en ny array med rätt storlek
//		for (int i = 0; i < countries.length; i++) {
//			
//			country = countries[i].getCountry();
//			firstChar = country.charAt(0);
//			
//			if (firstChar == 'K') {
//				totK++;
//			}
//		}
//		//skapa en nya array med rätt storlek
//		Population[] newArray = new Population[totK];
//		
//		//lagra alla objekt som börjar på K i den nya arrayen
//		for( int i = 0; i < countries.length; i++ ) {
//			country = countries[i].getCountry();
//			firstChar = country.charAt(0);
//			
//			if (firstChar == 'K') {
//				newArray[index] = countries[i];
//				index++;			
//			}
//		}
//		//skriv ut nya arreyen
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.println( newArray[i] );
//		}
		
//deluppgift9
		
//		for( Population pop : countries) {
//			System.out.println(pop.getCountry());
//		}
	
//deluppgift10
		
		int tot = 0;
		long inhabitants;
		for ( Population pop : countries  ) {
			inhabitants = pop.getPopulation();
			if ( inhabitants < 1000000) {
				tot++;
			}
		}
		System.out.print( tot + " länder har mindre än 1 miljon invånare" );
	
		
		
		
	}

	public static void main(String[] args) {
		Exercise20a e20a = new Exercise20a();
		e20a.program();
	}
}