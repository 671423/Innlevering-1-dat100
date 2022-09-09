package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgO2 {

	public static void main(String[] args) {

		int antall = 0;

		for (antall = 1; antall <= 10; antall++) {

			int poeng = parseInt(showInputDialog("Poeng: "));

			if (poeng >= 90 && poeng <= 100) {

				System.out.println("Din karakter er A");

			} else if (poeng >= 80 && poeng <= 89) {

				System.out.println("Din karakter er B");

			} else if (poeng >= 60 && poeng <= 79) {

				System.out.println("Din karakter er C");

			} else if (poeng >= 50 && poeng <= 59) {

				System.out.println("Din karakter er D");

			} else if (poeng >= 40 && poeng <= 49) {

				System.out.println("Din karakter er E");

			} else if (poeng >= 0 && poeng <= 39) {

				System.out.println("Din karakter er F");

			}
			else {

				System.out.println("Ugyldig, skriv inn på nytt: ");
				antall = antall - 1;
			}
		}
	}
}