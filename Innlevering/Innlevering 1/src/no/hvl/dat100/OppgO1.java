package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgO1 {

	public static void main(String[] args) {
			
			int trinn1 = 190350;
			int trinn2 = 267900;
			int trinn3 = 643800;
			int trinn4 = 969200;
			int trinn5 = 2000000;
			
			
			int bruttoinntekt = parseInt(showInputDialog("Bruttoinntekt: "));
			
			
			if (bruttoinntekt > trinn1 && bruttoinntekt < trinn2) {

				System.out.print("Du betalar 1,7% i skatt. Du betalar " + ((bruttoinntekt/100) * (1.7)) + " kr skatt");

			}	 
			else if (bruttoinntekt > trinn2 && bruttoinntekt < trinn3){
				
				System.out.print("Du betalar 4% i skatt. Du betalar " + ((bruttoinntekt/100) * (4)) + " kr skatt");
			
			} else if (bruttoinntekt > trinn3 && bruttoinntekt < trinn4){
				
				System.out.print("Du betalar 13,4% i skatt. Du betalar " + ((bruttoinntekt/100) * (13.4)) + " kr skatt");
			
			} else if (bruttoinntekt > trinn4 && bruttoinntekt < trinn5){
				
				System.out.print("Du betalar 16,4% i skatt. Du betalar " + ((bruttoinntekt/100) * (16.4)) + " kr skatt");
			
			}
		}

}