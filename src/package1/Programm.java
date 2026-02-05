package package1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] x = felderErstellen(scn);

		int summe = summeRechnen(x);
		
		double durchschnitt = durchschnittRechnen(x);

		System.out.println("Array: " + Arrays.toString(x));
		System.out.println("Summe = " + summe);
		System.out.println("Durchschnitt = " + durchschnitt);

		scn.close();
	}

	public static int[] felderErstellen(Scanner scn) {
		
		System.out.println("Bitte geben Sie die Anzahl der Zahlen ein: ");
		int anzahl = scn.nextInt();
		
		int[] zahlen = new int[anzahl];
		
		Random zufall = new Random();
		
		for (int index = 0; index < zahlen.length; index = index + 1) {
			int zufallZahl = zufall.nextInt(1, 10);
			System.out.println("Die Zahl " + zufallZahl + " wurde generiert.");
			zahlen[index] = zufallZahl;
		}
		return zahlen;
	}

	public static int summeRechnen(int[] zahlen) {
		int summe = 0;

		if (zahlen != null) {
			int laenge = zahlen.length;

			for (int i = 0; i < laenge; i = i + 1) {
				summe = summe + zahlen[i];
			}
		}
		return summe;
	}

	public static double durchschnittRechnen(int[] zahlen) {

		double durchschnitt = 0;
		int summe = summeRechnen(zahlen);
		durchschnitt = (double) summe / zahlen.length;

		return durchschnitt;
	}

}
