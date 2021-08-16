package TwoSum;

import java.util.Arrays;

public class TwoSumII {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] twoSumII(int[] arr, int target) {
        // Sorting and Two Pointer
        Arrays.sort(arr); // 0 2 6 7 10 11
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public void arrayDemo() {
        int[] arr = { 1, 3, 6, 8, 2, 4, 7 };
        int[] result = twoSumII(arr, 9);
        printArray(result);
    }

    public static void main(String[] args) {
        TwoSumII ts = new TwoSumII();
        ts.arrayDemo();
    }
}
