/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorters;

import java.util.Comparator;

/**
 * This merge sort is a modified merge sort that is similar to the java
 * algorithm, so that we can still use the comparators that were previously
 * implemented.
 *
 * @author Youssef
 */
public class MergeSort {

    private final static int THRESHOLD = 7;

    private static void swap(Object[] person, int person1Index, int person2Index) {
        Object t = person[person1Index];
        person[person1Index] = person[person2Index];
        person[person2Index] = t;
    }

    public static void mergeSort(Object[] source, Object[] dest, int low, int high, int off,
            Comparator comparator) {
        int length = high - low;

        // Insertion sort on smallest arrays
        if (length < THRESHOLD) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && comparator.compare(dest[j - 1], dest[j]) > 0; j--) {
                    swap(dest, j, j - 1);
                }
            }
            return;
        }

        // Recursively sort halves of dest into source
        int destLow = low;
        int destHigh = high;
        low += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, source, low, mid, -off, comparator);
        mergeSort(dest, source, mid, high, -off, comparator);

        // If list is already sorted, just copy from source to dest.  This is an
        // optimization that results in faster sorts for nearly ordered lists.
        if (comparator.compare(source[mid - 1], source[mid]) <= 0) {
            System.arraycopy(source, low, dest, destLow, length);
            return;
        }

        // Merge sorted halves (now in source) into dest
        for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && comparator.compare(source[p], source[q]) <= 0) {
                dest[i] = source[p++];
            } else {
                dest[i] = source[q++];
            }
        }
    }
}
