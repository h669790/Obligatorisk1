package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO1 {
	public static void main(String[]args) {
		
		String bruttoTxt = showInputDialog("Skriv bruttoinntekt her: ");
		double brutto = parseInt(bruttoTxt);
		
		if(brutto >= 0 && brutto <= 190349) {
			System.out.println("Du betaler 0 Kr i Trinnskatt ");
		
		}else if(brutto >= 190350 && brutto <= 267899) {
			double trinn1 = (brutto / 100)* 1.7;
			System.out.println("Din trinnskatt er på " + trinn1 + "kr");
			
		}else if (brutto >= 267900 && brutto <= 643799) {
			double trinn2 = (brutto / 100)* 4.0;
			System.out.println("Din trinnskatt er på " + trinn2 +"kr");
		
		}else if (brutto >= 643800 && brutto <= 969199) {
			double trinn3 = (brutto / 100)* 13.4;
			System.out.println("Din trinnskatt er på" + trinn3 +"kr");
			
		}else if (brutto >= 969200 && brutto <= 1999999) {
			double trinn4 = (brutto / 100)* 16.4;
			System.out.println("Din trinnskatt er på" + trinn4 +"kr");
			
		}else if(brutto >= 2000000) {
			double trinn5 = (brutto / 100)* 17.4;
			System.out.println("Din trinnskatt er på " + trinn5 +"kr");
			
		}
		
		
	}

}
