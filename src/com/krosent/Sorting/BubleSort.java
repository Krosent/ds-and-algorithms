package com.krosent.Sorting;

public class BubleSort {

    private static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static int[] sort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
        return arr;
    }
}
