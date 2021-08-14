package Sorting;

public class InsertionSort {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insertionsrt(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];                              // shift
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = { 4, 7, 1, 5, 6 };

        is.printArray(arr);

        is.insertionsrt(arr);
        System.out.print("After insertion sort : ");
        is.printArray(arr);
    }
}
