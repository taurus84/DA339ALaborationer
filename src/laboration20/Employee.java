package laboration20;

public class Employee implements Comparable{
	private String name;
	private String employer;
	private double wage;

	public Employee(String name, String employer, double wage) {
		this.name = name;
		this.employer = employer;
		this.wage = wage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void setWage(double wage) {

		this.wage = wage;
	}

	public String getName() {
		return this.name;
	}

	public String getEmployer() {
		return this.employer;
	}

	public double getWage() {
		return this.wage;
	}

	public String toString() {
		return "EMPLOYEE: name = " + this.name + ", employer = "
				+ this.employer + ", wage = " + this.wage;
	}

	public int compareTo(Object o) {
		String name;
		Employee e = (Employee) o;
		name = e.getName();
		return this.name.compareTo(name);
	}
}