package laboration19;

public class Exercise19c {
	
	public double sum(double[] array) {
		double tot = 0;
		for (double elem : array) {
			tot += elem;
			
		}
		return tot;
	}

	public int count8(double[] array) {
		int antal = 0;
		for ( double elem : array) {
			if ( elem > 8) {
				antal++;
			}
		}
		return antal;
	}

	public double sumNegative(double[] array) {
		double negSum = 0;
		for ( double elem : array) {
			if ( elem < 0 ) {
				negSum += elem;
			}
		}
		return negSum;
		
	}
	

	public void action() {
//		double[] numbers = { 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 };
		double[] numbers = { -1, 2, 5, 8, 11, 14, 10, 6, 2, -4 };
		double sum;
		System.out.println("Talens summa är " + sum(numbers));
		System.out.println("Antal tal större än 8: " + count8(numbers));
		sum = sumNegative(numbers);
		System.out.println("Summan av de negativa talen är: " + sum);
	}

	public static void main(String[] args) {
		Exercise19c e19c = new Exercise19c();
		e19c.action();
	}
}