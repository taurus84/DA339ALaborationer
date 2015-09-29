package arrays;

public class ObjectArrays {
	
	/**
	 * Klassen innehåller 5 olika klassmetoder som kan användas för objekt-arrayer
	 * David Tran 14 nov 2014
	 */
	public static String toString(Object[] array) {
		
		/*
		 * metoden ska returnera en sträng som innehåller objekten i arrayen
		 */
		String str = "";
		
		for ( int i = 0; i < array.length; i++ ) {			//gå igenom arrayen
		
			if ( i == 0) {									//om index är 0 så är där en startparantes innan objektet
				str += "{" + array[i];
			}
			else if ( i == array.length - 1) {				//om index är det sista i arrayen så följer en slutparantes
				str += array[i] + "}";
			}
			else
				str += array[i] + ",";						//kommatecken mellan varje objekt
		}
		return str;
	}
	
	/*
	 * Metoden tar emot en objekt-array och ett jämförelseobjekt. Metoden går sedan igenom arrayen och kontrollerar om den innehåller ett objekt samma som 
	 * jämförelseobjektet. Metoden returnerar positionen där den hittades. Om elementet inte finns så returneras -1
	 */
	public static int indexOf(Object[] array, Object elem) {
	
		//initierar 'res' till -1. Om elementet inte finns så returneras detta värdet
		int res = -1;
		
		//går igenom arrayen och jämför element med vårt jämförelseobjekt. Hittas den så lagras positionen i 'res'
		for ( int i = 0; i < array.length; i++ ) {
			if ( elem.equals( array[i] ) ) {
				res = i;
			}
		}
		return res;
	
	}
	/*
	 * Metoden tar emot en objekt-array och ett jämförelseobjekt. Metoden går sedan igenom arrayen och kontrollerar om den innehåller ett objekt samma som 
	 * jämförelseobjektet. Om den finns returneras 'true', annars 'false'
	*/
	public static boolean member(Object[] array, Object elem) {
		
		//initerar 'bool', och vi förutsätter att objektet inte hittas.
		boolean bool = false;
		
		//går igenom arrayen. Jämför alla element med vårt objekt. Om den hittas ersätter vi 'bool' med 'true'
		for ( int i = 0; i < array.length; i++ ) {
			if ( elem.equals( array[i] )) {
			bool = true;
			}
		}
		return bool;
		
	}
	
	/*
	 * metoden ska jämföra alla objekt och returnera det största objektet i arrayen
	 */
	public static Object max(Object[] array) {
		
		//initierar 'res'. Vi förutsätter att största värdet finns i index 0.
		Object res = array[0];
		
		//'comp' blir objektet vi jämför 'res' med. 
		Comparable comp;
		
		//går igenom arrayen. comp får nytt värde varje element i arrayen. 
		for ( int i = 0; i < array.length; i++ ) {
			comp = (Comparable)array[i]; 
			
			//om comp är större än 'res' så ersätts 'res' med det elementet.  
			if(comp.compareTo( res ) > 0 ) {
				res = array[i];
			}
		}
		return res;
		
	}
	
	/*
	 * metoden ska jämföra alla objekt och returnera det minsta objektet i arrayen
	 */
	public static Object min(Object[] array) {
	
		//initierar 'res'. Vi förutsätter att minsta värdet finns i index 0.
		Object res = array[0];
		
		//'comp' blir objektet vi jämför 'res' med. 
		Comparable comp;
		
		//går igenom arrayen. comp får nytt värde varje element i arrayen. 
		for ( int i = 0; i < array.length; i++ ) {
			comp = (Comparable)array[i]; 
			
			//om comp är mindre än 'res' så ersätts 'res' med det elementet.  
			if(comp.compareTo( res ) < 0 ) {
				res = array[i];
			}
		}
		return res;
		
	}
}
