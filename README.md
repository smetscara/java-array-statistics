# Random Array Calculator

Ein Java-Programm, das ein Array mit Zufallszahlen erstellt und daraus Summe sowie Durchschnitt berechnet. Die Zufallszahlen liegen zwischen 1 und 10.

Dieses Projekt entstand als Aufgabe im Modul Programmieren 1 (1. Semester).

## Features

- Erstellung eines Arrays mit konfigurierbarer Länge
- Zufallszahlen im Bereich 1–10
- Berechnung von Summe und Durchschnitt
- Fehlerbehandlung bei ungültigen Eingaben (z.B. Buchstaben statt Zahlen)
- Schutz vor Division durch Null bei leerem Array
- Prüfung auf negative Array-Länge

## Ausführung

Das Projekt ist ein Eclipse-Projekt mit Java 21.

**Programm starten:**

- `ArrayCalculator` ausführen (enthält die `main`-Methode)
- Eine ganze Zahl für die gewünschte Array-Größe eingeben
- Die Ausgabe zeigt das Array sowie Summe und Durchschnitt

**Beispiel:**

```
Bitte geben Sie die Anzahl der Zahlen ein: 
5
Die Zahl 7 wurde generiert.
Die Zahl 3 wurde generiert.
Die Zahl 9 wurde generiert.
Die Zahl 2 wurde generiert.
Die Zahl 5 wurde generiert.
Array: [7, 3, 9, 2, 5]
Summe = 26
Durchschnitt = 5.2
```

## Tests

Dieses Projekt enthält keine Unit-Tests. Bei einer Weiterentwicklung wäre es sinnvoll, die Methoden `berechneSumme` und `berechneDurchschnitt` mit JUnit zu testen.

## Ausblick

Mir ist bewusst, dass sich am Programm noch einiges verbessern ließe. Ich finde es wichtig, solche Punkte zu erkennen und zu benennen – auch wenn die Umsetzung im Rahmen dieser Übungsaufgabe nicht im Fokus stand. Beispiele: Die Grenzen für die Zufallszahlen (1–10) könnten als Benutzereingabe konfigurierbar gemacht werden. Zusätzlich könnten weitere Statistiken wie Minimum, Maximum oder Median berechnet werden. Unit-Tests würden die Zuverlässigkeit bei Änderungen erhöhen.
