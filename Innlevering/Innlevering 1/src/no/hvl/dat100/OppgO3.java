package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgO3 {

	public static void main(String[] args) {
		String tallin = showInputDialog("Skriv et heltall");
		long tall = parseInt(tallin);

		if (tall < 0) {
			showMessageDialog(null, "Ugyldig tall");
		} else {
			showMessageDialog(null, faktor(tall));
		}

	}

	public static long faktor(long n) {

		if (n == 1) {
			return 1;
		} else {
			return n * faktor(n - 1);
		}
	}
}