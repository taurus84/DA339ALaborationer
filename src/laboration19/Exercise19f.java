package laboration19;

import javax.swing.JOptionPane;

public class Exercise19f {
	
	
	/*
	 * metod för att fylla arrayen med tal som användaren får mata in	
	 */
	public void inputNumbers (int array[]) {
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(JOptionPane.showInputDialog("Antal heltal kvar att mata in: " + (10-i)));					
			}
	}
	/*
	 * metod för att skriva ut talen i array 
	 */
	public void printNumbers(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
		
			if (i == array.length - 1) {
				System.out.print( array[i]);
			}
			else
				System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
	/*
	 * metod för att skriva ut vartannat tal i arrayen
	 */
	public void printEverySecond(int[] array) {
		for ( int i = 0; i < array.length; i += 2) {
			if ( (i - array.length) >= (-2)) {						//rätta till!
				System.out.print(array[i]);
			}
			else
				System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
	/*
	 * metod för att skriva ut talen baklänges från en array
	 */
	public void reverse(int[] numbers) {
			for ( int i = (numbers.length - 1) ; i >= 0; i--) {
			if ( i == 0) {
				System.out.print(numbers[i]);
			} else
			System.out.print(numbers[i] + ", ");
			}
		System.out.println();
	}

	//12 5 8 2 3 3 3 11 221 7:
	
	
	/*
	 * main metod
	 * skapa en instans av klassen
	 * skapa en array med storlek (10)
	 * instansen kör metoderna med arrayen som parameter
	 */
	public static void main (String [] args) {
		Exercise19f gogo = new Exercise19f();
		int[] numbers = new int[10];
		gogo.inputNumbers(numbers);
		gogo.printNumbers(numbers);
		gogo.printEverySecond(numbers);
		gogo.reverse(numbers);
		
	}
}
