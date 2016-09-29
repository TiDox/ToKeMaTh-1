package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ausgangssystem;
        String ausgangswert;
        int zwischenwert;
        int zielwert;
        String zielsystem;
        Scanner input = new Scanner(System.in);

        System.out.println("Ausgangs-Zahlensystem: ");
        ausgangssystem = input.nextLine();

        System.out.println("Ausgangswert: ");
        ausgangswert = input.nextLine();

        System.out.println("Ziel-Zahlensystem: ");
        zielsystem = input.nextLine();

        //zwischenwert = toInteger(ausgangswert, ausgangssystem);
    }

    // Umrechnung von Ausgangswert in Zwischenwert
    private static char[] binaerZuDezimal(char[] ausgangswert) throws Exception {
        boolean kommaEnthalten = false;
        String zahl = "";
        for (char ziffer : ausgangswert) {
            zahl += ziffer;
            if (ziffer == ',') {
                kommaEnthalten = true;
            }
        }
        String[] number = zahl.split(",");
        if (number.length > 2) {
            throw new Exception("Der Wert beeinhaltet zu viele Kommastellen");
        }
        char[] partOne = number[0].toCharArray();
        double zwischenErgebnis = 0;
        double zaehler = 1;
        double ergebnis = 0;

        for (int a = partOne.length - 1; a >= 0; a--) {
            int oktalZiffer = Character.getNumericValue(partOne[a]);
            ergebnis += oktalZiffer * zaehler;
            zaehler = zaehler * 2;
        }
        if (kommaEnthalten) {
            zaehler = 1;
            char[] partTwo = number[1].toCharArray();
            for (int a = partTwo.length - 1; a >= 0; a--) {
                int oktalZiffer = Character.getNumericValue(partTwo[a]);
                zwischenErgebnis += oktalZiffer * zaehler;
                zaehler = zaehler * 2;
            }
            ergebnis += zwischenErgebnis / zaehler;
        }
        return ("" + ergebnis).toCharArray();
    }

    private static char[] oktalZuDezimal(char[] ausgangswert) throws Exception {
        boolean kommaEnthalten = false;
        String zahl = "";
        for (char ziffer : ausgangswert) {
            zahl += ziffer;
            if (ziffer == ',') {
                kommaEnthalten = true;
            }
        }
        String[] number = zahl.split(",");
        if (number.length > 2) {
            throw new Exception("Der Wert beeinhaltet zu viele Kommastellen");
        }
        char[] partOne = number[0].toCharArray();
        double zwischenErgebnis = 0;
        double zaehler = 1;
        double ergebnis = 0;

        for (int a = partOne.length - 1; a >= 0; a--) {
            int oktalZiffer = Character.getNumericValue(partOne[a]);
            ergebnis += oktalZiffer * zaehler;
            zaehler = zaehler * 8;
        }
        if (kommaEnthalten) {
            zaehler = 1;
            char[] partTwo = number[1].toCharArray();
            for (int a = partTwo.length - 1; a >= 0; a--) {
                int oktalZiffer = Character.getNumericValue(partTwo[a]);
                zwischenErgebnis += oktalZiffer * zaehler;
                zaehler = zaehler * 8;
            }
            ergebnis += zwischenErgebnis / zaehler;
        }
        return ("" + ergebnis).toCharArray();
    }
    private static void hexadezimalZuDezimal(char[] ausgangswert) {}

    // Umrechnung von Zwischenwert in Zielwert
    private static void dezimalZuBinaer(char[] zwischenwert) {}
    private static void dezimalZuOktal(char[] zwischenwert) {}
    private static void dezimalZuHexadezimal(char[] zwischenwert) {}
}
