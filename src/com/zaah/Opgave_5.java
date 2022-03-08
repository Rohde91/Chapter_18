package com.zaah;

import java.util.Scanner;

public class Opgave_5 {

    public static int count1 (int[] numbers,int number,int arrayLeangth){
        //int arraylength = numbers.length-1;
        int res = 0;
        if (arrayLeangth>0){
            res = count1(numbers, number, arrayLeangth-1)+((numbers[arrayLeangth-1]==number)?1:0);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers= {1,8,6,7,8,9,3};//7
        int length = numbers.length;
        System.out.println("indtast heltal ");
        int number = scan.nextInt();

        //System.out.println(count(numbers,number,0,0));
        System.out.println(count1(numbers, number, length));
            
    }
}
