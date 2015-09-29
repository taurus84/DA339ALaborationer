package f20;

public class Sum2d {	
	public static long sum1(long[][] array) {
		long sum = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}
	//-------------------------------------------------------
	public static long sum2(long[][] array) {
		long sum = 0;
		for(long[] arr : array) {
			for(long elem : arr) {
				sum += elem;
			}
		}
		return sum;
	}
	//-------------------------------------------------------
	private static long sum(long[] array) {
		long sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static long sum3(long[][] array) {
		long sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += sum(array[i]);
		}
		return sum;
	}
	
	public static long sum4(long[][] array) {
		long sum = 0;
		for(long[] arr : array) {
			sum += sum(arr);
		}
		return sum;
	}
	//-------------------------------------------------------
	
	public static void main(String[] args) {
		long[][] numbers = {{1,2,3},{2,1},{3,3,6,4,1}};
		System.out.println(Sum2d.sum1(numbers));
		System.out.println(Sum2d.sum2(numbers));
		System.out.println(Sum2d.sum3(numbers));
		System.out.println(Sum2d.sum4(numbers));
	}
}
