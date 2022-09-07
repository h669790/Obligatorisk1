package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {
	public static void main(String[]args) {
		
		for(int i = 0; i < 10; i++) {
			
			String karakter = "";
			
			String poengTxt = showInputDialog("Skriv din poengsum");
			int poeng = parseInt(poengTxt);
			
			if(poeng >= 0 && poeng <=39) {
			    karakter = "F";
			}else if(poeng >= 40 && poeng <= 49) {
				karakter = "E";
			}else if(poeng >= 50 && poeng <= 59) {
			    karakter = "D";
			}else if(poeng >= 60 && poeng <= 79) {
				 karakter = "C";
			}else if(poeng >= 80 && poeng <= 89) {
			     karakter = "B";
			}else if(poeng >= 90 && poeng <= 100) {
				 karakter = "A";
			}else{
			      showMessageDialog(null, "Du skreiv inn ugylding poengsum, prøv på nytt");
				  i--;
			}if(poeng >= 0 && poeng <= 100) {
				showMessageDialog(null, "karakter: " + karakter);
				System.out.println(karakter);
			}
		}
			
		}
			
	}
		


