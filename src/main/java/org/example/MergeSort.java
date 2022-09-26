package org.example;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr = {3,23,87,-2, -34, 2,-1,-4,5,7};

        int[] current = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        sort(left, right, arr, current);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort (int left, int right, int[] arr, int[] current) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(left, mid, arr, current);
            sort(mid + 1, right, arr, current);
            merge(left, right, mid, arr, current);

        }
    }
    public static void merge (int left, int right, int mid, int[] arr, int[] current) {
        int i = 0;
        int j = left;
        int k = mid + 1;

        while (j <= mid && k <= right) {
            if (arr[j] < arr[k]) {
                current[i] = arr[j];
                i++;
                j++;
            } else {
                current[i] = arr[k];
                i++;
                k++;
            }
        }

        while (j <= mid) {
            current[i] = arr[j];
            i++;
            j++;
        }

        while (k <= right) {
            current[i] = arr[k];
            i++;
            k++;
        }

        for (int t = 0; t < i; t++) {
            arr[left + t] = current[t];
        }
    }
}
