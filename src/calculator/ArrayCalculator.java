package calculator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayCalculator {

	private static final int MIN_WERT = 1;
	private static final int MAX_WERT = 10;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] zahlen = erstelleZahlenArray(scanner);

			int summe = berechneSumme(zahlen);
			double durchschnitt = berechneDurchschnitt(zahlen);

			System.out.println("Array: " + Arrays.toString(zahlen));
			System.out.println("Summe = " + summe);
			System.out.println("Durchschnitt = " + durchschnitt);
		} catch (InputMismatchException e) {
			System.out.println("Ungültige Eingabe. Bitte eine ganze Zahl eingeben.");
		}
	}

	public static int[] erstelleZahlenArray(Scanner scanner) {
		System.out.println("Bitte geben Sie die Anzahl der Zahlen ein: ");
		int anzahl = scanner.nextInt();

		if (anzahl < 0) {
			throw new IllegalArgumentException("Anzahl darf nicht negativ sein.");
		}

		int[] zahlen = new int[anzahl];
		Random random = new Random();

		for (int index = 0; index < zahlen.length; index = index + 1) {
			int zufallsZahl = random.nextInt(MIN_WERT, MAX_WERT + 1);
			System.out.println("Die Zahl " + zufallsZahl + " wurde generiert.");
			zahlen[index] = zufallsZahl;
		}
		return zahlen;
	}

	public static int berechneSumme(int[] zahlen) {
		int summe = 0;

		if (zahlen != null) {
			for (int index = 0; index < zahlen.length; index = index + 1) {
				summe = summe + zahlen[index];
			}
		}
		return summe;
	}

	public static double berechneDurchschnitt(int[] zahlen) {
		if (zahlen == null || zahlen.length == 0) {
			return 0.0;
		}
		int summe = berechneSumme(zahlen);
		return (double) summe / zahlen.length;
	}
}

