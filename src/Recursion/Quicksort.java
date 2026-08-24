
package Recursion;

import java.util.Arrays;

public class Quicksort {

    static void quickSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int p = partition(arr, s, e);

        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    static int partition(int[] arr, int s, int e) {
        int pivot = arr[s];
        int i = s;
        int j = e;

        while (i < j) {
            while (i <= e - 1 && arr[i] <= pivot) {
                i++;
            }

            while (j >= s + 1 && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[s];
        arr[s] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
