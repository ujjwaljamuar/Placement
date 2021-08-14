package Sorting;

public class BubbleSort {

    /*
     * compare adjacent elements and swap
     */

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void isSwapped(int[] arr) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 4, 1, 5, 8, 9, 2, 3 };

        bs.print(arr);

        System.out.print("After Bubble Sort : ");
        bs.isSwapped(arr);
        bs.print(arr);
    }
}
