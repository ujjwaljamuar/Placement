package Sorting;

public class MergeSort {
    public void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    public void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low; // traverse left sortef subarray
        int j = mid + 1; // traverse right sortef subarray
        int k = low; // merge both array into original array.

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();

        int[] arr = new int[] { 7, 5, 8, 9, 6, 1, 4 };
        ms.printArr(arr);

        ms.sort(arr, new int[arr.length], 0, arr.length - 1);
        ms.printArr(arr);
    }
}
