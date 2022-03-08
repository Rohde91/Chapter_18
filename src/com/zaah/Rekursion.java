package com.zaah;

public class Rekursion {

    public static int pow(int x, int n){
        if (n == 0){
            return 1;
        }
        else {
            return x*pow(x,n-1);
        }
    }

    public static int fak(int n){

        if ( n == 0){
            return 1;
        }
        else {
            return n * fak(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(fak(5));
    }

}
