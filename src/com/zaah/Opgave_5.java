package com.zaah;

import java.util.Scanner;

public class Opgave_5 {

    public static int count(int[] numbers, int numb, int i){

        if (i == numbers.length-1){
            return -1;
        }
        else if (numbers[i] == numb){
            return i;
        }
        else {
            return search(numbers, numb, i);
        }
    }

    public static void main(String[] args) {

        int n, x, count = 0, i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange tal skal ind i array'et? ");
        n = input.nextInt();
        int numbers[] = new int[n];
        System.out.println("Hvilke tal skal ind i array'et? ");
        int
            
        }


    }

}
