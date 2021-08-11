public class MergeTwoSortedArrays {

    public void printArr1(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public void printArr2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public void printRes(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public void merge(int[] arr1, int[] arr2, int m, int n) {
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            result[k] = arr1[j];
            j++;
            k++;
        }
        printRes(result);

    }

    public static void main(String[] args) {
        MergeTwoSortedArrays mg = new MergeTwoSortedArrays();

        int[] arr1 = { 2, 4, 6, 8, 10, 12 };
        int[] arr2 = { 1, 3, 5, 7 };

        System.out.print("Array 1 : ");
        mg.printArr1(arr1);

        System.out.print("Array 2 : ");
        mg.printArr2(arr2);

        System.out.print("Merged Sorted Array : ");
        mg.merge(arr1, arr2, arr1.length, arr2.length);

    }
}
