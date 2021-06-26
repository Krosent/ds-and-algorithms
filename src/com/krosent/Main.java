package com.krosent;

import com.krosent.Sorting.BubbleSort;
import com.krosent.Sorting.MergeSort;
import com.krosent.Sorting.QuickSort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbrs = List.of(353,1,3453,75,3,6,9,3);
        int[] numbers_arr = {353,1,3453,75,3,6,9,3};

        System.out.println("Not sorted list:");
        System.out.println(numbrs);

        System.out.println("Merge sort:");
        System.out.println(MergeSort.sort(numbrs));

        System.out.println("Quick sort:");
        System.out.println(QuickSort.sort(numbrs));

        System.out.println("Not sorted array:");
        System.out.println(Arrays.toString(numbers_arr));
        System.out.println("Buble sorted array:");
        System.out.println(Arrays.toString(BubbleSort.sort(numbers_arr)));

    }
}
