package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {
	public static void main(String[]args) {
		
		String heltallTxt = showInputDialog("Skriv inn heltall");
		int heltall = parseInt(heltallTxt); 
		
		int svar = 1;
		
		for(int i = 1; i <= heltall; i++) {
			svar = svar * i;
		}
		showMessageDialog(null, "n! =" + svar);
	}

}
