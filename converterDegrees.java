package com.company;

import java.util.Scanner;
// programmed by @ysr075

public class converterDegrees {
    public static void main(String []args) {
        while(true) {
            float formCel = 1.8f;
            float formFah = 0.555_555_555_55f;
            int allDivider = 32;
            Scanner input = new Scanner(System.in);
            Integer choose;
            System.out.print("\n\n1.Celsius to Fahrenheit.\n2.Fahrenheit to Celsius\n: ");
            choose = input.nextInt();
            if (choose.equals(1)) {
                Integer Cel;
                System.out.print("\nCelsius: ");
                Cel = input.nextInt();
                System.out.print("\n" + ((Cel * formCel) + allDivider) + " Fahrenheit.");
            }
            if (choose.equals(2)) {
                Integer Fah;
                System.out.print("\nFahrenheit: ");
                Fah = input.nextInt();
                System.out.print("\n" + ((Fah - allDivider) * formFah) + " Celsius.");
            }
        }
    }
}
