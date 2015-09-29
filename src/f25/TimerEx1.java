package f25;
import java.util.*; // TimerTask

public class TimerEx1 {
	private Timer timer;

	public TimerEx1() {
		timer = new Timer();
    	timer.schedule( new Counter(), 0, 1000 );
    	timer.schedule( new NewLine(), 10500, 3000 );
	}
	
	private class Counter extends TimerTask {
		private int counter = 0;
		
		public void run() {
			if (counter == 0)
				System.out.println("Counter startar");
			System.out.print(counter + " ");
			counter++;
		}
	}

    public static void main(String[] args) {
    	new TimerEx1();
    }
}


class NewLine extends TimerTask {
	public void run() {
		System.out.println();
	}
}

