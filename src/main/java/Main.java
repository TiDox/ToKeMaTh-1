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
}
