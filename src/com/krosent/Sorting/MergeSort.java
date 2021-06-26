package com.krosent.Sorting;

import java.util.ArrayList;
import java.util.List;

// Merge sort algorithm used with array lists.
// Complexity:
// - Best: O(nlogn)
// - Average: O(nlogn)
// - Worst: O(nlogn)
public class MergeSort {
    public static List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int middleIndex = list.size() / 2;
        List<Integer> leftList =
                sort(list.subList(0, middleIndex));
        List<Integer> rightList =
                sort(list.subList(middleIndex, list.size()));
        List<Integer> sortedList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        int leftLength = leftList.size();
        int rightLength = rightList.size();
        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (leftList.get(leftIndex) < rightList.get(rightIndex)) {
                sortedList.add(leftList.get(leftIndex));
                leftIndex++;
            } else {
                sortedList.add(rightList.get(rightIndex));
                rightIndex++;
            }
        }
        sortedList.addAll(leftList.subList(leftIndex, leftLength));
        sortedList.addAll(rightList.subList(rightIndex, rightLength));
        return sortedList;
    }

}
