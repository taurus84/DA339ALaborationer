package helper;

public class Exempel {
	public static void main(String[] args) {
		// Slumpa ett tal i ett givet intervall
		System.out.println("Slumptal i intervallet -3 - 3: " + HelperClass.nextIntInterval(-3, 3));

		// Slumpa ett tal i mellan 0 och givet tal (inkluderat)
		System.out.println("Slumptal i intervallet 0 - 500: " + HelperClass.nextInt(500));

		// Konvertering av String till int med felhantering
		System.out.println("Konverterad String till int: " + HelperClass.tryParseInt("2514"));

		// Inmatning av heltal från användaren med felhantering
		int nbr = HelperClass.tryParseIntDialog("Ange ett heltal", false);
		System.out.println("Konverterad String till int via inmatning: " + nbr);

		// Inmatning av heltal (begränsat till positiva tal) från användaren med felhantering
		int nbr2 = HelperClass.tryParseIntDialog("Ange ett heltal", true);
		System.out.println("Konverterad String till int via inmatning: " + nbr2);
	}
}
