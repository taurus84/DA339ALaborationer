package f20;

public class Employee {
    private double wage;
    private String name;
    
    public Employee() {
        name = "Okänt namn";
        wage = 0;
    }
    public Employee(String inName, double inWage) {
        name = inName;
        wage = inWage;
    }
    
    public void setName(String inName) {
        name = inName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setWage(double inWage) {
        wage = inWage;
    }
    
    public double getWage() {
        return wage;
    }
    
    public String toString() {
        return "Namn: "+name+", Lön: "+Math.round(wage);
    }
}
