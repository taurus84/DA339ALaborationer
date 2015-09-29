package MyPrograms;

import java.util.Random;

/**
 * Klassen har metoder för att skapa en endimensionell int-array med
 * 10 slumpade tal mellan 1-20. Inget tal förekommer 2 gånger
 * @author David
 *
 */
public class ArrayInt10 {

	private Random rand = new Random();
		
	public int[] fillArray() {
	
		int[] numbers = new int[10];
		int nbr;
		
		for (int i = 0; i < numbers.length; i++) {
			do {
				nbr = rand.nextInt(20) + 1;
			} while (checker(nbr, numbers));
			numbers[i] = nbr;
		}
		return numbers;
	}	
	
	public static boolean checker(int nbr, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (nbr == array[i]) {
				return true;
			}
			
		}
		return false;
	}
	
	public void toString(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
	
	public static void main (String [] args) {
		ArrayInt10 p = new ArrayInt10();
		int [] arr = p.fillArray();
		p.toString(arr);
	}
}
