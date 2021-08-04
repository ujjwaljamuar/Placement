package Arrays;

public class MoveZeroesToEnd {

    public void demoArray() {
        int[] arr = { 2, 5, 0, 0, 3, 0, 5, 4, 8 };
        printArray(arr);
        System.out.println();

        moveZeroes(arr, arr.length);
        System.out.println("Afte moving zeroes : ");
        printArray(arr);
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void moveZeroes(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroesToEnd move = new MoveZeroesToEnd();
        move.demoArray();
    }
}
