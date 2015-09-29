package laboration3;

import javax.swing.JOptionPane;

public class Program3b {
    
	
	public void info() {
    
		String name;
        int antal;
        
        name=JOptionPane.showInputDialog("Ange ditt namn");
        antal=Integer.parseInt(JOptionPane.showInputDialog("Ange antal Java-program som du har skrivit"));
        
        System.out.println("Hej mitt namn är "+name+".");
        System.out.println("Jag har skrivit "+antal+" program i Java.");
        System.out.println("Det är KUL med Java!!!.");       
            	
    }

    
    public static void main( String[] args ) {
        Program3b p3 = new Program3b();
        p3.info();
   
    }
}