package BinarySearch;

public class BinarySearch {

    public int BinSearch(int[] num, int key) {
        int low = 0;
        int high = num.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (num[mid] == key) {
                System.out.println("Found Key at position " + mid);
                return mid;
            }
            if (key < num[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        System.out.println("Not Found.");
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] num = { 5, 10, 15, 20, 25 };
        bs.BinSearch(num, 15);
    }
}
