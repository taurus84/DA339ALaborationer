package MyPrograms;

import javax.swing.JOptionPane;

/**
 * klassen låter användaren mata in sina betyg i 12 olika ämnen som är specificerade och 
 * få ut totalpoäng samt genomsnitt. 
 * @author David Tran
 *
 */
public class GradeReport {
	private String[] subjects = {"Matematik","Svenska","Engelska","Idrott","Bild","Fysik",
								"Biologi","Kemi","Historia","Geografi","Samhällskunskap","Religionskunskap"};
	private String[] grades = new String[subjects.length]; // Lika många element som ämnen
  
	/**
	 *  Låter användaren mata in betyget i olika ämnen
	 */
	public void setGrades() {
		
		for(int i = 0; i < subjects.length; i++) {
			String res = JOptionPane.showInputDialog("Betyg i " + subjects[i] + ". Ange 'IG' 'G' 'VG' eller 'MVG'");
			
			//kollar om användaren har skrivit in giltigt betyg, annars måste det matas in igen
			if (res.equals("IG") | res.equals("ig") | res.equals("G") | res.equals("g") |				
					res.equals("VG") | res.equals("vg") | res.equals("MVG") | res.equals("mvg")) {
				grades[i] = res;
			} else {
				JOptionPane.showMessageDialog(null, "Ogiligt värde! Prova igen");
				i--;
			}
		}
	}	
		
	public void statistics() {
		// Beräkna antalet "IG", "G", "VG" resp "MVG". Lagra t.ex. // beräkningarna i 4 olika räknare
		int[] betyg = new int[4];
		int totalPoints;
		double average;
		final int ig = 0, g = 10, vg = 15, mvg = 20; 
		
		for(int i = 0; i < grades.length; i++) {
			if (grades[i].equals("IG") | (grades[i].equals("ig"))) {
				betyg[0]++;
			} else if (grades[i].equals("G") | (grades[i].equals("g"))) {
				betyg[1]++;
			} else if (grades[i].equals("VG") | (grades[i].equals("vg"))) {
				betyg[2]++;
			} else if (grades[i].equals("MVG") | (grades[i].equals("mvg"))) {
				betyg[3]++;
			}
		}
		
		
		// Beräkna betygspoäng
		totalPoints = (betyg[0] * ig) + (betyg[1] * g) + (betyg[2] * vg) + (betyg[3] * mvg);
		average = (double)totalPoints / subjects.length;
		
		
		// Skriv ut betygsstatistik
		
//		System.out.printf("%-12s%-12s%s\n","Ämne","Betyg");
		System.out.printf("%-20s%s\n", "Ämne","Betyg");
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%-20s%s\n", subjects[i], grades[i]);
		}

		System.out.println("Antal IG: " + betyg[0]);
		System.out.println("Antal G: " + betyg[1]);
		System.out.println("Antal VG: " + betyg[2]);
		System.out.println("Antal MVG: " + betyg[3]);
		System.out.println("Din totala betygspoäng är: " + totalPoints);
		System.out.println("Genomsnittet per ämne är: " + String.format("%.1f", average));
		
	}
	
	public static void main(String[] args) {
    GradeReport prog = new GradeReport();
    prog.setGrades();
    prog.statistics();
	}
}