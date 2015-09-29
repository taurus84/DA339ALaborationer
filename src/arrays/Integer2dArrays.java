package arrays;


/**
 * Klassen innehåller 6 olika klassmetoder som kan användas för två-dimensionella arrayer som innehåller heltal. 
 * David Tran 14 nov 2014
 *
 */
public class Integer2dArrays {
	
	/*
	 * metoden returnerar en sträng med elementen i arrayen. 
	 */
	public static String toString(int[][] array) {
		
		String str = "";
		
		for ( int row = 0; row < array.length; row++ ) {					//nästlad loop för att gå igenom hela arrayen
			for ( int col = 0; col < array[row].length; col++ ) {
			
				if ( col == 0) {											//om det är första kolumnen ska str byggas med startparantes och ett kommatecken efter
					str += "{" + array[row][col] + ",";
				}
				else if ( col == array[row].length - 1) {					//om det är sista kolumnen .. fortsättning 4rader ner
					if ( row == array.length - 1) {							//om det är sista raden ska det vara en slutparantes
						str += array[row][col] + "}";
					}
					else {													//..ska det vara slutparantes och ett kommatecken, såvida det inte var sista raden
						str += array[row][col] + "},";
					}
				}
				else {
					str += array[row][col] + ",";							//om inget av det ovanståde så byggs 'str' med värdet i indexet följt av ett kommatecken.
				}
			}
			
		}
		return "{" + str + "}";												//returnerar strängen 'str'
		
	}
	
	/*
	 * metoden returnerar antalet element i en array
	 */
	public static int elements(int[][] array) {
		
		//initierar 'tot' till 0
		int tot = 0;
		
		//går igenom arreyen med en nästlad for-loop. För varje element vi tittar på i arrayen så ökar vi 'tot' med 1
		for (int row = 0; row < array.length; row++ ) {
			for ( int col = 0; col < array[row].length; col++ ) {
				tot++;
			}
		}
		return tot;
	}
	
	/*
	 * metoden returnerar det största värdet i arrayen
	 */	
	public static int max(int[][] array) {
		
		//initierar 'max' till 0
		int max = 0;
		
		//går igenom arrayen- Om elementet är större än 'max' så ersätter det 'max'. 
		for (int row = 0; row < array.length; row++ ) {
			for ( int col = 0; col < array[row].length; col++ ) {
				if ( array[row][col] > max ) {
					max = array[row][col];
				}
			}
		}
		return max;
	}
	
	/*
	 * metoden returnerar det minsta värdet i arrayen
	 */	
	public static double min(int[][] array) {
		
		//initierar 'min' till största talet tillåtet
		double min = Double.MAX_VALUE;
		
		//går igenom arrayen- Om elementet är mindre än 'min' så ersätter det 'min'. 
		for (int row = 0; row < array.length; row++ ) {
			for ( int col = 0; col < array[row].length; col++ ) {
				if ( array[row][col] < min ) {
					min = array[row][col];
				}
			}
		}
		return min;
	}
	
	/*
	 * metoden returnerar summan av alla element i arrayen
	 */
	public static int sum(int[][] array) {
		
		//initierar 'sum' till 0
		int sum = 0;
		
		//går igenom arrayen. Elementen adderas till 'sum'
		for (int row = 0; row < array.length; row++ ) {
			for ( int col = 0; col < array[row].length; col++ ) {
				sum += array[row][col];
			}
		}
		return sum;
	}
	
	/*
	 * metoden returnerar ett genomsnitt av alla element i arrayen
	 */
	public static double average(int[][] array) {
		
		//initierar variabler. 'tot' håller reda på hur många element som finns. 'sum' håller reda på summan av elementen. 
		double ave, tot = 0, sum = 0;
		
		//går igenom arrayen och adderar elementen till 'sum' och tot ökar med 1 för varje element
		for (int row = 0; row < array.length; row++ ) {
			for ( int col = 0; col < array[row].length; col++ ) {
				sum += array[row][col];
				tot++;
			}
		}
		
		//genomsnittet räknas ut genom att dividera summan med antal element
		ave = sum / tot;
		return ave;
	}

}
