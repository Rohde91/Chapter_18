package com.zaah;

public class Main {

    public static int pow(int x, int n) {
        int sum = 1;

        for (int i = 0; i < n; i++) {
            sum = sum * x;
        }
        return sum;
    }

    public static int fak(int n){

        int sum = 1;
        for (int i = 1; i <= n ; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int fib(int n){
        int fib1 = 0;
        int fib2 = 1;
        int fibvar;

        for (int i = 0; i < n-3; i++) {
            fibvar = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibvar;
        }
        int sum = fib1 + fib2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(fak(5));
        System.out.println(fib(3));
    }
}
