public class SqaureSortedArray {
    public static void printArr(int[] arr){
        int n  = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortedSquare(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0 ,j = n - 1;
        for (int k = n-1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else{
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        printArr(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {-4 , -1 , 0 , 3, 10};

        SqaureSortedArray.printArr(arr1);

        SqaureSortedArray.sortedSquare(arr1);        
        
    }
}
