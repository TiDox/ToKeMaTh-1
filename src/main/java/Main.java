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
    private static void binaerZuDezimal(char[] ausgangswert) {}
    private static char[] oktalZuDezimal(char[] ausgangswert) throws Exception {
        for (char ziffer : ausgangswert) {
            if (ziffer != '0' && ziffer != '1'&& ziffer != '2'
                    && ziffer != '3'&& ziffer != '4'&& ziffer != '5'
                    && ziffer != '6' && ziffer != '7') {
                throw new Exception("Die Zffern befinden sich nicht im Bereich von 0 - 7");
            }
        }
        int zaehler = 1;
        int ergebnis = 0;

        for (int a = ausgangswert.length - 1; a >= 0; a--) {
            int oktalZiffer = Character.getNumericValue(ausgangswert[a]);
            ergebnis += oktalZiffer * zaehler;
            zaehler = zaehler * 8;
        }
        return ("" + ergebnis).toCharArray();
    }
    private static void hexadezimalZuDezimal(char[] ausgangswert) {}

    // Umrechnung von Zwischenwert in Zielwert
    private static void dezimalZuBinaer(char[] zwischenwert) {}
    private static void dezimalZuOktal(char[] zwischenwert) {}
    private static void dezimalZuHexadezimal(char[] zwischenwert) {}
}
