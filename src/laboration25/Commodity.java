package laboration25;

/**
 * Klassen Commodity representerar en vara i en butik.
 * 
 * @author David Tran
 * Datum: 2014-12-15
 *
 */
public class Commodity {
    private String name;
    private String category;
    private int quantity;
    private double price;
    
    /**
     * Konstruerar och initialiserar en vara med name="", category="", 
     * quantity=0 och price=0.0.
     */
    public Commodity() {
    	this.name = "";
    	this.category = "";
    }
    
    /**
    * Konstruerar och initialiserar en vara med angivna värden. * @param name varans namn
    * @param category varans kategori
    * @param quantity antal varor på lagret
    * @param price varans pris
    */
    public Commodity(String name, String category, int quantity, double price) {
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}

    /**
     * Returnerar varans namn.
     * @return varans namn
     */
	public String getName() {
		return this.name;
	}

	/**
	 * Sätter namnet på varan.
	 * @param name namnet på varan
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returnerar varans kategori
	 * @return category varans kategori
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * Anger vilken kategori varan tilllhör
	 * @param category varans kategori
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Returnerar varans pris
	 * @return price varans pris
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sätter priset på varan
	 * @param price varans pris
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Ändrar antalet varor i lager. Ett positivt värde ökar antalet varor (inköp)
	 * och ett negativt värde minskar antalet varor (försäljning)
	 * @param change förändring av antalet varor
	 * @return antal varor i lager efter förändring
	 */
	public int changeQuantity(int change) {
		quantity += change;
		return this.quantity;
	}

	/**
	 * Skriver ut information om varan
	 */
	public void info() {
        System.out.println(this.name + ", " + this.category + "\n" +
                           "Antal i lager: " + this.quantity + "\n" +
                           "Pris: " + this.price + " kr");
    }
}
