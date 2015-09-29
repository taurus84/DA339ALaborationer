package f20;
import java.util.Random;

import javax.swing.*;

public class Array2Dim {

	public void print2DimArray(int[][] arr, int width) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%" + width + "d", arr[row][col]);
			}
			System.out.println();
		}
	}

	public void print2DimArray(double[][] arr, int width, int dec) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%" + width + "." + dec + "f", arr[row][col]);
			}
			System.out.println();
		}
//		for(double[] row : arr) {
//			for(double elem : row) {
//				System.out.printf("%" + width + "." + dec + "f", elem);
//			}
//			System.out.println();
//		}
	}

	public void example() {
	    Random random = new Random();
		int[][] rainfall = { { 11, 14, 18, 14, 12, 10, 5 },
				             { 0, 1, 0, 0, 23, 37, 45 }, 
				             { 42, 11, 26, 0, 0, 6, 0 },
				             { 11, 0, 0, 0, 0, 3, 0 } };
		double[][] temperature = new double[4][7];

		for (int week = 0; week < temperature.length; week++) {
			for (int day = 0; day < temperature[week].length; day++) {
				temperature[week][day] = random.nextDouble()*10 + 10;
			}
		}
		
		System.out.println();
		System.out.println("NEDERBÖRD");
		print2DimArray(rainfall, 8);
		System.out.println();
		System.out.println("TEMPERATUR");
		print2DimArray(temperature, 8, 2);
	}

	public static void main(String[] args) {
		Array2Dim prog = new Array2Dim();
		prog.example();
	}
}
