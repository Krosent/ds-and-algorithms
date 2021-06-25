package com.krosent.Sorting;

public class BubleSort {

    public static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
