package p3;

import javax.swing.ImageIcon;

public class SSPController {

	private SSPViewer viewer = new SSPViewer();
	private SSPPlayer computerPlayer = new SSPPlayer();
	private SSPUserInput userInput;						//???
	
	private int pointH;
	private int pointC;
	private int humC;
	private int comC;
	
	public SSPController(SSPPlayer inComputerPlayer, SSPViewer inViewer) {
		this.computerPlayer = inComputerPlayer;
		this.viewer = inViewer;
		
		
	}
	
	/*
	 * metoden startar nytt spel. sätter poängen till 0 på human och computer
	 */
	public void newGame() {
		viewer.setHPoints(0);
		viewer.setCPoints(0);
		viewer.setToppText("Först till 3 vinner!");
		this.pointH = 0;
		this.pointC = 0;
		viewer.startPics();
		userInput.enableButtons();
	}
	/*
	 * metoden ska avsluta spelet genom att skriva ut en vinnare
	 */
	public void finish() {
		if (pointH > pointC) {
			viewer.setToppText("Du vann över datorn!");			//skriv ut vinnare genom att hitta vinnare mha get metoder
			viewer.setWinner(0);
			userInput.disableButtons();;
		} else if (pointH < pointC) {
			viewer.setToppText("Datorn vann!!");
			viewer.setWinner(1);
			userInput.disableButtons();
		}
	}
	/*
	 * metoden anropas när användaren klickar på ett av valen, hämtar sedan ett val för datorn och 
	 * anropar metoden pointCounter som ser vem som vann rundan
	 */
	public void newChoice(int hc) {
		viewer.setHChoice(hc);
		this.humC = hc;
		this.comC = computerPlayer.getComChoice();
		viewer.setCChoice(comC);
		pointCounter();
				
	}
	/*
	 * metoden kollar vem som vann denna rundan och ger vinnaren poäng som syns i rutan.
	 * kikar också på om någon har 3 poäng och anropar då metoden finish som avslutar spelet. 
	 */
	public void pointCounter() {
		if (humC == 0) {
			if (comC == 1) {
				this.pointH++;
			} else if (comC == 2) {
				this.pointC++;
			}		
		}
		if (humC == 1) {
			if (comC == 2) {
				this.pointH++;
			} else if (comC == 0) {
				this.pointC++;
			}
		}
		if (humC == 2) {
			if (comC == 0) {
				this.pointH++;
			} else if (comC == 1) {
				this.pointC++;
			}
		}
		viewer.setHPoints(this.pointH);
		viewer.setCPoints(this.pointC);
		if (pointH == 3 || pointC == 3) {
			finish();
		}
		
	}

	public void setUserInput(SSPUserInput userInput) {
		this.userInput = userInput;
		
	}
	
	
	
}
