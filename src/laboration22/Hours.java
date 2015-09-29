package laboration22;

public class Hours extends WageEmployee {
	
	private double hourlyWage;
	private double hours;
	
	public Hours ( long inId, double inHourlyWage ) {
		super(inId);
		this.hourlyWage = inHourlyWage;
	}
	
	public void setHourlyWage( double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public double getHourlyWage() {
		return this.hourlyWage;
	}
	
	public void setHours( double hours ) {
		this.hours = hours;
	}
		
	public double getHours() {
		return this.hours;
	}
	
	public double wage() {
		return this.hourlyWage * this.hours;
	}

	public static void main(String[] args) {
		Hours employee = new Hours( 17233534, 95.0 );
		employee.setHours( 128 );
		System.out.println( employee.toString() );
		System.out.println( "Anställd med id " + employee.getId() +
		" har arbetat " + employee.getHours() +
		" timmar till lönen " + employee.getHourlyWage() + " kr" );
		employee.setHourlyWage( 98.50 );
		System.out.println( "Lön denna månad: " + employee.wage() + " kr");
	}
}
