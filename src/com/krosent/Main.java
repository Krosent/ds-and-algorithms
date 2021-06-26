package com.krosent;

import com.krosent.Sorting.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbrs = List.of(353,1,3453,75,3,6,9,3);

        System.out.println(MergeSort.sort(numbrs));
    }
}
