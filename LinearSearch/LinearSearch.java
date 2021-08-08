public class LinearSearch {

    public int LiSearch(int[] arr,int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Found at postion " + i );
                return i;
            }

        }
        System.out.println("Not Found.");
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();

        int[] ar = {10,14,17,19,21,24,27};
        
        ls.LiSearch(ar, ar.length, 29);
    }
}
