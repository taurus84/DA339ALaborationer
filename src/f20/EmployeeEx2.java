package f20;
import javax.swing.*;

public class EmployeeEx2 {
    
    public void createEmployeeObjects(Employee[] employees) {
        String name;
        double wage;
        
        for(int i=0; i<employees.length; i++) {
            name = JOptionPane.showInputDialog( "Ange namn på anställd " + (i+1) + ": " );
            wage = Integer.parseInt( JOptionPane.showInputDialog( "Ange lön för " + name ) );
            employees[i] = new Employee(name,wage);
        }
    }
    
    public void statistics(Employee[] employees) {
        double sum = 0, min = Double.MAX_VALUE, max = 0, wage;
        String res;
        
        for(Employee emp : employees) {
            wage = emp.getWage();
            sum = sum + wage;
            if(wage>max) {
                max = wage;
            }
            if(wage<min) {
                min = wage;
            }
        }
        
        res = "LÖNESTATISTIK\n"+
                "Totalt löner: "+sum+" kr\n"+
                "Lägsta lön:   "+min+" kr\n"+
                "Högsta lön:   "+max+" kr";
        JOptionPane.showMessageDialog( null, res );
    }
    
    public void wageIncrease( Employee[ ] employees, double increase) {
        double newWage;
        for( Employee emp : employees) {
            newWage = emp.getWage() + increase;
            emp.setWage(newWage);
        }
    }
    
    public void action() {
        Employee[] employees;
        int count;
        
        count = Integer.parseInt( JOptionPane.showInputDialog("Hur många anställda ska registreras?") );
        count = Math.max( count ,0);  // count >= 0
        employees = new Employee[count];
        createEmployeeObjects(employees);
        statistics(employees);
        wageIncrease(employees, 100);
        statistics(employees);
    }
    
    public static void main(String[] args) {
        EmployeeEx2 prog = new EmployeeEx2();
        prog.action();
    }
}
