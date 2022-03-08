package com.zaah;

public class Opgave_7 {

    public static int reverceArray(int[] array, int size){
        if (size >= 0){
            System.out.println(array[size]);
            reverceArray(array, size - 1);
        }
        return size;
    }

    public static void reverceArray2(int[] array, int size){
        for (int i = size--; i > 0; i--) {
            System.out.println(array[i-1]);
        }
    }

    public static void main(String[] args) {

        int[] array = {5, 2, 3, 8, 4, 7};
        int size = array.length;
        reverceArray(array, size-1);
        System.out.println(" ");
        reverceArray2(array, size-1);

    }
}
