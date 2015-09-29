package f16;
import javax.swing.*;

public class Controller {
    private Viewer viewer;
    
    public Controller( Viewer inViewer ) {
        this.viewer = inViewer;
    }
    
    private boolean isDouble( String realStr ) {
        int dotCount = 0, notDigit = 0, digit = 0;
        char ch;
        for( int i = 0; i < realStr.length(); i++ ) {
            ch = realStr.charAt( i );
            if( ch == '.' ) {
                dotCount++;
            }
            else if( (ch < '0') || (ch > '9') ) {
                notDigit++;
            } else {
                digit++;
            }
        }
        return (digit>0) && (notDigit == 0) && (dotCount < 2);
    }
    
    private boolean isOperation( String operStr ) {
        boolean res = false;
        char ch;
        if( operStr.length() == 1 ) {
            ch = operStr.charAt( 0 );
            res = (ch == '+') || (ch == '-') || (ch == '*') || (ch == '/');
        }
        return res;
    }
    
    public double calculate(double nbr1, double nbr2, char operation) {
        double res = 0;
        if (operation == '+') {
            res = nbr1 + nbr2;
        } else if (operation == '-') {
            res = nbr1 - nbr2;
        } else if (operation == '*') {
            res = nbr1 * nbr2;
        } else if (operation == '/') {
            res = nbr1 / nbr2;
        }
        return res;
    }
    
    public void newCalculation( String nbr1Str, String nbr2Str, String operation ) {
        double op1, op2, res;
        String txt;
        if( isDouble( nbr1Str ) && isDouble( nbr2Str ) && isOperation( operation ) ) {
            op1 = Double.parseDouble( nbr1Str );
            op2 = Double.parseDouble( nbr2Str );
            res = calculate(op1,op2, operation.charAt( 0 ));
            viewer.showResult( op1, op2, operation.charAt( 0 ), res );
        } else {
            txt = "Felaktig input!\nTal 1: " + nbr1Str + "\nTal2: " + nbr2Str +"\nRäknesätt: "+ operation;
            JOptionPane.showMessageDialog( null, txt);
        }
    }
}
