
public class ResizeArray {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] Resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        ResizeArray re = new ResizeArray();

        int[] original = new int[] { 1, 2, 3, 4, 5 };
        System.out.print("Original Array : ");
        re.printArray(original);
        System.out.println("The size of original array is : " + original.length);

        System.out.println();

        original = re.Resize(original, 10);
        System.out.println("The size of ReSized array is : " + original.length);
        System.out.print("New array is : ");
        re.printArray(original);

    }
}
