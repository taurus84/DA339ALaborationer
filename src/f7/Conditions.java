package f7;
import javax.swing.JOptionPane;

public class Conditions {
    public void testMethod() {
    	int number = Integer.parseInt( JOptionPane.showInputDialog( "Ange ett tal" ) );
    	boolean res = false; // byt ut false mot villkor
    	
    	JOptionPane.showMessageDialog(null, "number=" + number + ", res=" + res);
    }
}



// if(number>67)
// if(number==3 || number==6 || number==7)
// if(number>=25 && number<=50)
// if(number%3 == 0)
// if(number<0 || number>10)
// if(number%4 != 0)
// if(number%10 == 7)
// if((number>=1 && number<=4) || (number>=7 && number<=9))
// if((number/100)%10 == 7)
