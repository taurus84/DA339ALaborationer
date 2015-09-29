package arrays;

import java.util.Arrays;

/**
 * Klassen innehåller 9 olika klassmetoder som kan användas för arrayer som är endimensionella och innehåller heltal. 
 * David Tran 14 nov 2014
 **/
public class IntegerArrays {

	/*
	 * metoden returnerar en sträng med som visar arrayen
	 */
	
	public static String toString(int[] array) {
		
		String str = "";
		
		for ( int i = 0; i < array.length; i++ ) {				//går igenom arrayen
		
			if ( i == 0 ) {									
				str += ( "{" + array[i] + "," );				//en startparantes innan första elementet
			}
			else if ( i == array.length - 1) {					//en slutparantes efter sista elementet
				str += array[i] + "}";
			}
			else  {
				str += array[i] + ",";							//kommatecken mellan elementen
			}
		}
		return str ;											//returnerar en sträng
	}
	
	/*
	 * metoden går igenom en array och returnerar det största värdet i arrayen
	 */
	public static int max(int[] array) {
		
		//förutsätter att 'max' är 0 i starten
		int max = 0;								
	
		//går igenom arrayen med en förenklad for-loop
		//om elementet är större än vårt 'max' så läggs det värdet in i 'max'
		for ( int elem : array ) {						
			if ( elem > max ) {								
				max = elem;
			}
		}
		return max;							
	}
	
	/*
	 * metoden går igenom en array och returnerar det minsta värdet i arrayen 
	 */
	public static double min(int[] array) {
		
		//ger min det största värdet tillåtet för en double
		double min = Double.MAX_VALUE;
		
		//går igenom arrayen med en förenklad for-loop
		//om elementet är mindre än vårt 'min' så läggs det värdet in i 'min'
		for ( int elem : array ) {
			if ( elem < min ) {
				min = elem;
			}
		}
		return min;
	}
	
	/*
	 * metoden summerar alla elementen i arrayen
	 */
	public static int sum(int[] array) {
		
		//initierar 'sum' till 0
		int sum = 0;
		
		//går igenom loopen och addarar elementen till 'sum'
		for ( int elem : array) {
			sum += elem;
		}
		return sum;
	}
	
	/*
	 * metoden räknar ihop elementen i en array och returnerar genomsnittet
	 */
	public static double average(int[] array) {
		
		//initierar 'sum' och 'ave'
		double sum = 0, ave = 0;
		
		//går igenom arrayen och adderar elementen till 'sum'
		for ( int elem : array ) {
			sum += elem;
		}
		
		//räknar ut genomsnittet 'ave' genom att dividera 'sum' med antal element i arrayen
		ave = sum / array.length;
		return ave;
	}
	
	/*
	 * metoden returnerar gappet mellan största och minsta värdet i arrayen
	 */
	public static double range(int[] array) {
		
		//initierar variabler
		double min = Double.MAX_VALUE;
		double max = 0;
		double range;
		
		//går igenom array
		//om elementvärdet är större än 'max' läggs det till i 'max'. Om det är mindre än 'min' så läggs det till i 'min'
		for ( int elem : array ) {
			if ( elem > max) {
				max = elem;
			} else if ( elem < min ) {
				min = elem;
			}
				
		}
		
		//räknar ut gappet och returnerar det
		range = max - min;
		return range;
		
	}
	
	/*
	 * metoden sortetar arrayen från lägsta till högsta
	 */
	public static void sortAsc(int[] array) {
		Arrays.sort(array);
			
	}
	
	/*
	 * metoden sorterar arrayen från högt till lågt
	 */
	public static void sortDesc(int[] array) {
		
		//går igenom arrayen och multiplicerar alla element med -1
		for ( int i = 0; i < array.length; i++ ) {
			array[i] = array[i] * -1;
		}
		//sorterar arrayen från lågt till högt
		Arrays.sort(array);
		
		//går igenom arrayen igen och multiplicerar alla element med -1
		for ( int i = 0; i < array.length; i++ ) {
			array[i] = array[i] * -1;
		}
		
	}

	/*
	 * metoden skapar en ny array och kopierar en array in i den nya, och returnerar sedan den nya arrayen
	 */	
	public static int[] copy(int[] array) {
		
		//skapar en ny array med samma kapacitet 
		int[] newArray = new int[array.length];
		
		//går igenom den existerande arrayen och för över elementen till den nya arrayen med samma index
		int index = 0;
		for ( int i = 0; i < array.length; i++ ) {
			newArray[index] = array[i];
			index++;
		}
		return newArray;
		
	}
}
