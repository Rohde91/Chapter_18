package com.zaah;

import java.util.Scanner;

public class Opgave_6 {

    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high) {
        if (high >= 0) {
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("The reversal of " + s + " is ");
        reverseDisplay(s);
    }
    //TODO Forklar hvordan koden fungerer - dette kan ses ved at køre debugger på koden
}
