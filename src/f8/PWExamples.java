package f8;
import java.awt.Color;
import javax.swing.JOptionPane;

public class PWExamples {

    // for-loop
    public void rectangles() {
    	PaintWindow window = new PaintWindow();
    	int rows = 3, cols = 5;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                window.fillRect(50 + row * 100, 50 + col * 70, 90, 60, Color.MAGENTA);
            }
        }
    }
    
    // n st blå vertikala linjer
    public void verticalLines() {
    	PaintWindow window = new PaintWindow();
        int distance = 20, n = 10;
        for(int i=0; i<n; i++) {
            window.line(i*distance, 100, i*distance, 300, Color.BLUE, 4);
        }
    }
    
    // n st blå horisontella linjer
    public void horizontalLines() {
    	PaintWindow window = new PaintWindow();
        int i=0, distance=10, n = 20;
        while(i<n) {
            window.line(0, i*distance, window.getBackgroundWidth(), i*distance, Color.RED, 3);
            i++;
        }
    }
    
    public void program() {
        String txt = "1. Rektanglar\n2. Vertikala linjer\n3. Horisontella linjer\n0. Avsluta"; 
        int choice = Integer.parseInt(JOptionPane.showInputDialog(txt));
        while(choice!=0) {
            switch(choice) {
                case 1 : rectangles();
                         break;
                case 2 : verticalLines();
                         break;
                case 3 : horizontalLines();
            }
            choice = Integer.parseInt(JOptionPane.showInputDialog(txt));
        }
        System.exit(0);
    }
        
    public static void main(String[] args) {
        PWExamples ex = new PWExamples();
        ex.program();
    }
}
