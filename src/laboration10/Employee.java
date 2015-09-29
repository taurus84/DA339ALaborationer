package laboration10;

public class Employee {
	private String name;
	private String employer;
	private double wage;
	
	public void setName(String name){
		this.name = name;
	}
	public void setEmployer(String employer){
		this.employer = employer;
	}
	public void setWage(double wage){
		this.wage = wage;
	}
	public void info(){
		System.out.print("Namn: " + this.name + "\nArbetar hos: " +
				this.employer + "\nLön: " + this.wage + " kr");
	}
}
