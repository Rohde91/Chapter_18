package com.zaah;

import java.util.Scanner;

public class Opgave_4 {
/*
    public static int count(String str, char a) {
        int result = 0;
        if (str.length() > 0) {
            result = count(str.substring(1), a) +
                    ((str.charAt(0) == a) ? 1 : 0);
        }
        return result;
    }
    */

    public static int count(String str, char a){
        // Sting skrives med ""
        // char skrives med ''
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        int times = count(s, ch);
        System.out.println(ch + " appears " + times +
                (times > 1 ? " times " : " time ") + "in " + s);

    }
    /*
    * Recursive er kommenteret ud, men gør følgende:
    * Selve programmet går ind og tæller mængden af et specifikt bogstav i en givet string.
    * Den sender de to inputs videre til count funktionen.
    * For hver gennemkørsel trækker man det første bogstav fra, og så gennemgår det igangværende String igen.
    * Denne process kører til der ikke er flere bogstaver tilbage.
    * Der efter kører den modsat for at checke efter om det passer og så sender den resultatet ud.
    * Den er på nuværende tidspunkt case-sensitive, hvilket muligvis kan ændres i koden.
    * */

}
