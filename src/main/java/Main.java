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
    private static void oktalZuDezimal(char[] ausgangswert) {}
    private static void hexadezimalZuDezimal(char[] ausgangswert) {}

    // Umrechnung von Zwischenwert in Zielwert
    private static void dezimalZuBinaer(char[] zwischenwert) {}
    private static void dezimalZuOktal(char[] zwischenwert) {}
    private static void dezimalZuHexadezimal(char[] zwischenwert) {}
}
