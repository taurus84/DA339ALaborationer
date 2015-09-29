package laboration19;

public class Exercise19e {

	public int member(int nbr, int[] array) {
		
		int pos = (-1);
		for ( int i = 0; i < array.length; i++) {
			if ( array[i] == nbr) {
				pos = i;
				break;
			}
			
		}
		return pos;
	}
	
	
	
	
	public static void main ( String [] args) {
	Exercise19e e19e = new Exercise19e();
	int[] array = { 1, 2, 3, 9, 5, 9 };
	int index;
	index = e19e.member( 7, array ); 
	System.out.println( "Position för 7: " + index ); 
	index = e19e.member( 9, array ); 
	System.out.println( "Position för 9: " + index );
	}
}
