package com.krosent.Sorting;

import java.util.ArrayList;
import java.util.List;

// Complexity:
// - Best: O(nlogn)
// - Average: O(nlogn)
// - Worst: O(n^2)
public class QuickSort {
    public static List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        ArrayList<Integer> lessThanPivot = new ArrayList<Integer>();
        ArrayList<Integer> greaterThanPivot = new ArrayList<Integer>();
        int pivot = list.get(0);
        int length = list.size();
        for (int i = 1; i < length; i++) {
            int currentValue = list.get(i);
            if (currentValue <= pivot) {
                lessThanPivot.add(currentValue);
            } else {
                greaterThanPivot.add(currentValue);
            }
        }
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        sortedList.addAll(sort(lessThanPivot));
        sortedList.add(pivot);
        sortedList.addAll(sort(greaterThanPivot));
        return sortedList;
    }
}
