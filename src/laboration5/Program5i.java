package laboration5;

import javax.swing.JOptionPane;

public class Program5i {
	
	public void namn (){
		
		String name, forname, aftername, message;
		int index;
		char ini1, ini2;
		
		name = JOptionPane.showInputDialog("Mata in förnamn och efternamn");
		
		index = name.indexOf(' ');
		forname = name.substring(0,index);
		aftername = name.substring(index+1);
		ini1 = name.charAt(0);
		ini2 = name.charAt(index + 1);
		
		
		message = ("Ditt namn: " + name + "\nDitt förnamn: " + forname + "\nDitt efternamn: " + aftername + "\nDina initialer: "
				+ ini1 + ini2);
		
		JOptionPane.showMessageDialog(null, message);
		
		
		
	}
	
	public static void main(String[] args) {
		Program5i supermannen = new Program5i ();
		supermannen.namn();
		
		
	}

	

}
 