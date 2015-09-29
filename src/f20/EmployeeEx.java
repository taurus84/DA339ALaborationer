package f20;
import javax.swing.*;

public class EmployeeEx {
    
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
        
        for(int i=0; i<employees.length; i++) {
            wage = employees[i].getWage();
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
    
    public void action() {
        Employee[] employees;
        int count;
        
        count = Integer.parseInt( JOptionPane.showInputDialog("Hur många anställda ska registreras?") );
        count = Math.max( count ,0);  // count >= 0
        employees = new Employee[count];
        createEmployeeObjects(employees);
        statistics(employees);
    }
    
    public static void main(String[] args) {
        EmployeeEx prog = new EmployeeEx();
        prog.action();
    }
}
