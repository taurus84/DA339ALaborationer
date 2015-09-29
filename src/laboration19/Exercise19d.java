package laboration19;

public class Exercise19d {

	public void reverse(int[] numbers) {

		for ( int i = (numbers.length - 1) ; i >= 0; i--) {
			if ( i == 0) {
				System.out.print(numbers[i]);
			}
			else
			System.out.print(numbers[i] + ", ");
			
		}
		
		
	}

	public static void main(String[] args) {
		Exercise19d e19d = new Exercise19d();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1000, 100, 10, 1 };
		System.out.print("Array 1 baklänges: ");
		e19d.reverse(arr1);
		System.out.println();
		System.out.print("Array 2 baklänges: ");
		e19d.reverse(arr2);
		System.out.println();
	}
}
