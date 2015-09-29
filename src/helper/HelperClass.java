package helper;

import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

/***
 * Denna klass är avsedd som en hjälpfil. Ni får gärna komma med kommentarer om förbättringar/felstavning/grammatikfel
 * eller förslag om fler metoder som ni vill att jag ska lägga till. Har ni en annan lösning på en av metoderna nedan så
 * visa mig den, då kan vi diskutera skillnaderna och annat. Denna fil kommer att uppdateras ofta och laddas upp på
 * nätet så håll koll på versionnummret för att ha det senaste. Skulle något vara oklart så maila mig gärna, adressen
 * finns nedan. <br>
 * <br>
 * <b>Exempel på användning:</b> <br>
 * <b>OBS!</b> HelperClass kan <b>inte</b> instansieras eftersom den är en <u>abstrakt klass</u>. Med andra ord så kan
 * man <b>inte</b> använda den så här:
 * 
 * <pre>
 * {@code
 * import helper.HelperClass; // Måste importeras innan användning
 * 
 * HelperClass hc = new HelperClass();
 * int i = hc.nextIntInterval(-12, 50);
 * }
 * </pre>
 * 
 * Däremot så är detta korrekt användning av HelperClass:
 * 
 * <pre>
 * {@code
 * import helper.HelperClass; // Måste importeras innan användning
 * 
 * int i = HelperClass.nextIntInterval(-12, 50);
 * }
 * </pre>
 * 
 * @author Nadim Dahdouli <<a href="mailto:nadim.dahdouli@gmail.com">nadim.dahdouli@gmail.com</a>>
 * @version 1.2.1
 * @since 2014-10-01
 */
public abstract class HelperClass {

	/***
	 * Returnerar ett heltal i ett specificerat intervall. De specificerade värden kan anta både negativa och positiva
	 * heltal
	 * 
	 * @param min
	 *            - heltal (inkluderat)
	 * @param max
	 *            - heltal (inkluderat)
	 * @return ett heltal i specificerat intervall
	 * @since 1.0.0
	 */
	public static int nextIntInterval(int min, int max) {
		if (min < max) {
			if (min < 0) {
				if (Math.abs(min) == Math.abs(max))
					return nextInt(max * 2) - Math.abs(min);
				else
					return nextInt(Math.abs(min) + max) - Math.abs(min);

			} else
				return nextInt(max - min) + min;
		}
		return 0;
	}

	/***
	 * Returnerar ett heltal mellan 0 och specificerat värde (inkluderat). Det specificerade värdet måste vara ett
	 * positivt heltal.
	 * 
	 * @param bound
	 *            - Ett positivt heltal
	 * @throws IllegalArgumentException
	 *             om specificerat värde är negativ
	 * @return ett värde mellan 0 och specificerat värde (inkluderat)
	 * @since 1.0.0
	 */
	public static int nextInt(int bound) {
		if (bound < 0)
			throw new IllegalArgumentException("Specificerat värde måste vara positiv");

		Random r = new Random();
		return r.nextInt(bound + 1);
	}

	/***
	 * Gör om en sträng till ett heltal med felhantering.
	 * 
	 * @param s
	 *            - sträng som ska göras om till ett heltal
	 * @throws NumberFormatException
	 *             om inmatningen är annat än heltal
	 * @return heltal från sträng
	 * @since 1.0.0
	 */
	public static int tryParseInt(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return i;
	}

	/***
	 * En loop som visar ett meddelande till användaren. Loopen körs tills att användaren har matat in ett korrekt värde
	 * vilket måste uppfylla följande krav, inmatning måste vara ett heltal och om parametern onlyPositive är true så
	 * måste talet vara like med eller större än 0, är den false så är alla heltal tillåtna
	 * 
	 * @param message
	 *            - meddlande som ska visas till användaren
	 * @param onlyPositive
	 *            - bestämmer om inmatningen bara får vara ett positivt heltal om det är true, är det false så får det
	 *            vara både positivt och negativt heltal
	 * @throws NumberFormatException
	 *             om inmatningen är annat än ett heltal
	 * @return korrekt inmatning från användaren returneras av typen {@link Integer}
	 * @since 1.0.0
	 */
	public static int tryParseIntDialog(String message, boolean onlyPositive) {
		int i = 0;
		while (true) {
			try {
				i = Integer.parseInt(JOptionPane.showInputDialog(message));
				if (onlyPositive && i < 0) {
					JOptionPane.showMessageDialog(null, "Vänligen ange ett positivt heltal");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				if (e.getMessage() == "null")
					break;
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Vänligen ange ett heltal");
			}
		}
		return i;
	}

	/***
	 * Metoden returnerar ett datum eller tid efter specificerat format. Giltiga format finns <a
	 * href="http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html">här</a>
	 * 
	 * <pre>
	 * Anta att idag är den 23 oktober 2014, kl: 15:41:24
	 * Då ger format
	 *  * HH:mm:ss => 15:41:24
	 *  * yyyy-MM-dd => 2014-10-23
	 *  * yyyy-MM-dd HH:mm:ss => 2014-10-23 15:41:24
	 * </pre>
	 * 
	 * @param format
	 *            - formatet som beskriver datum och tid
	 * @throws NullPointerException
	 *             om formatet är null
	 * @throws IllegalArgumentException
	 *             om specificerat format är fel
	 * @return datum eller tid efter specificerat format som {@link String}
	 * @since 1.2.0
	 */
	public static String getDateTime(String format) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(c.getTime());
	}

	/***
	 * Metoden returnerar det specificerade datumet efter specificerade formatet. Giltiga format finns <a
	 * href="http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html">här</a>
	 * 
	 * <pre>
	 * Anta att idag är den 23 oktober 2014, kl: 15:41:24
	 * Då ger format
	 *  * HH:mm:ss => 15:41:24
	 *  * yyyy-MM-dd => 2014-10-23
	 *  * yyyy-MM-dd HH:mm:ss => 2014-10-23 15:41:24
	 * </pre>
	 * 
	 * För att formatera ett specifikt datum eller tid så måste vi använda oss av Calendar klassen, ex:
	 * 
	 * <pre>
	 * Anta att vi vill formatera den 23 oktober 2014, kl: 15:41:24 med 
	 * formatet yyyy-MM-dd HH:mm:ss
	 * Då gör vi såhär
	 * 
	 * {@code
	 * // Skapa ett Calendar objekt
	 * Calendar cal = Calendar.getInstance();
	 * // Sätt ett datum
	 * cal.set(2014, 10, 23, 15, 41, 24);
	 * // Anropa formatDateTime(format, datum)
	 * HelperClass.formatDateTime("yyyy-MM-dd HH:mm:ss", cal.getTime()); 
	 * 
	 * Utskrift blir: 2014-10-23 15:41:24
	 * }
	 * </pre>
	 * 
	 * @param format
	 *            - formatet som beskriver datum och tid
	 * @param date
	 *            - datum eller tid som ska formateras
	 * @throws NullPointerException
	 *             om formatet är null
	 * @throws IllegalArgumentException
	 *             om specificerat format är fel
	 * @return datum eller tid efter specificerat format som {@link String}
	 * @since 1.2.0
	 */
	public static String formatDateTime(String format, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/***
	 * Slumpar en färg
	 * 
	 * @return den slumpade färgen av typen {@link Color}
	 * @since 1.1.0
	 */
	public static Color randomColor() {
		return new Color(nextInt(255), nextInt(255), nextInt(255));
	}

	/***
	 * Metoden returnerar fönstrets inre bredd, alltså fönstrets ram exkluderas
	 * 
	 * @param pw
	 *            - PaintWindow-objekt
	 * @return fönstrets inre bredd som en {@link Integer}
	 * @since 1.0.0
	 */
	public static int innerWindowWidth(PaintWindow pw) {
		return pw.getBackgroundWidth();
	}

	/***
	 * Metoden returnerar fönstrets inre höjd, alltså fönstrets ram exkluderas
	 * 
	 * @param pw
	 *            - PaintWindow-objekt
	 * @return fönstrets inre höjd som en {@link Integer}
	 * @since 1.0.0
	 */
	public static int innerWindowHeight(PaintWindow pw) {
		return pw.getBackgroundHeight();
	}

	/***
	 * Metoden returnerar fönstrets yttre bredd, alltså fönstrets ram inkluderas
	 * 
	 * @param pw
	 *            - PaintWindow-objekt
	 * @return fönstrets yttre bredd som en {@link Integer}
	 * @since 1.0.0
	 */
	public static int outerWindowWidth(PaintWindow pw) {
		return pw.getWidth();
	}

	/***
	 * Metoden returnerar fönstrets yttre höjd, alltså fönstrets ram inkluderas
	 * 
	 * @param pw
	 *            - PaintWindow-objekt
	 * @return fönstrets yttre höjd som en {@link Integer}
	 * @since 1.0.0
	 */
	public static int outerWindowHeight(PaintWindow pw) {
		return pw.getHeight();
	}

	/***
	 * Metoden returnerar fönstrets yttre dimensioner, alltså fönstrets ram inkluderas
	 * 
	 * @param pw
	 *            - PaintWindow-objekt
	 * @return fönstrets yttre dimensioner som ett {@link Dimension}-objekt
	 * @since 1.0.0
	 */
	public static Dimension outerWindowSize(PaintWindow pw) {
		return pw.getSize();
	}

	/***
	 * Metoden returnerar fönstrets inre dimensioner, alltså fönstrets ram exkluderas
	 * 
	 * @param pw
	 *            - PaintWindow-objekt
	 * @return fönstrets inre dimensioner som ett {@link Dimension}-objekt
	 * @since 1.0.0
	 */
	public static Dimension innerWindowSize(PaintWindow pw) {
		return new Dimension(innerWindowWidth(pw), innerWindowHeight(pw));
	}

}
