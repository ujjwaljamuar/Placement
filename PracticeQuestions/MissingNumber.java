public class MissingNumber {
    public static int MissingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
        int misNum = MissingNum(arr);
        System.out.println(misNum);
    }
}
