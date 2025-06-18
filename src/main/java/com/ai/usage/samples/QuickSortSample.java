package com.ai.usage.samples;

public class QuickSortSample {

    // This class demonstrates the Quick Sort algorithm in Java
    // Input: list of integers
    // Output: sorted list of integers
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function to place the pivot element at the correct position
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Initialize the index for smaller elements

        // Iterate through the array to rearrange elements
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++; // Increment the index for smaller elements

                // Swap the current element with the element at index i
                swap(arr, i, j);
            }
        }

        // Place the pivot element in its correct position
        swap(arr, i + 1, high);

        // Return the index of the pivot element
        return i + 1;
    }

    // Utility function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}