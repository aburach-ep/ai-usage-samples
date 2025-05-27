package com.ai.usage.samples;

import java.util.Arrays;

public class MergeSortExample {

    public static void main(String args[]) {
        int arr[] = {8, 5, 9, 1, 6, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    /**
     * How Merge Sort Works:
     * 1. Dividing the array into two halves.
     * 2. Recursively sorting each half.
     * 3. Merging the sorted halves back together
     */
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int arr[], int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int leftArray[] = new int[leftSize];
        int rightArray[] = new int[rightSize];

        for (int i = 0; i < leftSize; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < rightSize; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

}
