package com.ai.usage.samples;

public class InsertionSortIncorrectSample {


    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    // the method is taken AS-IS from https://coderanch.com/t/636943/java/insertion-sort-inefficient
    // and it's somewhat incorrect
    public static void insertionSort(int[] unsortedArray) {
        int[] a = unsortedArray;// alias for the array
        int s = 0;  // index before which all elements are in order.
        int tmp = 0;    // temporary variable
        int last = a.length - 1;

        for (s = 0; s < last; s++) {    // for 1
            // Compare the element at s with elements at prior indexes.
            for (int i = 0; i < s; i++) {   // for 2
                if (a[s] > a[i]) {
                    tmp = a[s];
                    // shift elements before s to right by one index
                    for (int k = s; k > 0; k--) {   // for 3
                        a[k] = a[k - 1];
                    }
                    a[i] = tmp;
                }// if
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
