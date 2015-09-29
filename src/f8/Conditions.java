package f8;
import java.util.Random;
import javax.swing.JOptionPane;

public class Conditions {
    public void testMethod() {
    	int number;
    	Random rand = new Random();
    	String resTrue = "true: ", resFalse = " false: "; 
    	
    	number = rand.nextInt(51);
    	if(true) {
    		resTrue += number + " ";
    	} else {
    		resFalse += number + " ";
    	}
    	JOptionPane.showMessageDialog(null, resTrue + "\n" + resFalse);
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
