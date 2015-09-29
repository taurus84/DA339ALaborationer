package laboration20;
import MyPrograms.ArrayInt10;

import java.lang.*;
import java.util.Random;
import java.util.Arrays;

public class Exercise20h {
	
	
	int[] numbers = new int[10];
	private int nbr;
	Random rand = new Random();
	
	public int[] fillArray() {
		for (int i = 0; i < numbers.length; i++) {
			do {
				nbr = rand.nextInt(101) + 100; 
			} while (ArrayInt10.checker(nbr, numbers));
			numbers[i] = nbr;
		}
		return numbers;
	}
	
	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private int[] swap(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * (-1);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * (-1);
		}
		return arr;
	}
	
	
	
	public static void main (String[] args) {
		Exercise20h prog = new Exercise20h();
		int[] array = prog.fillArray();
		prog.printArray(array);
		Arrays.sort(array);
		prog.printArray(array);
		prog.swap(array);
		prog.printArray(array);
	}
	
}
		
		
		
		
		
		
	
	
